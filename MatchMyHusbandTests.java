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
    public void womanCanSignUp() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        assertThat(matchMyHusband.addWoman(new Woman(100, "Nina")), is("100Nina"));
    }

    @Test
    public void menCanSignUp() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        assertThat(matchMyHusband.addMan(25, 25, 50, "Bill"), is("100Bill"));
    }

    @Test
    public void canFindMatch() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        matchMyHusband.addMan(25, 25, 50, "Bill");
        Woman woman = new Woman(100, "Nina");
        assertThat(matchMyHusband.findMatch(woman), is("Your match is Bill"));
    }

    @Test
    public void cantFindMatch() {
        MatchMyHusband matchMyHusband = new MatchMyHusband();
        matchMyHusband.addMan(1, 1, 1, "Gary");
        Woman woman = new Woman(100, "Nina");
        assertThat(matchMyHusband.findMatch(woman), is("No match found!"));
    }

    @Test
    public void decreaseWomanNeed() {
        Woman woman = new Woman(100, "Nina");
        assertThat(woman.reduceNeed(2), is(72));
    }
}
