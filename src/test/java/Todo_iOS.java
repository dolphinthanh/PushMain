import PageObjects.CreateTaskPage1;
import PageObjects.TasksListPage1;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Todo_iOS extends TestBase{
    CreateTaskPage1 createTaskPage1;
    TasksListPage1 tasksListPage1;

    @Test
    public void test_add_task() throws MalformedURLException {
        iOS_setUp();
        tasksListPage1 = new TasksListPage1(driver);
        createTaskPage1 = new CreateTaskPage1(driver);
        tasksListPage1.clickAddTaskBtn();
        createTaskPage1.enterTaskName("Finish iOS course");
        createTaskPage1.enterTaskDesc("Finish");
        driver.hideKeyboard();
        createTaskPage1.clickSaveBtn();
        tearDown();
    }
}
