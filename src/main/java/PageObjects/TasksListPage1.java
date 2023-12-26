package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TasksListPage1 extends PageBase1{
    public TasksListPage1(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "fab")
    @iOSXCUITFindBy(accessibility = "plus.circle")
    MobileElement addTaskBtn;

    @AndroidFindBy(id = "android:id/button2")
    MobileElement closeVoteBtn;

    public void noThanksBtn(){
        click(closeVoteBtn);
    }

    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }
}
