import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Validation: Check if Products page is displayed
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {
            System.out.println("TEST PASSED: Login Successful, Products page displayed.");
        } else {
            System.out.println("TEST FAILED: Login not successful.");
        }

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

