package BiConsumerConsumerExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example {
    public static void main(String args[]) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("C:\\Users\\madhu\\Java8\\src\\test\\java\\BiConsumerConsumerExamples\\con.properties"));
        properties.forEach((k,v)-> System.out.println(k+""+v));
        //Consumer:
        properties.keySet().forEach(k-> System.out.println(k+""+properties.getProperty(k.toString())));

    }
}
