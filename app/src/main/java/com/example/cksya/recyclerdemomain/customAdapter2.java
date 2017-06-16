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

public class customAdapter2 extends RecyclerView.Adapter<customAdapter2.MyViewHolder> {
    List<Contact> contactList;

    public customAdapter2(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_2,parent,false);
        return new customAdapter2.MyViewHolder(v2);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contactPosition = contactList.get(position);
        holder.name.setText(contactPosition.getName());
        holder.number.setText(contactPosition.getContact());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name_textview);
            number = (TextView) itemView.findViewById(R.id.number_textview);
        }
    }
}
