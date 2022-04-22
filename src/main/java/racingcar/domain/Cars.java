package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String NAME_DELIMITER = ",";
    private final List<Car> values;

    public Cars(String input) {
        List<Car> cars = new ArrayList<>();

        for (String carName : input.split(NAME_DELIMITER)) {
            cars.add(new Car(carName));
        }

        this.values = cars;
    }

    public Cars(List<Car> values) {
        this.values = values;
    }

    public List<Car> getValues() {
        return values;
    }
}
