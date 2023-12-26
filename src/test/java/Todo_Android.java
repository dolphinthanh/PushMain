import PageObjects.CreateTaskPage1;
import PageObjects.TasksListPage1;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class Todo_Android extends TestBase{
    CreateTaskPage1 createTaskPage1;
    TasksListPage1 tasksListPage1;

    @DataProvider(name="tasks data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData("data/TasksData.json", "Tasks Data", 2);
    }

    @Test(dataProvider = "tasks data")
    public void test_add_task(String taskName, String descName) throws MalformedURLException {
        Android_setUp();
        tasksListPage1 = new TasksListPage1(driver);
        createTaskPage1 = new CreateTaskPage1(driver);
        tasksListPage1.noThanksBtn();
        tasksListPage1.clickAddTaskBtn();
        createTaskPage1.enterTaskName(taskName);
        createTaskPage1.enterTaskDesc(descName);
        driver.hideKeyboard();
        createTaskPage1.clickSaveBtn();
        tearDown();
    }
}
