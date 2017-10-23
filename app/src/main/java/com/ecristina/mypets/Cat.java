package com.ecristina.mypets;

import java.io.Serializable;

public class Cat implements Serializable {

    private String mName;
    private int mAge;
    private String mColor;

    public Cat(String name, int age, String color) {
        mName = name;
        mAge = age;
        mColor = color;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public String getColor() {
        return mColor;
    }

}
