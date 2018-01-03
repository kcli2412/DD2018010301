package com.example.student.dd2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView2);
    }

    public void click1(View v)
    {
        img.setImageResource(R.drawable.flower);
    }

    public void click2(View v)
    {
        Picasso.with(MainActivity.this).
                load("http://www.soeasyedu.com.tw/soeasy/activity/105/1050706-training/images/PP.png").
                into(img);
    }
}
