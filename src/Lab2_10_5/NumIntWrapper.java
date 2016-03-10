package Lab2_10_5;

/**
 * Created by R2-D2 on 10.03.2016.
 */
public class NumIntWrapper {
    private int value;

    public NumIntWrapper(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumIntWrapper that = (NumIntWrapper) o;

        return value == that.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

    public int getValue() {
        return value;
    }
}
