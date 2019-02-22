package com.example.ahattab.sidebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();

        TextView tv1 = findViewById(R.id.aboutDisplay);
        String textToBeDisplayed1 = "Version: 1.0" + "\n" + "Dev name: Ahmad Hattab";

        tv1.setText(textToBeDisplayed1);
    }
}
