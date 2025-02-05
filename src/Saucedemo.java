import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Saucedemo {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();

        // Add product to cart and proceed to checkout
        wait.until(ExpectedConditions.elementToBeClickable(By.id("item_4_title_link"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn_inventory"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("shopping_cart_container"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();

        // Enter checkout details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys("Gayandi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name"))).sendKeys("Panditharathna");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))).sendKeys("71500");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("continue"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();

        // Logout
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();

        // Close browser
        driver.quit();
        System.out.println("Test completed successfully.");
    }
}
