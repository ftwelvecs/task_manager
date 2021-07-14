package kz.f12.school;

import kz.f12.school.utils.Container;
import kz.f12.school.utils.CustomTask;
import kz.f12.school.utils.Task;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static kz.f12.school.utils.UserMapper.toUserFromJson;

public class TaskManager {
    public static void main(String[] args) {
        JSONTokener jsonTokener = new JSONTokener(new InputStreamReader(TaskManager.class.getResourceAsStream("/userList.json")));
        JSONArray jsonArray = (JSONArray) jsonTokener.nextValue();
        List<User> userList = new ArrayList<>();

        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            User user = new User((Integer) jsonObject.get("id"),
                                 (String) jsonObject.get("first_name"),
                                 (String) jsonObject.get("last_name"),
                                 (String) jsonObject.get("email"),
                                 (String) jsonObject.get("gender"));
            userList.add(user);
        }

        System.out.println(userList);

        List<User> filteredList = jsonArray.toList().stream()
                .map(jsonObject -> toUserFromJson((JSONObject) jsonObject))
                .collect(Collectors.toList());

        System.out.println(filteredList);

    }

    public static Container<Task> getTaskList(Container<Task> container) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(TaskManager.class.getResourceAsStream("/taskList.txt")));
        for (String line = ""; line != null; line = bufferedReader.readLine()) {
            container.push(new CustomTask(line));
        }
        return container;
    }
}
