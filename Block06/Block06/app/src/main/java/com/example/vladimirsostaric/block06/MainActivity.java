package com.example.vladimirsostaric.block06;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView largeImage = (ImageView) findViewById(R.id.large);
        largeImage.setImageResource(R.drawable.drawing);

        SeekBar tuner = (SeekBar) findViewById(R.id.tuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int lastProgress;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                largeImage.setColorFilter(Color.argb(255, 0, lastProgress, 255-lastProgress));
            }
        });

        ImageView smallImage = (ImageView) findViewById(R.id.small);
        smallImage.setImageResource(R.drawable.drawing);

    }
}
