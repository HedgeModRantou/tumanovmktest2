package com.example.tumanovmktest2;

import java.io.Serializable;

public class MyObject implements Serializable {
    private String name;
    private String email;
    private int age;

    public MyObject(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName()  { return name; }
    public String getEmail() { return email; }
    public int getAge()      { return age; }
}
