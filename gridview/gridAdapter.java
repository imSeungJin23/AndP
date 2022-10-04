package com.example.and14_allview.gridview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and14_allview.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class gridAdapter extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<catDTO> list;

    public gridAdapter(LayoutInflater inflater, ArrayList<catDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    //getCount  수 만큼 작동함.
    public View getView(int position, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.activity_item_gridview,parent, false);
        //나중에 알아서 처리함. 바로 붙이기 x

        ImageView img = v.findViewById(R.id.imgv_profile);

        TextView var1 = v.findViewById(R.id.var1);
        TextView var2 = v.findViewById(R.id.var2);

        img.setImageResource(list.get(position).getImg());

        var1.setText(list.get(position).getCategory());
        var2.setText(list.get(position).getName());
        return v;
    }
}
