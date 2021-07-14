package kz.f12.school.utils;

import kz.f12.school.User;
import org.json.JSONObject;

public class UserMapper {

    public static User toUserFromJson(JSONObject jsonObject) {
        return new User(
                (Integer) jsonObject.get("id"),
                (String) jsonObject.get("first_name"),
                (String) jsonObject.get("last_name"),
                (String) jsonObject.get("email"),
                (String) jsonObject.get("gender")
        );
    }
}
