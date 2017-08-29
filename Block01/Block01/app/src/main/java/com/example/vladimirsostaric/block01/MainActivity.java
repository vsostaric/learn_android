package com.example.vladimirsostaric.block01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.vladimirsostaric.block01.buttons.ButtonFactory;
import com.example.vladimirsostaric.block01.buttons.ButtonType;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button blueButton;

    private Button pinkButton;

    private Toast pinkToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueButton = (Button) findViewById(R.id.blue_button);

        ButtonFactory buttonFactory = new ButtonFactory();
        pinkButton = buttonFactory.makeButton(ButtonType.PINK, getApplicationContext());

        RelativeLayout relativeLayoutMainScreen = (RelativeLayout) findViewById(R.id.relativeLayoutMainScreen);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.BELOW, blueButton.getId());

        relativeLayoutMainScreen.addView(pinkButton, layoutParams);

        blueButton.setOnClickListener(this);
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
            Toast.makeText(getApplicationContext(), "pinky toast pinky", Toast.LENGTH_SHORT).show();
        }

    }
}
