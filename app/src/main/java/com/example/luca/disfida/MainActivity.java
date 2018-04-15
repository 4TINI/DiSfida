package com.example.luca.disfida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button StartBtn = (Button) findViewById(R.id.StartBtn);
        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_2_2.class);
                startActivity(startIntent);
            }
        });

        ImageButton SetBtn = (ImageButton) findViewById(R.id.SetBtn);
        SetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Settings.class);
                startActivity(startIntent);
            }
        });

        ImageView BloodBoy =(ImageView) findViewById(R.id.BloodBoy);
        Animation BloodBoyFade = AnimationUtils.loadAnimation(this, R.anim.tween);
        BloodBoy.startAnimation(BloodBoyFade);

        ImageView BloodGirl =(ImageView) findViewById(R.id.BloodGirl);
        Animation BloodGirlFade = AnimationUtils.loadAnimation(this, R.anim.tween);
        BloodGirl.startAnimation(BloodGirlFade);
    }
}
