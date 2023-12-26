import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestDemo {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        appiumDriver.findElementById("android:id/button2").click();
    }
}
