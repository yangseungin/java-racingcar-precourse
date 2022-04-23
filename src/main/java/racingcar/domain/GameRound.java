package racingcar.domain;

public class GameRound {
    private final int value;
    private static final int MIN_ROUND = 1;

    public GameRound(String repeatNumber) {
        validRepeatNumber(repeatNumber);
        this.value = Integer.parseInt(repeatNumber);
    }

    private void validRepeatNumber(String repeatNumber) {
        try {
            Integer.parseInt(repeatNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 회수는 숫자여야합니다.");
        }

        if (Integer.parseInt(repeatNumber) < MIN_ROUND) {
            throw new IllegalArgumentException("게임 라운드는 1보다 작을 수 없습니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
