package com.example.yearbook;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import static com.example.yearbook.FragmentClass.MESSAGE;

public class MainActivity extends AppCompatActivity {

    private Button btnInfo;
    FragmentClassAdapter pagerAdapter;
    int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInfo = (Button) findViewById(R.id.btnInfo);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("ID",currentPage);
                startActivity(intent);
            }
        });

        final List<Fragment> fragmentList = new ArrayList<Fragment>();

        fragmentList.add(FragmentClass.newInstance("Adriana Larsson", R.drawable.adriana));
        fragmentList.add(FragmentClass.newInstance("Alexander Johansson", R.drawable.alex));
        fragmentList.add(FragmentClass.newInstance("David Hjorth", R.drawable.david));
        fragmentList.add(FragmentClass.newInstance("Edgar Palic", R.drawable.edgar));
        fragmentList.add(FragmentClass.newInstance("Erik Hedrenius", R.drawable.erik));
        fragmentList.add(FragmentClass.newInstance("Faisal Akhtar", R.drawable.faisal));
        fragmentList.add(FragmentClass.newInstance("Jonathan Vahlberg", R.drawable.jonathan));
        fragmentList.add(FragmentClass.newInstance("Sano Gharzani", R.drawable.sano));


        pagerAdapter = new FragmentClassAdapter(getSupportFragmentManager(), fragmentList);
        final ViewPager pager = (ViewPager) findViewById(R.id.viewPager);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override

            public void onPageScrolled(int i, float v, int i1) {
                Log.i("Scroll", "Scrolling");
            }

            @Override
            public void onPageSelected(int i) {
                currentPage = i;
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        pager.setAdapter(pagerAdapter);
    }
}

