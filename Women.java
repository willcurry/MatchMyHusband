public class Women {

    private int need;
    private String name;

    public Women(int need, String name) {
        setNeed(need);
        setName(name);
    }

    public void setNeed(int need) {
       this.need = need;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNeed() {
        return this.need;
    }

    public String getName() {
        return this.name;
    }
}
