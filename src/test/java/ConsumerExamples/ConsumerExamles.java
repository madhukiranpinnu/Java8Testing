package ConsumerExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExamles {
    public static void main(String args[]) {
        List<String> list =Arrays.asList("Madhu","Kiran","Pinnu");
        Consumer<String> consumer=s-> System.out.println(s.toLowerCase());
        Consumer<String> consumer1=s-> System.out.println(s.toUpperCase());
        list.forEach(consumer);
        //or
        list.forEach(s-> System.out.println(s.toLowerCase()));
        //We can pass two consumer or more with and Then
        list.forEach(consumer.andThen(consumer1));
    }
}
