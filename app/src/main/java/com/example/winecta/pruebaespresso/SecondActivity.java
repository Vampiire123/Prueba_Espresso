package com.example.winecta.pruebaespresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nice = (String) getIntent().getExtras().get("extra");

        TextView textView = findViewById(R.id.textView);
        textView.setText(nice);
    }
}