package com.example.vladimirsostaric.block07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    private NumberPicker possibilities;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        possibilities = (NumberPicker) findViewById(R.id.possibilities);
        String[] displayValues = {
          "Google", "GitHub", "Croz", "Google - page"
        };

        possibilities.setDisplayedValues(displayValues);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(displayValues.length-1);

    }

    public void navigate(View view) {

        int choice = possibilities.getValue();

        if(choice == 0) {
            webView.loadUrl("file:///android_asset/google.html");
        } else if (choice == 1) {
            webView.loadUrl("file:///android_asset/github.html");
        } else if (choice == 2) {
            webView.loadUrl("file:///android_asset/croz.html");
        } else if (choice == 3) {
            webView.loadUrl("https://www.google.hr");
        }

    }
}
