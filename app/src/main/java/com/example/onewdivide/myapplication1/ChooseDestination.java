package com.example.onewdivide.myapplication1;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aigestudio.wheelpicker.WheelPicker;
import com.google.gson.Gson;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.logging.HttpLoggingInterceptor;

public class ChooseDestination extends AppCompatActivity implements WheelPicker.OnItemSelectedListener
        , View.OnClickListener{
    public List<String> Allplace = new ArrayList<String>();
    public List<String> allPlace2Send = new ArrayList<String>();
    public int thatPosition = 0;
    public Button next;
    private WheelPicker mainwheel;
    public String startX,startY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_destination);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        startX = extras.getString("startX1");
        startY = extras.getString("startY1");

        MyTTS.getInstance(ChooseDestination.this).speak("กรุณาเเลือกจุดหมายปลายทางปลายทาง");

        Allplace.add("ทางเข้าหนึ่ง");
        Allplace.add("บันไดหนึ่ง");
        Allplace.add("ห้องน้ำชายหนึ่ง");
        Allplace.add("ห้องน้ำหญิงหนึ่ง");
        Allplace.add("ห้องสมุด");
        Allplace.add("ห้องดีเอสเอส");
        Allplace.add("ห้องเอที");
        Allplace.add("ทางเข้าสอง");
        Allplace.add("ประชาสัมพัน");
        Allplace.add("ห้องหนึ่งศูนย์สอง");
        Allplace.add("บันไดสอง");
        Allplace.add("ลิป");
        Allplace.add("ห้องหนึ่งศูนย์สี่");
        Allplace.add("ห้องหนึ่งศูนย์ห้า");
        Allplace.add("ห้องกิดจะกาน");
        Allplace.add("ห้องหนึ่งศูนย์เจ็ด");
        Allplace.add("ห้องหนึ่งศูนย์แปด");
        Allplace.add("ห้องหนึ่งหนึ่งศูนย์");
        Allplace.add("ห้องน้ำชายสอง");
        Allplace.add("ห้องน้ำหญิงสอง");
        Allplace.add("บันไดสาม");
        Allplace.add("ร้านถ่ายเอกสาร");
        Allplace.add("ห้องหนึ่งหนึ่งห้า");
        Allplace.add("ห้องหนึ่งหนึ่งหก");
        Allplace.add("ห้องหนึ่งหนึ่งแปด");

        allPlace2Send.add("Entrance1");
        allPlace2Send.add("Ladder1");
        allPlace2Send.add("Toilet1Man");
        allPlace2Send.add("Toilet1Woman");
        allPlace2Send.add("Library");
        allPlace2Send.add("DSSRoom");
        allPlace2Send.add("ATRoom");
        allPlace2Send.add("Entrance2");
        allPlace2Send.add("PublicRelation");
        allPlace2Send.add("Room102");
        allPlace2Send.add("Ladder2");
        allPlace2Send.add("Lift");
        allPlace2Send.add("Room104");
        allPlace2Send.add("Room105");
        allPlace2Send.add("KKRoom");
        allPlace2Send.add("Room107");
        allPlace2Send.add("Room108");
        allPlace2Send.add("Room110");
        allPlace2Send.add("Toilet2Man");
        allPlace2Send.add("Toilet2Woman");
        allPlace2Send.add("Ladder3");
        allPlace2Send.add("CopyStore");
        allPlace2Send.add("Room115");
        allPlace2Send.add("Room116");
        allPlace2Send.add("Room118");

        mainwheel = (WheelPicker) findViewById(R.id.mainwheel);
        mainwheel.setData(Allplace);
        mainwheel.setOnItemSelectedListener(this);

        next = (Button) findViewById(R.id.thisbutton);
        next.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent it = new Intent(this, MainPage.class);
        startActivity(it);
        finish();

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(WheelPicker picker, Object data, int position) {

        MyTTS.getInstance(ChooseDestination.this)
                .setEngine("com.google.android.tts")
                .setLocale(new Locale("th")).speak("");

        switch (picker.getId()) {
            case R.id.mainwheel:
                thatPosition = position;
                MyTTS.getInstance(ChooseDestination.this).speak(Allplace.get(position));
                Log.e("mainwheels",Allplace.get(position));
                Log.e("putExtra",allPlace2Send.get(position));
                break;
                }
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
        it.putExtra("startX",startX);
        it.putExtra("startY",startY);
        it.putExtra("Destination",allPlace2Send.get(thatPosition));
        startActivity(it);
        finish();

    }


}
