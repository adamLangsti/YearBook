package com.example.yearbook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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



        names.add("Alexander Johansson, 60 years old, North Korean spy");
        names.add("Adriana Larsson, married to Chuck Norris!");
        names.add("David (Bitch & Snitch) Hjorth, sells a$$");
        names.add("Edgar Palic, denna vecka på efterlyst!");
        names.add("Eric Hedrenius, adviser to Donald Trump ");
        names.add("Faisal Akhtar, uranium dealer");
        names.add("Jonathan Vahlberg, hacks computers worldwide");
        names.add("Sano Gharzani, strives for world domination");


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


