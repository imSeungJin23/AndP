package com.example.and14_allview.listview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and14_allview.R;

import java.util.ArrayList;


public class ListFragment extends Fragment {

    ListView listView;

    //1. 칸마다 보여질 정보를 (Layout) 어떤 식으로 보여줄지 미리 만들어 놓는다 (1칸, 반복)
    //ex ) 카카오톨 친구목록, 친구 숫자에 따라서 아이템이 20~ 친구 숫자만큼 가변적으로 변함.(==1칸)

    //2. Adapter
    //- 안드로이드 자체에서 사용자가 어떤 모양의 정보를 보여주는 화면 구성을 할 지 전부다 미리 만들어 놓을 수 없음
    // 따라서 사용자가 만든 화면과 위젯을 연결해줄 ( 브릿지 ) 어댑터
    //( BaseAdapter - 가장 기본적은 형태의 어댑터 )

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<animalDTO> list = new ArrayList();
        list.add(new animalDTO("네로","고양이",R.drawable.cat1));
        list.add(new animalDTO("네로2","고양이",R.drawable.cat2));
        list.add(new animalDTO("네로3","고양이",R.drawable.cat3));
        list.add(new animalDTO("네로4","고양이",R.drawable.cat4));
        list.add(new animalDTO("네로5","고양이",R.drawable.cat5));


        listView = v.findViewById(R.id.listView);

        ListAdapter adapter = new ListAdapter(inflater, list); //기본적으로 프래그먼트는 LayoutInflater를 무조건 가지고 있음
        listView.setAdapter(adapter);

        return v;



    }
}


/*    if(listView == null){
            Log.d("TAG", "onCreateView: 테스트1");
        }else{
            Log.d("TAG", "onCreateView: 테스트2");
        }*/