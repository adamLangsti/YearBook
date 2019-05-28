package com.example.yearbook;

import android.content.Intent;
import android.widget.TextView;

public class DetailActivity {


    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.MESSAGE);


    TextView textView = findViewById(R.id.textView);
    textView.setText(message);
}
