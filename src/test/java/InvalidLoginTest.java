import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest {

    @Test
    public void testInvalidLogin() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Wrong login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        // Validation (Error message)
        boolean isErrorDisplayed = driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed();

        Assert.assertTrue(isErrorDisplayed, "❌ Error message NOT displayed!");

        System.out.println("✅ Negative Test Passed");

        driver.quit();
    }
}