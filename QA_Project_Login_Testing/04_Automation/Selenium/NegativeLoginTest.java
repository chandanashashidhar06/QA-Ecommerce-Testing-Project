import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLoginTest {
    public static void main(String[] args) {

        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Enter valid username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter wrong password
        driver.findElement(By.id("password")).sendKeys("wrong_password");

        // Click Login
        driver.findElement(By.id("login-button")).click();

        // Check if error message is displayed
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        System.out.println("Error Message Displayed: " + errorMessage);

        // Wait for 5 seconds so you can see result
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
