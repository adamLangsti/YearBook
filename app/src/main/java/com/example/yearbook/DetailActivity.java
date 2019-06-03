package com.example.yearbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    TextView descTxt;

    final List<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        names.add("Quote !");
        names.add("Retard !");
        names.add("MÖÖH");
        names.add("Dildo");
        names.add("Egg");
        names.add("Schmuck");
        names.add("AAAA");


        Intent intent = getIntent();

        int currentPage = intent.getIntExtra("CP",0);
        String currentString = intent.getStringExtra("CS");

        descTxt = (TextView) findViewById(R.id.editText);
        String quote = names.get(currentPage);
        descTxt.setText(quote);


        Log.i("INFO","The id we received was " + currentPage);
        Log.i("INFO", "THE PIC WE GOT HAS THE ID " + currentString);

    }
}


