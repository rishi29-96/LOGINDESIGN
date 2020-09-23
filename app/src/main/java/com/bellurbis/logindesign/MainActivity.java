package com.bellurbis.logindesign;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {
    MediaPlayer oursong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer oursong = MediaPlayer.create(MainActivity.this, R.raw.music);
        oursong.start();
    }
}