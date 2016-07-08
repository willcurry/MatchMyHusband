import java.util.ArrayList;

public class MatchMyHusband {
    public static String isMatch() {
        return "Match";
    }

    public static ArrayList<Man> men = new ArrayList<>();

    public static String findMatch(Woman woman) {
        for (int i=0; i < men.size(); i++) {
            int manUsefulness = men.get(i).getCooking() + men.get(i).getCleaning() + men.get(i).getChildCare();
            if (manUsefulness == woman.need()) {
               return String.format("Your match is %s", men.get(i).manGetName());
            }
        }
        return "No match found!";
    }

    public static String addWoman(Woman woman) {
        return woman.need() + woman.name();
    }

    public static String addMan(int cooking, int cleaning, int childCare, String name) {
        Man man = new Man(cooking, cleaning, childCare, name);
        men.add(man);
        return man.getCooking() + man.getCleaning() + man.getChildCare() + man.manGetName();
    }

}
