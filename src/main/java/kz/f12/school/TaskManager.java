package kz.f12.school;

import kz.f12.school.utils.Container;
import kz.f12.school.utils.CustomTask;
import kz.f12.school.utils.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskManager {
    public static void main(String[] args) {
    }

    public static Container<Task> getTaskList(Container<Task> container) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(TaskManager.class.getResourceAsStream("/taskList.txt")));
        for (String line = ""; line != null; line = bufferedReader.readLine()) {
            container.push(new CustomTask(line));
        }
        return container;
    }
}
