package utilities;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScreenshotUtils {

    public static WebElement waitForElementVisible(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void fluentWait(By locator, int timeout) {
        Wait wait = new FluentWait<>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
