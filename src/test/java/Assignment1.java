import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Assignment1 {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> links=driver.findElements(By.xpath("//a"));
        List<String> linkText=new ArrayList<>();
        for(WebElement link:links){
            if(!link.getText().isBlank()){
                linkText.add(link.getText());
            }
        }
        List<String> distict=new ArrayList<>(new HashSet<>(linkText));
        Collections.sort(distict);
        for(String d:distict){
            if(d.startsWith("D")||d.startsWith("C")) {
                System.out.println(d);
            }
        }
    }
}
