public class Women {

    private int need;
    private String name;

    public Women(int need, String name) {
        womenSetNeed(need);
        womenSetName(name);
    }

    public void womenSetNeed(int need) {
       this.need = need;
    }

    public void womenSetName(String name) {
        this.name = name;
    }

    public int womenGetNeed() {
        return this.need;
    }

    public String womenGetName() {
        return this.name;
    }
}
