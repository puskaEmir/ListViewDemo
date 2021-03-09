package com.academy.listviewdemo;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.academy.listviewdemo.dao.model.Person;

import java.util.List;

public class PersonListAdapter extends BaseAdapter {

    private List<Person> personList;
    private Context context;
    private LayoutInflater layoutInflater;

    public PersonListAdapter(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Person objekat na poziciji position
        Person person = personList.get(position);
        PersonViewHolder personViewHolder;
        if (convertView == null) {
            personViewHolder = new PersonViewHolder();
            layoutInflater = LayoutInflater.from(context);

            convertView = layoutInflater.inflate(R.layout.layout_person_row_item, null);
            TextView nameTextView = convertView.findViewById(R.id.nameTextView);
            personViewHolder.nameTextView = nameTextView;
            personViewHolder.nameTextView.setText(person.getName());
          TextView surnameTextView = convertView.findViewById(R.id.surnameTextView);
            surnameTextView.setText(person.getSurname());
            TextView genderTextView = convertView.findViewById(R.id.genderTextView);
            genderTextView.setText(person.getGender().getName());
            TextView nationalityTextView = convertView.findViewById(R.id.nationalityTextView);
            nationalityTextView.setText(person.getNationality());

        }else{

        }



        Log.i(PersonListAdapter.class.getSimpleName(), "INDEX: " + position+" : " + convertView);
        return convertView;
    }

    static class PersonViewHolder {
        TextView nameTextView;
        TextView surnameTextView;
        TextView genderView;
        TextView nationalityTextView;
    }
}
