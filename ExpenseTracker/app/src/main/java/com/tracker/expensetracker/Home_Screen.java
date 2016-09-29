package com.tracker.expensetracker;


import android.app.ActivityManager;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class Home_Screen extends FragmentActivity {
    FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);
        tabHost = (FragmentTabHost)findViewById(R.id.tabHost);
        tabHost.setup(this, getSupportFragmentManager(),android.R.id.tabcontent);
        assert tabHost != null;
        final Intent addIntent = new Intent(this, AddActivity.class) ;
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch(tabId){
                    case "Home_Screen": tabHost.setCurrentTab(0);break;
                    case "Stats" :tabHost.setCurrentTab(1); break;
                    case "Map":  tabHost.setCurrentTab(2);break;
                    case "Settings": tabHost.setCurrentTab(3); break;
                    case "Add":
                        tabHost.setCurrentTab(4);
                        break;
                }
            }
        });

        //Tab 1

        tabHost.addTab(tabHost.newTabSpec("Home").setIndicator("home"),
                Home.class, null);

        tabHost.addTab(tabHost.newTabSpec("Stats").setIndicator("Stats"),
                ActivityStats.class, null);
        //Tab 3
        tabHost.addTab(tabHost.newTabSpec("Map").setIndicator("Map"),
                MapsOverviewActivity.class, null);

        tabHost.addTab(tabHost.newTabSpec("Settings").setIndicator("Settings"),
                SettingsActivity.class, null);

        //Tab 1

        tabHost.addTab(tabHost.newTabSpec("Add").setIndicator("Add"),
                AddActivity.class, null);

        tabHost.setCurrentTab(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public static class Home extends Fragment{
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View V = inflater.inflate(R.layout.activity_home__screen, container, false);
            return V;
        }
    }

}