package com.example.and14_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.and14_allview.listview.ListFragment;
import com.example.and14_allview.gridview.gridFragment;

public class MainActivity extends AppCompatActivity {

    Button btn_listview;
    Button btn_gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_listview =findViewById(R.id.btn_listview);
        btn_gridview =findViewById(R.id.btn_gridview);

        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new ListFragment()).commit();
            }
        });

        btn_gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new gridFragment()).commit();
            }
        });


    }
}