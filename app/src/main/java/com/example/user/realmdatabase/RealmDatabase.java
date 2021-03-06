package com.example.user.realmdatabase;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmDatabase extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name("BA").build();
        Realm.setDefaultConfiguration(config);
    }
}