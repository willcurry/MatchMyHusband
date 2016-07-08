import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatchMyHusbandTests {
    @Test
    public void returnsMatch() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        assertThat(matchMyHusband.isMatch(), is("Match"));
    }

    @Test
    public void womenCanSignUp() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        assertThat(matchMyHusband.addWomen(100, "Nina"), is("100Nina"));
    }

    @Test
    public void manCanSignUp() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        assertThat(matchMyHusband.addMan(25, 25, 50, "Bill"), is("100Bill"));
    }

    @Test
    public void canFindMatch() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        matchMyHusband.addMan(25, 25, 50, "Bill");
        Women women = new Women(100, "Nina");
        assertThat(matchMyHusband.findMatch(women), is("Your match is Bill"));
    }

    @Test
    public void cantFindMatch() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        matchMyHusband.addMan(1, 1, 1, "Gary");
        Women women = new Women(100, "Nina");
        assertThat(matchMyHusband.findMatch(women), is("No match found!"));

    }

    @Test
    public void decreaseWomenNeed() {
        Women women = new Women(100, "Nina");
        assertThat(women.reduceWomensNeed(women, 2), is(72));
    }
}
