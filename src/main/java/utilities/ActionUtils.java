package utilities;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {

    public static void hover(WebElement element) {
        Actions action = new Actions(DriverManager.getDriver());
        action.moveToElement(element).perform();
    }

    public static void doubleClick(WebElement element) {
        new Actions(DriverManager.getDriver())
                .doubleClick(element)
                .perform();
    }

    public static void rightClick(WebElement element) {
        new Actions(DriverManager.getDriver())
                .contextClick(element)
                .perform();
    }
}
