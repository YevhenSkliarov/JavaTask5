package com.it.users;

import com.it.utils.QAUtils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    private static ResourceBundle resourceUser = ResourceBundle.getBundle("users");

    public static User getValidUser() {
        return new User(resourceUser.getString("username"),
                resourceUser.getString("password"),
                resourceUser.getString("email"));
    }
    public static User getRandomUser(){
            return new User(
                QAUtils.getRandomString(15),
                QAUtils.getRandomString(10),
                QAUtils.getRandomString(12)+"@gmail.com");
    }

    public  static List<User> getRandomUsers(int count) {
        List<User> collect = Stream.generate(() -> new User(
                QAUtils.getRandomString(15),
                QAUtils.getRandomString(10),
                QAUtils.getRandomString(12)+"@gmail.com"))
                .limit(count)
                .collect(Collectors.toList());
        return collect;
    }
}
