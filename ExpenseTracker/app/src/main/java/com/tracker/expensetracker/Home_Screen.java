package com.tracker.expensetracker;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Home_Screen extends AppCompatActivity {
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen);

        tabHost = (TabHost)findViewById(R.id.tabHost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");

        tab1.setIndicator("Tab1");
        tab1.setContent(new Intent(this,Home_Screen.class));



        tabHost.addTab(tab1);

    }

}

