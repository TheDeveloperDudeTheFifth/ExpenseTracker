package com.tracker.expensetracker;


import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Home_Screen extends AppCompatActivity {
    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home__screen);
        setContentView(R.layout.activity_screen_settings);


        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch(tabId){
                    case "home": setContentView(R.layout.home);
                        break;
                }

            }
        });



    }

}

