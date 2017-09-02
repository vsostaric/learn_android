package com.example.vladimirsostaric.block05;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String COLOR_CODE = "colorCode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout_collared);

        final SharedPreferences preferences = getSharedPreferences("COLOR_PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        if(preferences.contains(COLOR_CODE)) {
            layout.setBackgroundColor(preferences.getInt(COLOR_CODE, 0));
        }


        final RadioGroup group = (RadioGroup) findViewById(R.id.colors);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                int colorCode = 0;
                switch (checkedId) {
                    case R.id.blue_radio:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.red_radio:
                        colorCode = Color.RED;
                        break;
                    case R.id.green_radio:
                        colorCode = Color.GREEN;
                        break;
                }
                layout.setBackgroundColor(colorCode);
                editor.putInt(COLOR_CODE, colorCode);
                editor.commit();
            }
        });
    }
}
