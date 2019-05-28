package com.example.yearbook;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnInfo;
    
    private class FragmentClassAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments;

        public FragmentClassAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int i) {

            return this.fragments.get(i);
        }

        @Override
        public int getCount() {

            return this.fragments.size();
        }
    }

    FragmentClassAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInfo = new Button(this);

        btnInfo.setOnClickListener(new btnInfoClick());


        Intent intent = new Intent(this, DetailActivity.class);

        String message = editText.getText().toString();
        intent.putExtra(MESSAGE, message);
        startActivity(intent);



        List<Fragment> fragmentList = new ArrayList<Fragment>();

        fragmentList.add(FragmentClass.newInstance("Adriana Larsson", R.drawable.adriana));
        fragmentList.add(FragmentClass.newInstance("Alexander Johansson", R.drawable.alex));
        fragmentList.add(FragmentClass.newInstance("David Hjorth", R.drawable.david));
        fragmentList.add(FragmentClass.newInstance("Edgar Palic", R.drawable.edgar));
        fragmentList.add(FragmentClass.newInstance("Erik Hedrenius", R.drawable.erik));
        fragmentList.add(FragmentClass.newInstance("Faisal Akhtar", R.drawable.faisal));
        fragmentList.add(FragmentClass.newInstance("Jonathan Vahlberg", R.drawable.jonathan));
        fragmentList.add(FragmentClass.newInstance("Sano Gharzani", R.drawable.sano));


        pagerAdapter = new FragmentClassAdapter(getSupportFragmentManager(), fragmentList);


        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(pagerAdapter);

    }

    private void infoBtnClicked() {
        btnInfo.setText("Indeed");
    }

    class infoBtnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            btnInfoClicked();
        }
    }
}
