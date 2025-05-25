package com.example.user_dataclass;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private String name;
    private String lastName;

    public UserProfile(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
