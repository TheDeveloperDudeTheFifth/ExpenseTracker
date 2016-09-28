package com.tracker.expensetracker;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Home_Screen extends AppCompatActivity {
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Home");
        spec.setContent(R.id.Home);
        spec.setIndicator("home",Drawable.createFromPath());
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Stats");
        spec.setContent(R.id.Stats);
        spec.setIndicator("Stats");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Map");
        spec.setContent(R.id.Map);
        spec.setIndicator("Map");
        host.addTab(spec);

        spec = host.newTabSpec("Settings");
        spec.setContent(R.id.settings);
        spec.setIndicator("Settings");
        host.addTab(spec);

        spec = host.newTabSpec("Add");
        spec.setContent(R.id.add);
        spec.setIndicator("add");
        host.addTab(spec);

    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}

