package com.example.ahattab.sidebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();

        TextView tv1 = findViewById(R.id.history);

        String value1 = i.getStringExtra("value");

        // Best to get your text from resources, and to user Strin.format for concatination.
        tv1.setText(String.format(  value1 + "\n"));
    }
}
