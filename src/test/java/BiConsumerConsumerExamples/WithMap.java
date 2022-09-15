package BiConsumerConsumerExamples;

import java.util.HashMap;
import java.util.Map;

public class WithMap {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"madhu");
        map.put(2,"kiran");
        map.put(3,"pinnu");
        map.entrySet().forEach(k-> System.out.println(k.getKey()+""+k.getValue()));
    }
}
