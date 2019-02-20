package com.example.user.realmdatabase;

import io.realm.RealmObject;

public class UsersEntity extends RealmObject {

    private String name;
    private String surName;
    private String eMail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
