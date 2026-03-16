package utilities;

import driver.DriverManager;

import java.util.Set;

public class WindowUtils {

    public static void switchToNewWindow() {
        String parent = DriverManager.getDriver().getWindowHandle();
        Set<String> allWindows = DriverManager.getDriver().getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parent)) {
                DriverManager.getDriver().switchTo().window(window);
            }
        }
    }
}
