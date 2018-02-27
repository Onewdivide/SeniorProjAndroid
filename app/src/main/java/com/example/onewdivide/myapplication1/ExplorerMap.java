package com.example.onewdivide.myapplication1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import java.util.Locale;

public class ExplorerMap extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    private RelativeLayout test123;
    Button L1;
    Button L2;
    Button L4;
    Button MeetRoom;
    Button Library;
    Button En1;
    Button ls1;
    Button b6;
    Button r8;
    Button r7;
    Button field;
    Button ladder2;
    Button kroom;
    Button ll1;
    Button ladder3;
    Button ll2;
    Button r6;
    Button r5;
    Button r4;
    Button ll3;
    Button r3;
    Button t;
    Button ll4;
    Button ladder4;
    Button r1;
    Button r2;
    Button En2;
    Button Mroom;
    Button backBtn;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home){
            Intent it = new Intent(this, MainPage.class);
            startActivity(it);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            //do somethings here
        }
    }

}
