import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Saucedemo {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000); // Pause for recording visibility

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        // Add product to cart and proceed to checkout
        driver.findElement(By.id("item_4_title_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn_inventory")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        // Enter checkout details
        driver.findElement(By.id("first-name")).sendKeys("Gayandi");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Panditharathna");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("71500");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);

        // Logout
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
        Thread.sleep(2000);

        // Close browser
        driver.quit();
        System.out.println("Test completed successfully.");
    }
}
