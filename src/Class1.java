import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Class1 {
    WebDriver driver;
    @BeforeClass
    void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Amandeep\\\\Desktop\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
    }
    @Test
    void titleTest() {
        System.out.println("Title of the phptravels website is: " + driver.getTitle());
        Assert.assertEquals("Demo Script Test drive - PHPTRAVELS", driver.getTitle(), "Title is not proper or either not matching");
    }
    @Test
    void logoTest() {
        WebElement logoObject = driver.findElement(By.tagName("img"));
        Assert.assertTrue(logoObject.isDisplayed(),"Logo is not displayed");
    }
}





