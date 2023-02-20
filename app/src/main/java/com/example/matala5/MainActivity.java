package com.example.matala5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton button;
    ImageView iv;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.imageButton);
        iv = findViewById(R.id.imageView);
        button.setImageResource(R.drawable.click4);


    }
    public void three_click(View view){
        Random rnd = new Random();
        int num = rnd.nextInt(3)+1;
        switch(num) {
            case 1:
                iv.setImageResource(R.drawable.squer2);
                break;
            case 2:
                iv.setImageResource(R.drawable.something2);
                break;
            case 3:
                iv.setImageResource(R.drawable.wow2);
                break;
        }

    }
}