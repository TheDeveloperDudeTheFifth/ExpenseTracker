package com.tracker.expensetracker;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

/**
 * Created by admin on 28.09.2016.
 */
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_settings);

        double monthlyIncome;

        final EditText et = (EditText) findViewById(R.id.salary);


        NumberPicker np = (NumberPicker) findViewById(R.id.number_picker);
        np.setMinValue(1);
        np.setMaxValue(31);
        np.setWrapSelectorWheel(true);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                int day = newVal;
            }
        });

        Button btn = (Button) findViewById(R.id.np_apply_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double monthlyIncome = Double.parseDouble(et.getText().toString());
            }
        });

        Button newFix = (Button) findViewById(R.id.newFixedcost);
        newFix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CreateFixedcost.class);
                startActivity(i);
            }
        });
    }

    /*public void addFixcost(View view) {
        Intent i = new Intent(this, CreateFixedcost.class);

    }*/
}
