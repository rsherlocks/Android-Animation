package com.example.androidshaper.animationlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LottieAnimationView lottieAnimationView;
    Button buttonStart,buttonOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView=findViewById(R.id.animationView);
        buttonStart=findViewById(R.id.buttonStart);
        buttonOff=findViewById(R.id.buttonOff);
        buttonOff.setOnClickListener(this);
        buttonStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.buttonStart)
        {
            Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show();
            lottieAnimationView.playAnimation();


        }
        else if (view.getId()==R.id.buttonOff)
        {
            Toast.makeText(this,"Off",Toast.LENGTH_SHORT).show();

            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(View.INVISIBLE);


        }


    }
            }