package com.example.vladimirsostaric.block01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.vladimirsostaric.block01.buttons.PinkButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button blueButton;

    private PinkButton pinkButton;

    private Toast pinkToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueButton = (Button) findViewById(R.id.blue_button);
        blueButton.setOnClickListener(this);

        pinkButton = new PinkButton(getApplicationContext());

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayoutMainScreen);
        relativeLayout.addView(new PinkButton(getApplicationContext()), pinkButton.getPinkLayoutParams());

        pinkButton.setOnClickListener(this);

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
            ((PinkButton) view).getPinkToast().show();
        }

    }
}
