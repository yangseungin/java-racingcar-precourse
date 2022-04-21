package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차 생성")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun"})
    void create_car(String name) {
        Car car = new Car(new Name(name));

        assertThat(car.getName()).isEqualTo(new Name(name));
        assertThat(car.getPosition()).isEqualTo(new Position());
    }
}
