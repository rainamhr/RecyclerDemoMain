package com.example.cksya.recyclerdemomain;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static com.example.cksya.recyclerdemomain.R.styleable.RecyclerView;

/**
 * Created by CKSYA on 5/9/2017.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MycustomViewHolder> {
    List<Contact> contactList;

    public CustomAdapter(List<Contact> contactList) {
        this.contactList = contactList;

    }

    @Override
    public MycustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new CustomAdapter.MycustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MycustomViewHolder holder, int position) {
        Contact contactPosition = contactList.get(position);
        holder.name.setText(contactPosition.getName());
        holder.number.setText(contactPosition.getContact());

    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }



    class MycustomViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;

        public MycustomViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name_textview);
            number = (TextView) itemView.findViewById(R.id.number_textview);
        }
    }
}
