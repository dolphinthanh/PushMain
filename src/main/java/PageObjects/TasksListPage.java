package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TasksListPage extends PageBase{
    public TasksListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id = "fab")
    @iOSXCUITFindBy(accessibility = "plus.circle")
    WebElement addTaskBtn;

    @AndroidFindBy(id = "android:id/button2")
    WebElement noThanks;

    public void closeRate(){
        click(noThanks);
    }

    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }
}
