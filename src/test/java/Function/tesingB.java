package Function;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tesingB {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement s=driver.findElement(By.name("q"));
        ((JavascriptExecutor)driver) .executeScript( "document.getElementsByClassName('gLFyf gsfi' )[0].remove(); ");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until((d)->
        {
            d.navigate().refresh();
            return d.findElement(By.name("q"));
        }).sendKeys("madhu");
    }
}
