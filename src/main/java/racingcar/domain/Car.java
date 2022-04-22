package racingcar.domain;

public class Car {
    private final Name name;
    private final Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            position.increase();
        }

    }
}
