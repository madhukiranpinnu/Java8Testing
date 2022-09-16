package Function;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {
    private static final DoubleFunction<String> doubleFunction= s-> String.valueOf(s);
    public static void main(String args[]){
        System.out.println(doubleFunction.apply(Double.parseDouble("78.89")));
    }
}
