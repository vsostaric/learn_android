package com.example.vladimirsostaric.block01.buttons;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.vladimirsostaric.block01.R;

/**
 * Created by VladimirSostaric on 28.8.2017..
 */

public class PinkButton extends AppCompatButton {

    private Context context;

    public PinkButton(Context context) {
        super(context);
        setTextColor(Color.BLACK);
        setBackgroundColor(Color.parseColor("#FD9BF3"));
        setText("The Pink Panther&apos;s To Do List");

    }

    public Toast getPinkToast() {
        return Toast.makeText(getContext(), "to do to do to do ...", Toast.LENGTH_SHORT);
    }

    public RelativeLayout.LayoutParams getPinkLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.addRule(RelativeLayout.BELOW, R.id.blue_button);
        return layoutParams;
    }
}
