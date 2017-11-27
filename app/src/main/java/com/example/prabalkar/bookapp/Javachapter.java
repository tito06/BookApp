package com.example.prabalkar.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Javachapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javachapter);

        Intent i = getIntent();
        TextView tv = (TextView) findViewById(R.id.textView2) ;


        Button b1 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Javachapter.this, Chapterone.class);
                startActivity(i);
            }
        });

        Button b2 = (Button) findViewById(R.id.button6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Javachapter.this, Chaptertwo.class);
                startActivity(i);
            }
        });

        Button b3 = (Button) findViewById(R.id.button7);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Javachapter.this, Chapterthree.class);
                startActivity(i);
            }
        });
    }
}
