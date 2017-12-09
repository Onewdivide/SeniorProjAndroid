package com.example.onewdivide.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseDestination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_destination);

        Button Entrance1 = (Button)findViewById(R.id.Entrance1);
        Entrance1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Entrance1");
                startActivity(it);
                finish();
            }
        });

        Button Ladder1 = (Button)findViewById(R.id.Ladder1);
        Ladder1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Ladder1");
                startActivity(it);
                finish();
            }
        });

        Button Toilet1Man = (Button)findViewById(R.id.Toilet1Man);
        Toilet1Man.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Toilet1Man");
                startActivity(it);
                finish();
            }
        });

        Button Toilet1Woman = (Button)findViewById(R.id.Toilet1Woman);
        Toilet1Woman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Toilet1Woman");
                startActivity(it);
                finish();
            }
        });

        Button Library = (Button)findViewById(R.id.Library);
        Library.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Library");
                startActivity(it);
                finish();
            }
        });

        Button DSSRoom = (Button)findViewById(R.id.DSSRoom);
        DSSRoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","DSSRoom");
                startActivity(it);
                finish();
            }
        });

        Button ATRoom = (Button)findViewById(R.id.ATRoom);
        ATRoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","ATRoom");
                startActivity(it);
                finish();
            }
        });

        Button Entrance2 = (Button)findViewById(R.id.Entrance2);
        Entrance2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Entrance2");
                startActivity(it);
                finish();
            }
        });

        Button PublicRelation = (Button)findViewById(R.id.PublicRelation);
        PublicRelation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","PublicRelation");
                startActivity(it);
                finish();
            }
        });

        Button Room102 = (Button)findViewById(R.id.Room102);
        Room102.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room102");
                startActivity(it);
                finish();
            }
        });

        Button Ladder2 = (Button)findViewById(R.id.Ladder2);
        Ladder2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Ladder2");
                startActivity(it);
                finish();
            }
        });

        Button Lift = (Button)findViewById(R.id.Lift);
        Lift.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Lift");
                startActivity(it);
                finish();
            }
        });

        Button Room104 = (Button)findViewById(R.id.Room104);
        Room104.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room104");
                startActivity(it);
                finish();
            }
        });

        Button Room105 = (Button)findViewById(R.id.Room105);
        Room105.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room105");
                startActivity(it);
                finish();
            }
        });

        Button KKRoom = (Button)findViewById(R.id.KKRoom);
        KKRoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","KKRoom");
                startActivity(it);
                finish();
            }
        });

        Button Room107 = (Button)findViewById(R.id.Room107);
        Room107.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room107");
                startActivity(it);
                finish();
            }
        });

        Button Room108 = (Button)findViewById(R.id.Room108);
        Room108.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room108");
                startActivity(it);
                finish();
            }
        });

        Button Room110 = (Button)findViewById(R.id.Room110);
        Room110.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room110");
                startActivity(it);
                finish();
            }
        });

        Button Toilet2Man = (Button)findViewById(R.id.Toilet2Man);
        Toilet2Man.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Toilet2Man");
                startActivity(it);
                finish();
            }
        });

        Button Toilet2Woman = (Button)findViewById(R.id.Toilet2Woman);
        Toilet2Woman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Toilet2Woman");
                startActivity(it);
                finish();
            }
        });

        Button Ladder3 = (Button)findViewById(R.id.Ladder3);
        Ladder3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Ladder3");
                startActivity(it);
                finish();
            }
        });

        Button CopyStore = (Button)findViewById(R.id.CopyStore);
        CopyStore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","CopyStore");
                startActivity(it);
                finish();
            }
        });

        Button Room115 = (Button)findViewById(R.id.Room115);
        Room115.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room115");
                startActivity(it);
                finish();
            }
        });
        Button Room116 = (Button)findViewById(R.id.Room116);
        Room116.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room116");
                startActivity(it);
                finish();
            }
        });

        Button Room118 = (Button)findViewById(R.id.Room118);
        Room118.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),NavigationActivity.class);
                it.putExtra("Destination","Room118");
                startActivity(it);
                finish();
            }
        });


    }
}
