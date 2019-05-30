package com.example.yearbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        Intent intent = getIntent();


        int value = intent.getIntExtra("ID",0);
        EditText = (TextView) findViewById(R.id.editText);

        Intent intent = getIntent();
        String str = intent.getStringExtra("");
        TextView.setText(str);

        Log.i("INFO","The id we received was " + value);

    }
}


