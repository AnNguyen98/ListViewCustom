package com.theannguyen.listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Contact> contactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactArrayList = new ArrayList<>();
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));
        contactArrayList.add(new Contact("01699873737",R.drawable.ic_launcher_background));

        listView = (ListView) findViewById(R.id.lvCustom);

        ContactAdapter contactAdapter = new ContactAdapter(MainActivity.this,contactArrayList,R.layout.list_view_custom);
        listView.setAdapter(contactAdapter);
    }
}
