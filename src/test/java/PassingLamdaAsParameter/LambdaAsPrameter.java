package PassingLamdaAsParameter;

import java.util.function.Consumer;

public class LambdaAsPrameter {
    public static void main(String args[]){
        StrinOperator(s-> System.out.println(s.toLowerCase()),"MADHUKIRAN");
        StrinOperator(s-> System.out.println(s.toUpperCase()),"madhukiran");
    }
    public  static void StrinOperator(Consumer<String> consumer, String temp){
        consumer.accept(temp);
    }
}
