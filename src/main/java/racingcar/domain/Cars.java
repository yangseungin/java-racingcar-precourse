package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String NAME_DELIMITER = ",";
    private final List<Car> value;

    public Cars(String input) {
        List<Car> cars = new ArrayList<>();

        for (String carName : input.split(NAME_DELIMITER)) {
            cars.add(new Car(carName));
        }

        this.value = cars;
    }

    public Cars(List<Car> value) {
        this.value = value;
    }

    public List<Car> getValue() {
        return value;
    }
}
