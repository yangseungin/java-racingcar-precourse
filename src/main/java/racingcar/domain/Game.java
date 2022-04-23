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
            //TODO cars에서 car들이 모두 move를 시도하는 메소드 필요
        }
        //TODO 실행결과 출력 필요
    }
}
