package com.rathoreraja.recycleviewxapmle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactModel model1 = new ContactModel(R.drawable.one,"Ashish","1234556");
        arrContacts.add(model1);
        arrContacts.add(new ContactModel(R.drawable.one,"Love","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Rahul","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Kamlesh","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Raja","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"nawal","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Harish","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Amrat","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Khalid","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Isaam","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Kamran","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Neelam","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Divya","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Kareena","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Karishma","123456"));
        arrContacts.add(new ContactModel(R.drawable.one,"Kajol","123456"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);

        recyclerView.setAdapter(adapter);
    }
}