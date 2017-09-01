package com.example.vladimirsostaric.block04;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer piano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        piano = MediaPlayer.create(this, R.raw.piano);

        Switch looping = (Switch) findViewById(R.id.looping);
        looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                piano.setLooping(isChecked);
            }
        });
    }

    public void play(View view) {
        piano.start();
    }

    public void pause(View view) {
        if(piano.isPlaying()) {
            piano.pause();
        }
    }
}
