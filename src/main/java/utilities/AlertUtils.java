package utilities;

import driver.DriverManager;
import org.openqa.selenium.Alert;

public class AlertUtils {

    public static void acceptAlert() {
        Alert alert = DriverManager.getDriver().switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert() {
        DriverManager.getDriver().switchTo().alert().dismiss();
    }

    public static String getAlertText() {
        return DriverManager.getDriver().switchTo().alert().getText();
    }
}
