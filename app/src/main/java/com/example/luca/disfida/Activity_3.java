package com.example.luca.disfida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.view.animation.Animation.AnimationListener;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //INITIALIZATION
        final pl.droidsonroids.gif.GifImageView BikeGif = (pl.droidsonroids.gif.GifImageView) findViewById(R.id.BikeGif);
        final TextView LevelText =(TextView) findViewById(R.id.LevelText);
        final pl.droidsonroids.gif.GifImageView GrandpaGif = (pl.droidsonroids.gif.GifImageView) findViewById(R.id.GrandpaGif);
        final TextView Explain = (TextView) findViewById(R.id.Exp);

        //ANIMATIONS
        Animation LevelTextFade = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        final Animation GrandpaTrans1 = AnimationUtils.loadAnimation(this, R.anim.left_to_center);
        final Animation GrandpaTrans2 = AnimationUtils.loadAnimation(this, R.anim.center_to_right);

        //BUTTON TO THE NEXT ACTIVITY
        final Button NextBtn2 = (Button) findViewById(R.id.NextBtn2);
        NextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_4.class);
                startActivity(startIntent);
            }
        });

        //BUTTON BACK TO ACTIVITY 2
        final Button BackBtn2 = (Button) findViewById(R.id.BackBtn2);
        BackBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Activity_2_1.class);
                startActivity(startIntent);
            }
        });

        //LEVEL TEXTURE APPEARS
        LevelText.startAnimation(LevelTextFade);

        //ANIMATION LISTENER. WHEN THE LEVEL ANIMATION IS OVER IT MAKES THE GRANDPA APPEAR
        // AND THE TEXT EXPLAINING THE LEVEL AS WELL
        LevelTextFade.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // WHEN THE LEVEL TEXTURE ENDS WE MAKE VISIBLE THE SCREEN STRUCTURE OF ACTIVITY 3
                LevelText.setVisibility(View.GONE);
                NextBtn2.setVisibility(View.VISIBLE);
                GrandpaGif.setVisibility(View.VISIBLE);
                Explain.setVisibility(View.VISIBLE);
                BackBtn2.setVisibility(View.VISIBLE);

                GrandpaGif.startAnimation(GrandpaTrans1);
            }
        });
    }
}
