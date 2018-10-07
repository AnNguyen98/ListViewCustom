package com.theannguyen.listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Contact> contactArrayList;
    private int layout;

    public ContactAdapter(Context context, ArrayList<Contact> contactArrayList, int layout) {
        this.context = context;
        this.contactArrayList = contactArrayList;
        this.layout = layout;
    }
    @Override
    public int getCount() {
        return contactArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder{
        private TextView numberPhone;
        private ImageView imgImage;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
            viewHolder = new ViewHolder();
            viewHolder.imgImage = (ImageView)convertView.findViewById(R.id.imgListView);
            viewHolder.numberPhone = (TextView) convertView.findViewById(R.id.txtContact);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Contact contact = contactArrayList.get(position);
        viewHolder.numberPhone.setText(contact.getNumberPhone());
        viewHolder.imgImage.setImageResource(contact.getImgImage());
        return convertView;
    }
}
