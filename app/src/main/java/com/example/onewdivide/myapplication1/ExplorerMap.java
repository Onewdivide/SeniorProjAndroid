package com.example.onewdivide.myapplication1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
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

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test123 = (RelativeLayout) findViewById(R.id.activity_main);
        tts = new TextToSpeech(this, this);
        tts.setLanguage(new Locale("th"));
        MeetRoom = (Button) findViewById(R.id.Longway1);
        L2 = (Button) findViewById(R.id.Longway2);
        L4 = (Button) findViewById(R.id.Longway4);
        Library = (Button) findViewById(R.id.library);
        En1 = (Button) findViewById(R.id.Entrance1);
        ls1 = (Button) findViewById(R.id.Ladder1);
        b6 = (Button) findViewById(R.id.button6);
        r8 = (Button) findViewById(R.id.room8);
        r7 = (Button) findViewById(R.id.button5);
        field = (Button) findViewById(R.id.field);
        ladder2 = (Button) findViewById(R.id.button9);
        L1 = (Button) findViewById(R.id.longways);
        kroom = (Button) findViewById(R.id.button7);
        ll1 = (Button) findViewById(R.id.llongways);
        ladder3 = (Button) findViewById(R.id.ladder3);
        ll2 = (Button) findViewById(R.id.llongways2);
        r6 = (Button) findViewById(R.id.room6);
        r5 = (Button) findViewById(R.id.room5);
        r4 = (Button) findViewById(R.id.room4);
        ll3 = (Button) findViewById(R.id.llongways3);
        r3 = (Button) findViewById(R.id.room3);
        t = (Button) findViewById(R.id.toilet);
        ll4 = (Button) findViewById(R.id.llongways4);
        ladder4 = (Button) findViewById(R.id.ladder4);
        r1 = (Button) findViewById(R.id.room1);
        r2 = (Button) findViewById(R.id.room2);
        En2 = (Button) findViewById(R.id.entrance2);
        Mroom = (Button) findViewById(R.id.Mroom);

        test123.setOnTouchListener(new OnSwipe(this) {
            public void onSwipeTop() {
                tts.speak("ปัดซ้ายเพื่อกลับหน้าหลัก", TextToSpeech.QUEUE_FLUSH, null);
            }

            public void onSwipeRight() {
            }

            public void onSwipeLeft() {
                Intent back = new Intent(getApplicationContext(), MainPage.class);
                startActivity(back);
                finish();
            }

            public void onSwipeBottom() {
                tts.speak("หน้านี้คือหน้าสำรวจแผนที่อาคาร", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        Mroom.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < Mroom.getWidth() && event.getY() < Mroom.getHeight())
                            tts.speak("ห้องธุรการ", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        En2.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < En2.getWidth() && event.getY() < En2.getHeight())
                            tts.speak("ทางเข้า", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r2.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r2.getWidth() && event.getY() < r2.getHeight())
                            tts.speak("ห้องที่สอง", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r1.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r1.getWidth() && event.getY() < r1.getHeight())
                            tts.speak("ห้องที่หนึ่ง", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ladder4.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ladder4.getWidth() && event.getY() < ladder4.getHeight())
                            tts.speak("บันได", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ll4.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ll4.getWidth() && event.getY() < ll4.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        t.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < t.getWidth() && event.getY() < t.getHeight())
                            tts.speak("ห้องน้ำ", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r3.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r3.getWidth() && event.getY() < r3.getHeight())
                            tts.speak("ห้องที่สาม", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ll3.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ll3.getWidth() && event.getY() < ll3.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r4.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r4.getWidth() && event.getY() < r4.getHeight())
                            tts.speak("ห้องที่สี่", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r5.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r5.getWidth() && event.getY() < r5.getHeight())
                            tts.speak("ห้องที่ห้า", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r6.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r6.getWidth() && event.getY() < r6.getHeight())
                            tts.speak("ห้องโถงที่หนึ่ง", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ll2.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ll2.getWidth() && event.getY() < ll2.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ladder3.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ladder3.getWidth() && event.getY() < ladder3.getHeight())
                            tts.speak("บันได", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ll1.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ll1.getWidth() && event.getY() < ll1.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        kroom.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < kroom.getWidth() && event.getY() < kroom.getHeight())
                            tts.speak("ห้องกิจการ", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        L1.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < L1.getWidth() && event.getY() < L1.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ladder2.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ladder2.getWidth() && event.getY() < ladder2.getHeight())
                            tts.speak("บันไดทางลาด", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        field.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < field.getWidth() && event.getY() < field.getHeight())
                            tts.speak("ลานว่าง", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r7.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r7.getWidth() && event.getY() < r7.getHeight())
                            tts.speak("ห้องที่เจ็ด", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        r8.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < r8.getWidth() && event.getY() < r8.getHeight())
                            tts.speak("ห้องที่แปด", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        b6.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < b6.getWidth() && event.getY() < b6.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        ls1.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < ls1.getWidth() && event.getY() < ls1.getHeight())
                            tts.speak("บันได", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        En1.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < En1.getWidth() && event.getY() < En1.getHeight())
                            tts.speak("ทางเข้า", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        Library.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < Library.getWidth() && event.getY() < Library.getHeight())
                            tts.speak("ห้องสมุด", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        MeetRoom.setOnTouchListener(new View.OnTouchListener() {
            private Handler h;

            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < MeetRoom.getWidth() && event.getY() < MeetRoom.getHeight())
                            tts.speak("ห้องประชุม", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        L2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < L2.getWidth() && event.getY() < L2.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

        L4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!tts.isSpeaking()) {
                        if (event.getX() < L4.getWidth() && event.getY() < L4.getHeight())
                            tts.speak("ทางเดิน", TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                return false;
            }
        });

    }


    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            //do somethings here
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tts.shutdown();
    }
}
