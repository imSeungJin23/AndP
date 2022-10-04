package com.example.and14_allview.gridview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.ListAdapter;
import com.example.and14_allview.listview.animalDTO;

import java.util.ArrayList;

public class gridFragment extends Fragment {

    GridView gridView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_grid, container, false);

        ArrayList<catDTO> list = new ArrayList();
        list.add(new catDTO("레이","고양이",R.drawable.cat5));
        list.add(new catDTO("김레이","고양이",R.drawable.cat4));
        list.add(new catDTO("박레이","고양이",R.drawable.cat3));
        list.add(new catDTO("임레이","고양이",R.drawable.cat2));
        list.add(new catDTO("이레이","고양이",R.drawable.cat1));


        gridView = v.findViewById(R.id.gridView);

        gridAdapter adapter = new gridAdapter(inflater,list); //기본적으로 프래그먼트는 LayoutInflater를 무조건 가지고 있음
        gridView.setAdapter(adapter);

        return v;



    }
}