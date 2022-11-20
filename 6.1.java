public class 6.1 {

    private Integer ram;
    private Integer os;
    private Integer hdd;


    public NoteBook() {
    }

    public NoteBook(Integer ram, Integer os, Integer hdd) {
        this.ram = ram;
        this.res = os;
        this.hdd = hdd;
    }

    @Override
    public String toString(){
        return "Notebook: " + "RAM: "+ ram+  "GB, HDD: " +hdd+ "GB, OS: " + os + "p";

 }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRes() {
        return os;
    }

    public void setRes(Integer res) {
        this.os = os;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }
}