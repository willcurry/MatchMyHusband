public class Woman {

    private int need;
    private String name;

    public Woman(int need, String name) {
        need(need);
        name(name);
    }

    private void need(int need) {
       this.need = need;
    }

    private void name(String name) {
        this.name = name;
    }

    public int need() {
        return this.need;
    }

    public String name() {
        return this.name;
    }

    public static int reduceNeed(int months) {
        for (int i=0; i < months; i++) {
            int currentNeed = woman.need();
            woman.need(currentNeed *= 0.85);
        }
        return woman.need();
    }
}
