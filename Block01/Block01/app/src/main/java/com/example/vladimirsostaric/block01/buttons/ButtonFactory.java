package com.example.vladimirsostaric.block01.buttons;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;

/**
 * Created by VladimirSostaric on 29.8.2017..
 */

public class ButtonFactory {

    public Button makeButton(ButtonType type, Context context) {

        if(type == null) {
            return null;
        }

        Button button = new Button(context);

        if(ButtonType.PINK.equals(type)) {
            button.setTextColor(Color.BLACK);
            button.setBackgroundColor(Color.parseColor("#FD9BF3"));
            button.setText("Pink Button shows a to do toast");
        }

        return button;

    }
}
