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

        ContactModel model1 = new ContactModel(R.drawable.cOne,"Ashish","1234556");
        arrContacts.add(model1);
        arrContacts.add(new ContactModel(R.drawable.cOne,"Love","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Rahul","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Kamlesh","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Raja","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"nawal","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Harish","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Amrat","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Khalid","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Isaam","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Kamran","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Neelam","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Divya","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Kareena","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Karishma","123456"));
        arrContacts.add(new ContactModel(R.drawable.cOne,"Kajol","123456"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter();

    }
}