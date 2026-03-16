package utilities;

import driver.DriverManager;
import org.openqa.selenium.By;

public class FrameUtils {

    public static void switchToFrame(By locator) {
        DriverManager.getDriver().switchTo()
                .frame(DriverManager.getDriver().findElement(locator));
    }

    public static void switchToDefault() {
        DriverManager.getDriver().switchTo().defaultContent();
    }
}
