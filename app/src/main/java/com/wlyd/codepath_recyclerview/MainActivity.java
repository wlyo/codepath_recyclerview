package com.wlyd.codepath_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = findViewById(R.id.rvContacts);

        contacts = Contact.createContactsList(20);

        ContactsAdapter adapter = new ContactsAdapter(this, contacts);

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}
