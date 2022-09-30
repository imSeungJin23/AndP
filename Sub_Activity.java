package com.example.and999_vend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub_Activity extends AppCompatActivity {

    TextView resultTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        resultTv = findViewById(R.id.resultTv);


        Intent intent = getIntent();

       int tv_cnt1 = intent.getIntExtra("tv_cnt1",0);
       int tv_cnt2 =  intent.getIntExtra("tv_cnt2",0);
       int tv_cnt3 =  intent.getIntExtra("tv_cnt3",0);
       int tv_cnt4 =  intent.getIntExtra("tv_cnt4",0);
       int money = intent.getIntExtra("money",0);
        resultTv.setText("콜라 " + tv_cnt1+"개\n" +
                         "사이다 " + tv_cnt2+"개\n"+
                         "환타 " + tv_cnt3+"개\n"+
                         "데미소다 " + tv_cnt4+"개\n"+
                         "잔액" + money+"원"
        );
    }
}