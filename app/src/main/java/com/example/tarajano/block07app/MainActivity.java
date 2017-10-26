package com.example.tarajano.block07app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = (NumberPicker) findViewById(R.id.numberPicker);
        String[] pickerOptions = {"Coursera", "Android", "Shopify", "Algonquin"};
        picker.setDisplayedValues(pickerOptions);
        picker.setMaxValue(pickerOptions.length - 1);
        picker.setMinValue(0);
    }

    public void navigate(View view) {
    }
}
