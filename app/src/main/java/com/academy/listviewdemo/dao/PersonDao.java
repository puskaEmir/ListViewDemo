package com.academy.listviewdemo.dao;

import android.content.Context;
import android.content.res.Resources;

import com.academy.listviewdemo.R;
import com.academy.listviewdemo.dao.model.Gender;
import com.academy.listviewdemo.dao.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    private String[] names;
    private String[] surnames;
    private String[] genders;
    private String[] nationalities;
    private List<Person> personList = new ArrayList<>();

    public PersonDao(Context context){
        Resources resources = context.getResources();
        this.names = resources.getStringArray(R.array.names);
        this.surnames = resources.getStringArray(R.array.surnames);
        this.genders = resources.getStringArray(R.array.genders);
        this.nationalities = resources.getStringArray(R.array.nationalities);
        for(int i = 0; i<names.length; i++){
            String name = names[i];
            String surname = surnames[i];
            String genderText = genders[i];
            Gender gender = genderText.equalsIgnoreCase("male") ? Gender.MALE:Gender.FEMALE;
            String nationality = nationalities[i];
            Person person = new Person(name, surname, gender, nationality);
            this.personList.add(person);
        }
    }

    public String[] getNames() {
        return names;
    }

    public String[] getSurnames() {
        return surnames;
    }

    public String[] getNationalities() {
        return nationalities;
    }

    public String[] getGenders() {
        return genders;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
