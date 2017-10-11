package com.example.onewdivide.myapplication1;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainPage extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private GestureDetector gestureDetector;
    private TextToSpeech tts;
    private LinearLayout test123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        tts = new TextToSpeech(this, this);
        tts.setLanguage(new Locale("th"));
        test123 = (LinearLayout)findViewById(R.id.testtest);
        test123.setOnTouchListener(new OnSwipe(this){
            public void onSwipeTop() {
                tts.speak("ปัดขวาเพื่อเข้าสู่หน้าสำรวจแผนที่อาคาร หรือ ปัดซ้ายเพื่อเข้าสู่หน้านำทาง",TextToSpeech.QUEUE_FLUSH,null);
            }
            public void onSwipeRight() {
                Intent it = new Intent(getApplicationContext(),ExplorerMap.class);
                startActivity(it);
                finish();
            }
            public void onSwipeLeft() {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                startActivity(it);
                finish();
            }
            public void onSwipeBottom() {
                tts.speak("หน้านี้คือหน้าหลัก", TextToSpeech.QUEUE_FLUSH,null);
                Log.d("debug","-> MainPage test SwipeBottom");
            }
        });
    }

    @Override
    public void onInit(int status) {

    }
}
