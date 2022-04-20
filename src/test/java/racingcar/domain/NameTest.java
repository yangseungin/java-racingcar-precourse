package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {


    @DisplayName("정상적이 이름 생성 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun"})
    void create_name(String name) {
        Name carName = new Name(name);
        assertThat(carName.getValue()).isEqualTo(name);
    }

    @DisplayName("이름이 5글자 초과이면 IllegalArgumentException 발생")
    @ParameterizedTest
    @ValueSource(strings = {"yangname"})
    void name_length_not_allow(String name) {
        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 이름은 5자리 이하여야 합니다.");
    }

    @DisplayName("이름 비교는 equals로 동등성을 확인한다.")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun"})
    void equals(String name) {
        assertThat(new Name(name)).isEqualTo(new Name(name));
    }

}
