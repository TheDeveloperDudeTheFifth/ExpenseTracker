package com.tracker.expensetracker;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 28.09.2016.
 */
public class CreateFixedcost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String fixcostName;
        double fixcostValue;
        final EditText etn = (EditText) findViewById(R.id.new_fixcost_name);

        final EditText etv = (EditText) findViewById(R.id.new_fixcost_value);


        Button btn = (Button) findViewById(R.id.add_new_fixcost);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fixcostName = etn.getText().toString();
                double fixcostValue = Double.parseDouble(etv.getText().toString());
                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
            }
        });

    }
}
