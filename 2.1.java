public static void main(String[] args) throws IOException {
    System.out.println(prettyPrintJson(jsonObject, 0));
}
public static String prettyPrintJson(JsonObject jsonObject, int indent) {
    String indentStr = getIndentStr(indent);
    String prettyJson = indentStr + "{";
    for (String key : jsonObject.keySet()) {
        prettyJson += "\n";
        prettyJson += indentStr + "  \"" + key + "\": ";
        try {
            JsonArray jsonArray = jsonObject.get(key).asJsonArray();
            prettyJson += "\n" + indentStr + "  [";
            for (JsonValue element : jsonArray) {
                prettyJson += "\n" + prettyPrintJson(element.asJsonObject(), indent + 4);
                prettyJson += ",";
            }
            prettyJson = prettyJson.substring(0, prettyJson.length() - 1);
            prettyJson += "\n" + indentStr + "  ]";
        } catch (Exception e) {
            try {
                prettyJson += "\n" + prettyPrintJson(jsonObject.get(key).asJsonObject(), indent + 2);
            } catch (Exception ee) {
                prettyJson += jsonObject.get(key).toString();
            }
        }
        prettyJson += ",";
    }
    prettyJson = prettyJson.substring(0, prettyJson.length() - 1);
    prettyJson += "\n" + indentStr + "}";
    return prettyJson;
}
public static String getIndentStr(int indent) {
    String indentStr = "";
    for (int i = 0; i < indent; i++) {
        indentStr += " ";
    }
    return indentStr;
}