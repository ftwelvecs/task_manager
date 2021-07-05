import utils.Container;
import utils.CustomTask;
import utils.Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskManager {
    public static void main(String[] args) throws Exception {

    }

    public static Container<Task> getTaskList(Container<Task> container) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(TaskManager.class.getResourceAsStream("taskList.txt")));
        for (String line = ""; line != null; line = bufferedReader.readLine()) {
            container.push(new CustomTask(line));
        }
        return container;
    }
}
