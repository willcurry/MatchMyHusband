public class Man {

    public int cooking;
    public int cleaning;
    public int childCare;
    public String name;


    public Man(int cooking, int cleaning, int childCare, String name) {
        setCooking(cooking);
        setChildCare(childCare);
        setCleaning(cleaning);
        setName(name);
    }

    public void setChildCare(int childCare) {
        this.childCare = childCare;
    }

    public void setCleaning(int cleaning) {
        this.cleaning = cleaning;
    }

    public void setCooking(int cooking) {
        this.cooking = cooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCooking() {
        return this.cooking;
    }

    public int getCleaning() {
        return this.cleaning;
    }

    public int getChildCare() {
        return this.childCare;
    }
}
