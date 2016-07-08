public class Man {
    public int cooking;
    public int cleaning;
    public int childCare;
    public String name;

    public Man(int cooking, int cleaning, int childCare, String name) {
        cooking(cooking);
        childCare(childCare);
        cleaning(cleaning);
        manName(name);
    }

    private void childCare(int childCare) {
        this.childCare = childCare;
    }

    private void cleaning(int cleaning) {
        this.cleaning = cleaning;
    }

    private void cooking(int cooking) {
        this.cooking = cooking;
    }

    private void name(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public int cooking() {
        return this.cooking;
    }

    public int cleaning() {
        return this.cleaning;
    }

    public int childCare() {
        return this.childCare;
    }
}
