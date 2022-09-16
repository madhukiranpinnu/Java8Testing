package Function;

import java.util.function.Function;

public class SingleFunction {
    public static Function<Integer,Integer> add4=s->s+4;
    public static Function<Integer,Integer> mul4=s->s*4;
    public static void main(String args[]){
        System.out.println(add4.apply(7));
        System.out.println(mul4.apply(5));
        //andThen
        System.out.println(add4.andThen(mul4).apply(5));
        //compose
        System.out.println(add4.compose(mul4).apply(5));
    }
}
