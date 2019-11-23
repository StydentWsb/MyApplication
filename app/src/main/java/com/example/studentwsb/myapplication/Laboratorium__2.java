package com.example.studentwsb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Laboratorium__2 extends AppCompatActivity {

     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorium__2);

        button = findViewById(R.id.button);

        button.setOnClickListener(new view.oneClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(this
                startAcitivity(intent));
            }

        });


    }
}
