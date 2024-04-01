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


        tennis.firstPlayScore();
        scoreShouldBe("fifteen love");
    }

    private void scoreShouldBe(String expected) {
        Assertions.assertEquals(expected, tennis.score());
    }
}
