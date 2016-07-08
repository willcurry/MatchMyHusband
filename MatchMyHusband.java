import java.util.ArrayList;

public class MatchMyHusband {
    public static String isMatch() {
        return "Match";
    }

    public static ArrayList<Man> men = new ArrayList<>();

    public static String findMatch(Women women) {
        for (int i=0; i < men.size(); i++) {
            int manUsefulness = men.get(i).getCooking() + men.get(i).getCleaning() + men.get(i).getChildCare();
            if (manUsefulness == women.womenGetNeed()) {
               return String.format("Your match is %s", men.get(i).manGetName());
            }
        }
        return "No match found!";
    }

    public static String addWomen(int needs, String name) {
        Women women = new Women(needs, name);
        findMatch(women);
        return women.womenGetNeed() + women.womenGetName();
    }

    public static String addMan(int cooking, int cleaning, int childCare, String name) {
        Man man = new Man(cooking, cleaning, childCare, name);
        men.add(man);
        return man.getCooking() + man.getCleaning() + man.getChildCare() + man.manGetName();
    }

    public static int reduceWomensNeed(Women women, int months) {
        for (int i=0; i < months; i++) {
            int currentNeed = women.womenGetNeed();
            women.womenSetNeed(currentNeed *= 0.85);
        }
        return women.womenGetNeed();
    }
}