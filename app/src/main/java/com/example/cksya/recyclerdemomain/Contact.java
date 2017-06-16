package com.example.cksya.recyclerdemomain;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CKSYA on 5/9/2017.
 */

class Contact {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    String name;
    String contact;

    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}


