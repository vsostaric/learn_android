package com.example.vladimirsostaric.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void enter(View view) {

        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar);
        final float rating = bar.getRating();

        Intent goToSecondActivity = new Intent();
        goToSecondActivity.setClass(this, SecondActivity.class);
        goToSecondActivity.putExtra(getString(R.string.rating), rating);

        startActivity(goToSecondActivity);

    }
}
