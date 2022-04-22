package racingcar.domain;

import org.junit.platform.commons.util.StringUtils;

import java.util.Objects;

public class Name {
    private static final int MAX_NAME_LENGTH = 5;
    private final String value;

    public Name(String value) {
        if (StringUtils.isBlank(value)) {
            throw new IllegalArgumentException("[ERROR] 이름은 빈 값이 올 수 없습니다.");
        }

        if (value.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자리 이하여야 합니다.");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
