package com.example.owl.heritage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hyoseung on 2016-09-03.
 * 중랑 동대문 성동 광진
 */
public class gu_JungDongSeoungGwang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gu_jungdongseounggwang_content);
    }

    //서울 청계천
    public void button1Click(View v){
        Intent myIntent = new Intent(getApplicationContext(), Heritage_information.class);
        Button btn = (Button)findViewById(R.id.button1);
        myIntent.putExtra("name", btn.getText());
        //myIntent.putExtra("name", "수유동 분청사기 가마터"); //만약 버튼에 text없이 이미지만 넣을 경우
        startActivity(myIntent);
    }

    // 아차산성
    public void button2Click(View v){
        Intent myIntent = new Intent(getApplicationContext(), Heritage_information.class);
        Button btn = (Button)findViewById(R.id.button2);
        myIntent.putExtra("name", btn.getText());
        //myIntent.putExtra("name", "수유동 분청사기 가마터"); //만약 버튼에 text없이 이미지만 넣을 경우
        startActivity(myIntent);
    }
}
