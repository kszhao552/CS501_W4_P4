package com.example.w4_p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        layout = findViewById(R.id.relativeLayout);
        layout.setOnTouchListener(new OnSwipeTouchListener(HomeActivity.this) {
            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Intent intent = new Intent(HomeActivity.this, EastActivity.class);
                startActivity(intent);
                //Toast.makeText(HomeActivity.this, "Swipe Left gesture detected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onSwipeRight(){
                super.onSwipeRight();
                Intent intent = new Intent(HomeActivity.this, WestActivity.class);
                startActivity(intent);
            }
            @Override
            public void onSwipeUp(){
                super.onSwipeUp();
                Intent intent = new Intent(HomeActivity.this, NorthActivity.class);
                startActivity(intent);
            }


            @Override
            public void onSwipeDown() {
                super.onSwipeDown();
                Intent intent = new Intent(HomeActivity.this, SouthActivity.class);
                startActivity(intent);
            }
        });
    }
}

