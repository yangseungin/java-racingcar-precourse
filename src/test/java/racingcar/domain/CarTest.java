package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차 생성")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun"})
    void create_car(String name) {
        Car car = new Car(name);

        assertThat(car.getName()).isEqualTo(new Name(name));
        assertThat(car.getPosition()).isEqualTo(new Position());
    }

    @DisplayName("자동차는 한칸 이동할 수 있다.")
    @Test
    void move_car() {
        Car car = new Car("yang");
        car.move(() -> true);

        Position movedPosition = new Position();
        movedPosition.increase();
        assertThat(car.getPosition()).isEqualTo(movedPosition);
    }

    @DisplayName("자동차는 이동하지 않을 수 있다.")
    @Test
    void not_move_car() {
        Car car = new Car("yang");
        car.move(() -> false);

        Position movedPosition = new Position();
        assertThat(car.getPosition()).isEqualTo(movedPosition);
    }
}
