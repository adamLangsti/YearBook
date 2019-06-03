package com.example.yearbook;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.yearbook.FragmentClass.MESSAGE;

public class MainActivity extends AppCompatActivity {

    private Button btnInfo;
    FragmentClassAdapter pagerAdapter;
    int currentPage = 0;
    String currentString;

    final List<Fragment> fragmentList = new ArrayList<Fragment>();

    final List<Fragment> fragmentList1 = new ArrayList<>();

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        TextView editText = (TextView) findViewById(R.id.editText);

        pager = (ViewPager) findViewById(R.id.viewPager);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("CP",currentPage);

                startActivity(intent);
            }
        });

        fragmentList1.add(FragmentClass.newInstance("Alexander Johansson, 60 years old, North Korean spy", 0));
        fragmentList1.add(FragmentClass.newInstance("Adriana Larsson, married to Chuck Norris", 1));
        fragmentList1.add(FragmentClass.newInstance("David (Bitch & Snitch) Hjorth, sells a$$", 2));
        fragmentList1.add(FragmentClass.newInstance("Edgar Palic, denna vecka på efterlyst!", 3));
        fragmentList1.add(FragmentClass.newInstance("Eric Hedrenius, adviser to Donald Trump ", 4));
        fragmentList1.add(FragmentClass.newInstance("Faisal Akhtar, uranium dealer", 5));
        fragmentList1.add(FragmentClass.newInstance("Jonathan Vahlberg, hacks computers worldwide", 6));
        fragmentList1.add(FragmentClass.newInstance("Sano Gharzani, strives for world domination", 7));

        fragmentList.add(FragmentClass.newInstance("Alexander Johansson", R.drawable.alex));
        fragmentList.add(FragmentClass.newInstance("Adriana Larsson", R.drawable.adriana));
        fragmentList.add(FragmentClass.newInstance("David Hjorth", R.drawable.david));
        fragmentList.add(FragmentClass.newInstance("Edgar Palic", R.drawable.edgar));
        fragmentList.add(FragmentClass.newInstance("Erik Hedrenius", R.drawable.erik));
        fragmentList.add(FragmentClass.newInstance("Faisal Akhtar", R.drawable.faisal));
        fragmentList.add(FragmentClass.newInstance("Jonathan Vahlberg", R.drawable.jonathan));
        fragmentList.add(FragmentClass.newInstance("Sano Gharzani", R.drawable.sano));


        pagerAdapter = new FragmentClassAdapter(getSupportFragmentManager(), fragmentList);
        pager.setAdapter(pagerAdapter);


        /*editAdapter = new FragmentClassAdapter(getSupportFragmentManager(), fragmentList1);
        final TextView text = (TextView) findViewById(R.id.editText);*/

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override

            public void onPageScrolled(int i, float v, int i1) {
                Log.i("Scroll", "Scrolling");
            }

            @Override
            public void onPageSelected(int i) { currentPage = i; currentString = "0";
            }
            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }
}

