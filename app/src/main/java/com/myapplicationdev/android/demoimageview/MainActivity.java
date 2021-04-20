package com.myapplicationdev.android.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Declare th imageview object called ivDay2
    ImageView ivDay2, ivDay3, ivDay4, ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the ImageVIew obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        //set the image
        ivDay2.setImageResource(R.drawable.day2);
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        ivDay3.setImageResource(R.drawable.day3);
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        ivDay4.setImageResource(R.drawable.day4);
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        ivDay5.setImageResource(R.drawable.day5);
    }
}