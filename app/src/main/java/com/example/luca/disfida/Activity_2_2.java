package com.example.luca.disfida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_2);

        Button NextBtn = (Button) findViewById(R.id.NextBtn);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_2_1.class);
                startActivity(startIntent);
            }
        });

        Button BackBtn = (Button) findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

        ImageView Squirt =(ImageView) findViewById(R.id.SquirtImg);
        Animation SquirtTween = AnimationUtils.loadAnimation(this, R.anim.tween);
        Squirt.startAnimation(SquirtTween);

        ImageView Handle =(ImageView) findViewById(R.id.HandleImg);
        Animation HandleTrans = AnimationUtils.loadAnimation(this, R.anim.back_and_forth);
        Handle.startAnimation(HandleTrans);
    }
}
