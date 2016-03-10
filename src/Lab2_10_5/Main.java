package Lab2_10_5;

/**
 * Created by R2-D2 on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        NumIntWrapper numIntWrapper = new NumIntWrapper(5);
        NumIntWrapper numIntWrapper1 = new NumIntWrapper(9);
        NumIntWrapper newNumIntWrapper = compute(numIntWrapper,numIntWrapper1);
        assert newNumIntWrapper.getValue() == new NumIntWrapper(14).getValue():"Not correct value of newNumIntWrapper"; // will be OK
        System.out.println("Everything OK");
        assert newNumIntWrapper.getValue() == new NumIntWrapper(1).getValue():"Not correct value of newNumIntWrapper"; //will be AssertionError
    }
    private static NumIntWrapper compute(NumIntWrapper a, NumIntWrapper b){
        int value = a.getValue()+b.getValue();
        return new NumIntWrapper(value);
    }
}
