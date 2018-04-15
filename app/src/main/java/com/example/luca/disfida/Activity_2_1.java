package com.example.luca.disfida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_1);

        Button NextBtn = (Button) findViewById(R.id.NextBtn);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_3.class);
                startActivity(startIntent);
            }
        });

        Button BackBtn = (Button) findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_2_2.class);
                startActivity(startIntent);
            }
        });

        ImageView Crank =(ImageView) findViewById(R.id.CrankImg);
        Animation CrankRight = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Crank.startAnimation(CrankRight);

        ImageView Cup =(ImageView) findViewById(R.id.CupImg);
        Animation RotateCup = AnimationUtils.loadAnimation(this, R.anim.rotatecup);
        Cup.startAnimation(RotateCup);
    }
}
