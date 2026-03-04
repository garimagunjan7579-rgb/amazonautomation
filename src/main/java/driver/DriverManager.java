package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    // Set Driver
    public static void setDriver(WebDriver driver) {
        tlDriver.set(driver);
    }

    // Get Driver
    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    // Quit Driver
    public static void quitDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}
