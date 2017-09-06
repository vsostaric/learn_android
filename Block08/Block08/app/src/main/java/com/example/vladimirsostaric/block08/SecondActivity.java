package com.example.vladimirsostaric.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent caller = getIntent();

        float rating = caller.getFloatExtra(getString(R.string.rating), 0);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Rating: " + rating);

    }
}
