package com.example.cksya.recyclerdemomain;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import static com.example.cksya.recyclerdemomain.R.styleable.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;
    CustomAdapter customAdapter;
    customAdapter2 customAdapter2;
    List<Contact> contactList;
    boolean isLinear = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(tb);
        contactList = new ArrayList<>();

        view = (RecyclerView) findViewById(R.id.recyclerview_layout);

        customAdapter = new CustomAdapter(contactList);
        customAdapter2 = new customAdapter2(contactList);
        RecyclerView.LayoutManager layoutforrv = new LinearLayoutManager(MainActivity.this);
        view.setLayoutManager(layoutforrv);
        view.setItemAnimator(new DefaultItemAnimator());
        view.setAdapter(customAdapter);
        listmaaddgare();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            contactList = new ArrayList<>();
            view = (RecyclerView) findViewById(R.id.recyclerview_layout);
            customAdapter = new CustomAdapter(contactList);
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 2);
            view.setLayoutManager(layoutManager);
            view.setAdapter(customAdapter);
            listmaaddgare();
        }
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            contactList = new ArrayList<>();
            view = (RecyclerView) findViewById(R.id.recyclerview_layout);
            customAdapter = new CustomAdapter(contactList);
            customAdapter2 = new customAdapter2(contactList);
            RecyclerView.LayoutManager layoutforrv = new LinearLayoutManager(MainActivity.this);
            view.setLayoutManager(layoutforrv);
            view.setItemAnimator(new DefaultItemAnimator());
            view.setAdapter(customAdapter);
            listmaaddgare();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.orientation) {

            if (isLinear == true) {
                RecyclerView.LayoutManager layout1 = new LinearLayoutManager(this);
                view.setLayoutManager(layout1);
                view.setItemAnimator(new DefaultItemAnimator());
                view.setAdapter(customAdapter);
                isLinear = false;


            } else if (isLinear == false) {
                RecyclerView.LayoutManager layout2 = new LinearLayoutManager(this);
                view.setLayoutManager(layout2);
                view.setItemAnimator(new DefaultItemAnimator());
                view.setAdapter(customAdapter2);
                isLinear = true;
            }
//            Toast.makeText(this,"orientation",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void listmaaddgare() {

        Contact list = new Contact("ram", "123456789");
        contactList.add(list);

        list = new Contact("shyam", "12345679");
        contactList.add(list);

        list = new Contact("ghanshyam", "12345679");
        contactList.add(list);

        list = new Contact("ashyam", "012345679");
        contactList.add(list);
        list = new Contact("bshyam", "112345679");
        contactList.add(list);
        list = new Contact("cshyam", "122345679");
        contactList.add(list);
        list = new Contact("dshyam", "123445679");
        contactList.add(list);
        list = new Contact("eshyam", "1234545679");
        contactList.add(list);
        list = new Contact("fshyam", "123458979679");
        contactList.add(list);
        list = new Contact("gshyam", "123456792");
        contactList.add(list);
        list = new Contact("hshyam", "12345675");
        contactList.add(list);
        customAdapter.notifyDataSetChanged();
    }

}
