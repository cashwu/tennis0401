import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTests {

    private final Tennis tennis = new Tennis();

    @Test
    public void love_all() {

        scoreShouldBe("love all");
    }

    @Test
    public void fifteen_love() {

        givenFirstPlayScore(1);
        scoreShouldBe("fifteen love");
    }

    @Test
    public void thirty_love() {

        givenFirstPlayScore(2);
        scoreShouldBe("thirty love");
    }

    @Test
    public void forty_love() {

        givenFirstPlayScore(3);
        scoreShouldBe("forty love");
    }

    @Test
    public void love_fifteen() {

        giveSecondPlayerScore(1);
        scoreShouldBe("love fifteen");
    }

    @Test
    public void love_thirty() {

        giveSecondPlayerScore(2);
        scoreShouldBe("love thirty");
    }

    @Test
    public void fifteen_all() {

        giveSecondPlayerScore(1);
        givenFirstPlayScore(1);
        scoreShouldBe("fifteen all");
    }

    @Test
    public void thirty_all() {

        giveSecondPlayerScore(2);
        givenFirstPlayScore(2);
        scoreShouldBe("thirty all");
    }

    private void giveSecondPlayerScore(int times) {
        for (int i = 0; i < times; i++) {

            tennis.secondPlayerScore();
        }

    }

    private void givenFirstPlayScore(int times) {
        for (int i = 0; i < times; i++) {

            tennis.firstPlayScore();
        }
    }

    private void scoreShouldBe(String expected) {
        Assertions.assertEquals(expected, tennis.score());
    }
}
