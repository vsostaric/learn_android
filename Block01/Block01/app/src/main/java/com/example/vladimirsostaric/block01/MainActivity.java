package com.example.vladimirsostaric.block01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button blueButton;

    private Button pinkButton;

    private Toast pinkToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueButton = (Button) findViewById(R.id.blue_button);
        pinkButton = (Button) findViewById(R.id.pink_button);

        blueButton.setOnClickListener(this);
        pinkButton.setOnClickListener(this);

        pinkToast = Toast.makeText(getApplicationContext(), "to do to do to do ...", Toast.LENGTH_SHORT);
    }

    @Override
    public void onClick(View view) {
        toDo(view);
    }

    public void toDo(View view) {

        if(view == null) {
            return;
        }

        if(view.equals(blueButton)) {
            view.setVisibility(View.INVISIBLE);
        } else if(view.equals(pinkButton)) {
            pinkToast.show();
        }

    }
}
