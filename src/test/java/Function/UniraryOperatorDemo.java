package Function;

import java.util.function.UnaryOperator;

public class UniraryOperatorDemo {
    public static UnaryOperator<Integer> div=s->s/10;
    public static void main(String args[]){
        System.out.println(div.apply(400));
    }
}
