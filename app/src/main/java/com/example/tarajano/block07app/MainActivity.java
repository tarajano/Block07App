package com.example.tarajano.block07app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker picker;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);

        picker = (NumberPicker) findViewById(R.id.numberPicker);
        String[] pickerOptions = {"Coursera", "Android Studio", "Shopify", "Algonquin"};
        picker.setDisplayedValues(pickerOptions);
        picker.setMaxValue(pickerOptions.length - 1);
        picker.setMinValue(0);
    }

    public void navigate(View view) {
        int pickerChoice = picker.getValue();
        webView.setWebViewClient(new WebViewClient());
        if(pickerChoice == 0)
            webView.loadUrl("http://www.coursera.org");
        else if(pickerChoice == 1)
            webView.loadUrl("https://developer.android.com");
        else if(pickerChoice == 2)
            webView.loadUrl("https://www.shopify.com");
        else if(pickerChoice == 3)
            webView.loadUrl("https://www.algonquincollege.com");
        else
            webView.loadUrl("https://www.google.com");

    }
}
