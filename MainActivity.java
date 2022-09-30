package com.example.and999_vend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    TextView tv_name1,tv_name2,tv_name3,tv_name4;
    Button btn_order1,btn_order2,btn_order3,btn_order4;
    TextView tv_cnt1,tv_cnt2,tv_cnt3,tv_cnt4;
    TextView tv_money;
    EditText edt1;
    Button inputBtn,rfuBtn;
    int money =0;



    //위젯 찾는 처리만 함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name1 = findViewById(R.id.tv_name1);
        tv_name2 = findViewById(R.id.tv_name2);
        tv_name3 = findViewById(R.id.tv_name3);
        tv_name4 = findViewById(R.id.tv_name4);

        btn_order1 = findViewById(R.id.btn_order1);
        btn_order2 = findViewById(R.id.btn_order2);
        btn_order3 = findViewById(R.id.btn_order3);
        btn_order4 = findViewById(R.id.btn_order4);

        tv_cnt1 = findViewById(R.id.tv_cnt1);
        tv_cnt2 = findViewById(R.id.tv_cnt2);
        tv_cnt3 = findViewById(R.id.tv_cnt3);
        tv_cnt4 = findViewById(R.id.tv_cnt4);


        tv_money = findViewById(R.id.tv_money);
        edt1 = findViewById(R.id.edt1);

        inputBtn = findViewById(R.id.inputBtn);
        rfuBtn = findViewById(R.id.rfuBtn);





    }



    //이벤트 처리나 여러가지 다른 로직 ↓
    @Override
    protected void onStart() {
        super.onStart();

        tv_money.setText("잔액 : "+money+"원");

        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 변수에 edit의 숫자값을 넣는다.
                //텍스트 뷰에 있는 글씨를 변수를 이용해 바꾼다.
                moneyInsert();
                tv_money.setText("잔액 : "+money+"원");
            }
        });
        //음료에 대한 정보를 저장해둘  DTO + 위젯을 저장해둠.(해당하는 정보를 표현할 위젯)
        //ArrayList <E> < E 에 해당하는 타입만 넣을 수 있음

        //해당하는 타입에 담을 수 있는 값이나 그 값으로 초기화된 변수 넣을 수 있음
        ArrayList<DrinkDTO> list = new ArrayList<>();
        list.add(new DrinkDTO("콜라",1500,11,tv_name1,tv_cnt1 ,btn_order1,0));
        list.add(new DrinkDTO("사이다",1500,11,tv_name2,tv_cnt2,btn_order2,0));
        list.add(new DrinkDTO("환타",2000,10,tv_name3,tv_cnt3,btn_order3,0));
        list.add(new DrinkDTO("데미소다",3000,11,tv_name4,tv_cnt4,btn_order4,0));

        for (int i = 0; i < list.size(); i++) {
            final int idx = i;
            list.get(i).btn_order.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(money < list.get(idx).getPrice()){
                        //현재 입력한 금액이 음료의 금액보다 작으면, 음료는 나올 수가 없음
                        Toast.makeText(MainActivity.this, "금액부족", Toast.LENGTH_SHORT).show();
                    }else{
                        list.get(idx).setCnt(list.get(idx).getCnt()-1);
                        list.get(idx).setDrink(list.get(idx).getDrink()+1);
                        money -= list.get(idx).getPrice();
                        tv_money.setText("잔액 : "+money+"원");
                    }

                    if(list.get(idx).getCnt()<=0){
                        list.get(idx).tv_cnt.setText("품절");
                        list.get(idx).btn_order.setEnabled(false);
                    }

                }
            });
        }

        rfuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "콜라 "+list.get(0).getDrink()+"개", Toast.LENGTH_SHORT).show();

            }
        });






    }

    public void moneyInsert(){
        try {
            if(Integer.parseInt(edt1.getText()+"")> 0){
                money += Integer.parseInt(edt1.getText()+"");
            }else{
                Toast.makeText(MainActivity.this, "양수만 입력하세요", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "숫자만 입력하세요", Toast.LENGTH_SHORT).show();
        }

    }


}
