package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mypage extends AppCompatActivity {

    TextView usingCount, saveCost, userName, userSex;
    RadioGroup userSeatGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        //DB에서 받아와야 함
        usingCount=findViewById(R.id.mypage_use_count);
        saveCost=findViewById(R.id.mypage_save_cost);
        userName=findViewById(R.id.User_name);
        userSex=findViewById(R.id.User_sex);
        //선호좌석 radio group
        userSeatGroup=findViewById(R.id.User_seat);

        //DB에서 정보를 받아오기
        /*
        usingCount.setText();
        saveCost.setText();
        userName.setText();
        userSex.setText();

        userSeatGroup.check();
         */


        //선화좌석 선택변경 시
        userSeatGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.User_seat_front: //0
                        //선호좌석이 앞이라면 DB업데이트
                        break;
                    case R.id.User_seat_back: //1
                        //선호좌석이 뒤라면 DB업데이트
                        break;
                }
            }
        });

    }
}