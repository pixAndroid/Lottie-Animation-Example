package com.androidcitizen.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private LottieAnimationView checkbox;

    private boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = findViewById(R.id.checkbox);

        checkbox.setMinFrame(20);
        checkbox.setMaxFrame(50);

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isChecked) {
                    checkbox.setSpeed(1);
                    checkbox.playAnimation();
                    isChecked = true;
                } else {
                    checkbox.setSpeed(-1);
                    checkbox.playAnimation();
                    isChecked = false;
                }
            }
        });

    }
}