package com.academy.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.academy.listviewdemo.dao.PersonDao;
import com.academy.listviewdemo.dao.model.Person;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private PersonDao personDao;//String[]  ->

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        Context context = getApplicationContext();
        personDao = new PersonDao(context);
        List<Person> personList = personDao.getPersonList();
        PersonListAdapter personListAdapter = new PersonListAdapter(personList, this);
        listView.setAdapter(personListAdapter);
    }
}