package com.example.juanp.sonidos_ejercicio1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickImatgeAnimal(View v) {
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.girar);
        v.startAnimation(animacion);
        MediaPlayer so = null;
        switch (v.getId()) {
            case R.id.imageButton5:
                so = MediaPlayer.create(this, R.raw.trompeta);
                break;
            case R.id.imageButton7:
                so = MediaPlayer.create(this, R.raw.piano);
                break;
            case R.id.imageButton4:
                so = MediaPlayer.create(this, R.raw.tambor);
                break;
            case R.id.imageButton10:
                so = MediaPlayer.create(this, R.raw.clarinete);
                break;
            case R.id.imageButton3:
                so = MediaPlayer.create(this, R.raw.violin);
                break;
            case R.id.imageButton11:
                so = MediaPlayer.create(this, R.raw.platillos);
                break;
        }

        so.start();


        so.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    /*public void presionTambor(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.tambor);
        mp.start();
    }
    public void presionClarinete(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.clarinete);
        mp.start();
        Animation animacion = AnimationUtils.loadAnimation (this,R.animator.girar);
                v. startAnimation (animacion);
    }
    public void presionPiano(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.piano);
        mp.start();
    }
    public void presionPlatillos(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.platillos);
        mp.start();
    }
    public void presionTrompeta(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.trompeta);
        mp.start();
    }
    public void presionViolin(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.violin);
        mp.start();
    }*/
}
