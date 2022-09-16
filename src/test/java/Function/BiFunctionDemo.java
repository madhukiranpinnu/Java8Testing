package Function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static BiFunction<Integer,Integer,Boolean> biFunction=(a,b)->a>b;
    public static void main(String args[]){
        System.out.println(biFunction.apply(20, 30));
    }
}
