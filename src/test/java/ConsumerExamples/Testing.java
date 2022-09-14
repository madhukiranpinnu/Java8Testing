package ConsumerExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Testing {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> list=driver.findElements(By.xpath("//a"));
        list.forEach(e-> System.out.println(e.getText()));
        driver.quit();
    }
}
