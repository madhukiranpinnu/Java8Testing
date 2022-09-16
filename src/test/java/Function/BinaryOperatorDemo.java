package Function;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static BinaryOperator<Integer> add=(a,b)->a+b;
    public static void main(String args[]){
        System.out.println(add.apply(67, 89));
    }
}
