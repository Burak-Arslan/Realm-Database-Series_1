package com.example.user.realmdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    UsersEntity usersEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        UsersSave();
        ShowToast();
    }

    private void ShowToast() {
        try {

            realm.beginTransaction();

            RealmResults<UsersEntity> sonuc = realm.where(UsersEntity.class).findAll();

            for (UsersEntity item : sonuc) {
                Toast.makeText(getApplicationContext(), item.toString(), Toast.LENGTH_SHORT).show();
            }

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void Init() {
        try {
            realm = Realm.getDefaultInstance();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void UsersSave() {
        try {
            realm.beginTransaction();
            usersEntity = realm.createObject(UsersEntity.class);

            usersEntity.setName("Burak");
            usersEntity.setSurName("Arslan");
            usersEntity.seteMail("burakarslanbilisim@gmail.com");


            realm.commitTransaction();

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
