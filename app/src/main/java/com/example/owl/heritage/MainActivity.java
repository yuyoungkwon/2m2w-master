package com.example.owl.heritage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout =
                (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setIcon(
                android.R.drawable.ic_menu_search));
        tabLayout.addTab(tabLayout.newTab().setIcon(
                android.R.drawable.ic_dialog_dialer));
        tabLayout.addTab(tabLayout.newTab().setIcon(
                android.R.drawable.btn_star));

        final ViewPager viewPager =
                (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new TabPagerAdapter
                (mContext, getSupportFragmentManager(),
                        tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }

    //종로구
    public void ButtonClicked_Jongro(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_Jongro.class);
        startActivity(myIntent);
    }

    //중구
    public void ButtonClicked_Junggu(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_Junggu.class);
        startActivity(myIntent);
    }

    //은평/서대문구
    public void ButtonClicked_EunpyeonSeodaemun(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_EunpyeonSeodaemun.class);
        startActivity(myIntent);
    }

    //강북/성북
    public void ButtonClicked_GangbukSeongbuk(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_GangbukSeongbuk.class);
        startActivity(myIntent);
    }

    //도봉/노원
    public void ButtonClicked_DobongNowon(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_DobongNowon.class);
        startActivity(myIntent);
    }

    //중/동/성/광
    public void ButtonClicked_JungDongSeoungGwang(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_JungDongSeoungGwang.class);
        startActivity(myIntent);
    }

    //마포/용산
    public void ButtonClicked_MapoYongsan(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_MapoYongsan.class);
        startActivity(myIntent);
    }

    //강서/양천/구로
    public void ButtonClicked_GangYangGu(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_GangYangGu.class);
        startActivity(myIntent);
    }

    //영/동/관/금
    public void ButtonClicked_YongDongGwanKum(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_YongDongGwanKum.class);
        startActivity(myIntent);
    }

    //서초/강남
    public void ButtonClicked_SeochoGangnam(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_SeochoGangnam.class);
        startActivity(myIntent);
    }

    //강동/송파
    public void ButtonClicked_GangdongSongpa(View v){
        Intent myIntent = new Intent(getApplicationContext(), gu_GangdongSongpa.class);
        startActivity(myIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}