package com.cheng.customlistviewCustomListview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.cheng.customlistviewCustomListview.adapter.CustomAdapter;
import com.cheng.customlistviewCustomListview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_contact);

        ArrayList<Contact> arrayList = new ArrayList<>();

        Contact contact1 = new Contact(Color.BLUE,"Truong Dinh Chien","0988 xxx yyy");
        Contact contact2 = new Contact(Color.CYAN,"Lai The Quang","0927 120 222");
        Contact contact3 = new Contact(Color.CYAN,"Vo Van Ta","0988 xxx yyy");
        Contact contact4 = new Contact(Color.YELLOW,"Le Tan Dung","0988 xxx yyy");
        Contact contact5 = new Contact(Color.BLACK,"Truong Quang Lam","0988 xxx yyy");

        Contact contact6= new Contact(Color.CYAN,"A","0988 xxx yyy");
        Contact contact7 = new Contact(Color.YELLOW,"B","0988 xxx yyy");
        Contact contact8 = new Contact(Color.BLACK,"C","0988 xxx yyy");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
    }
}
