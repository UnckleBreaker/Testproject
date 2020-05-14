package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String TAG = "Activity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cx =button.getWidth()/2;
                int cy= button.getHeight()/2;
                float radius = button.getWidth();
                Animator animator = ViewAnimationUtils.createCircularReveal(button,cx,cy,radius,0);
                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        button.setVisibility(View.VISIBLE);
                    }
                });
                animator.start();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
