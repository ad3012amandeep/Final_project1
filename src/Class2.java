import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
import java.util.PriorityQueue;
public class Class2 {
    WebDriver driver;

    @BeforeClass
    void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Amandeep\\\\Desktop\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
    }

    @Test
    void Button() {
        List<WebElement> button = driver.findElements(By.tagName("button"));
        System.out.println("Button:" + button.size());
    }

    @Test
    void Image() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("images:" + images.size());
    }

}
