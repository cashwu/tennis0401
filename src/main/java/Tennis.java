import java.util.HashMap;

public class Tennis {
    private final HashMap<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(0, "love");
        put(1, "fifteen");
        put(2, "thirty");
        put(3, "forty");
    }};
    private int firstPlayerScoreTimes;
    private int secondPlayerScoreTimes;

    public String score() {
        if (isScoreDifferent()) {
            return lookupScore();
        }

        return sameScore();
    }

    private boolean isScoreDifferent() {
        return secondPlayerScoreTimes != firstPlayerScoreTimes;
    }

    private String lookupScore() {
        return String.format("%s %s", scoreLookup.get(firstPlayerScoreTimes), scoreLookup.get(secondPlayerScoreTimes));
    }

    private String sameScore() {
        return scoreLookup.get(firstPlayerScoreTimes) + " all";
    }

    public void firstPlayScore() {
        firstPlayerScoreTimes++;
    }

    public void secondPlayerScore() {
        secondPlayerScoreTimes++;
    }
}
