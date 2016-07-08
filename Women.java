public class Women {

    private int need;
    private String name;

    public Women(int need, String name) {
        setNeed(need);
        setName(name);
    }

    private void setNeed(int need) {
       this.need = need;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getNeed() {
        return this.need;
    }

    public String getName() {
        return this.name;
    }

    public int reduceWomensNeed(Women women, int months) {
        for (int i=0; i < months; i++) {
            int currentNeed = women.getNeed();
            women.setNeed(currentNeed *= 0.85);
        }
        return women.getNeed();
    }
}
