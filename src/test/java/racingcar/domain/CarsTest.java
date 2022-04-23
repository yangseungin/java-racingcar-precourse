package racingcar.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi,woni,jun", "yang,SVC"})
    void 자동차들을_생성한다(String names) {
        Cars cars = new Cars(names);
        List<Car> carValue = cars.getValues();
        String[] namesArray = names.split(",");

        assertThat(carValue.size())
                .isEqualTo(namesArray.length);

        for (int i = 0; i < carValue.size(); i++) {
            assertThat(carValue.get(i)).isEqualTo(new Car(namesArray[i]));
        }
    }
}
