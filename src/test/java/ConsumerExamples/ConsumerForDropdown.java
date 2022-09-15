package ConsumerExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Consumer;

public class ConsumerForDropdown {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement select=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
        selectDropdownMethod(e->e.selectByIndex(2),select);
        driver.quit();
    }
    private static void selectDropdownMethod(Consumer<Select> consumer, WebElement element){
        consumer.accept(new Select(element));
    }
}
