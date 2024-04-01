public class Tennis {
    private int firstPlayerTimes;

    public String score() {
        if (firstPlayerTimes == 1) {
            return "fifteen love";
        }
        return "love all";
    }

    public void firstPlayScore() {
        firstPlayerTimes++;
    }
}
