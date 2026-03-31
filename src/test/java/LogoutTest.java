import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest {

    @Test
    public void testLogout() {

        // ✅ Chrome options to avoid popup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Open menu
        driver.findElement(By.id("react-burger-menu-btn")).click();

        // Small wait (menu animation)
        try { Thread.sleep(1000); } catch (Exception e) {}

        // Click logout
        driver.findElement(By.id("logout_sidebar_link")).click();

        // Validate login page visible
        boolean isLoginVisible = driver.findElement(By.id("login-button")).isDisplayed();

        Assert.assertTrue(isLoginVisible, "❌ Logout Failed!");

        System.out.println("✅ Logout Test Passed");

        driver.quit();
    }
}