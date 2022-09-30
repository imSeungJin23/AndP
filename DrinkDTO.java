package com.example.and999_vend;

import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class DrinkDTO  implements Serializable {

    //각각의 데이터 들을 따로 변수로 여러개 만들어서 관리하는 것 보다
    // 하나의 객체에 대한 변수들을 클래스 아래 모아놓고 사용하면 데이터 관리가 높고 정합성이 좋음

    //ex) 음료종류 4 : cola_name , cola_price , cola_cnt ...


    private int drink;



    private String name;
    private int price ,cnt;


    TextView tv_name, tv_cnt;

    Button btn_order;


    //신신규 : tv + 버튼 까지 하나로 묶어서 관리하기 편하게 만든다.

    public DrinkDTO(String name, int price, int cnt, TextView tv_name, TextView tv_cnt, Button btn_order, int drink) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
        this.tv_name = tv_name;
        this.tv_cnt = tv_cnt;
        this.btn_order = btn_order;
        this.drink =drink;
        this.tv_name.setText(name + price + "원");
        this.tv_cnt.setText(cnt+"개 남음");
        btn_order.setText(name+"주문");
    }

    //신규 DTO  : 기존DTO + 화면에 보이는 위젯까지 묶어서 가지고 있음

    public DrinkDTO(String name, int price, int cnt, TextView tv_name, TextView tv_cnt) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
        this.tv_name = tv_name;
        this.tv_cnt = tv_cnt;
        
        this.tv_name.setText(name + price + "원");
        this.tv_cnt.setText(cnt+"개 남음");
    }

    //기존  DTO : 데이터 이름 , 가격, 수량의 정보만 있는 DTO



    public DrinkDTO(String name, int price, int cnt) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
    }
    
    public TextView getTv_name() {
        return tv_name;
    }

    public void setTv_name(TextView tv_name) {
        this.tv_name = tv_name;
    }

    public TextView getTv_cnt() {
        return tv_cnt;
    }

    public void setTv_cnt(TextView tv_cnt) {
        this.tv_cnt = tv_cnt;
    }

    public int getDrink() {
        return drink;
    }

    public void setDrink(int drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
        this.tv_cnt.setText(cnt+"개 남음");
    }
}
