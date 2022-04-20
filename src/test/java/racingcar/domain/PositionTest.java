package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    private Position position;

    @BeforeEach
    void setup() {
        position = new Position();
    }

    @DisplayName("위치의 초기값은 0")
    @Test
    void create_position() {
        assertThat(position.getValue()).isEqualTo(0);
    }

    @DisplayName("위치는 1씩 증가한다.")
    @ParameterizedTest
    @ValueSource(ints = {5, 7})
    void position_is_incremented_by_1(int count) {
        for (int i = 0; i < count; i++) {
            position.increase();
        }

        assertThat(position.getValue()).isEqualTo(count);
    }

    @DisplayName("위치 비교는 equals로 동등성을 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {5, 7})
    void equals(int count) {
        Position anotherPosition = new Position();
        for (int i = 0; i < count; i++) {
            position.increase();
            anotherPosition.increase();
        }

        assertThat(position).isEqualTo(anotherPosition);
    }

}
