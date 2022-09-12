import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Java8 {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        driver.findElements(By.xpath("//a"))
                .stream()
                .map(e->e.getText())
                .filter(e->!e.isBlank())
                .distinct()
                .sorted()
                .filter(e->e.startsWith("C")||e.startsWith("D"))
                .forEach(e-> System.out.println(e));
        driver.quit();

    }
}
