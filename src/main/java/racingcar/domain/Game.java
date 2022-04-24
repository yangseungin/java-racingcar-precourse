package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;

public class Game {
    private Cars cars;

    public Game() {
    }

    public void play() {
        System.out.println("경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        cars = new Cars(input);
        System.out.println("시도할 회수는 몇회인가요?");
        String repeatNumber = Console.readLine();
        GameRound gameRound = new GameRound(repeatNumber);

        for (int i = 0; i < gameRound.getValue(); i++) {
            cars.allCarsMove(new RandomMoveStrategy());
            printGameRoundResult(cars);
        }
        //TODO 실행결과 출력 필요
    }

    private void printGameRoundResult(Cars cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars.getValues()) {
            sb.append(car.getPositionMessage()).append("\n");
        }
        System.out.println(sb);
    }
}
