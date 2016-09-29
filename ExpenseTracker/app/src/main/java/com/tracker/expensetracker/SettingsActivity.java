package com.tracker.expensetracker;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

/**
 * Created by admin on 28.09.2016.
 */
public class SettingsActivity extends Fragment {
    public EditText et;
    public NumberPicker np;
    public Button btn;
    public Button newFix;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View V = inflater.inflate(R.layout.activity_screen_settings, container, false);
        return V;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        double monthlyIncome;
        super.onActivityCreated(savedInstanceState);
         et = (EditText) getView().findViewById(R.id.salary);


        np = (NumberPicker) getView().findViewById(R.id.number_picker);
        np.setMinValue(1);
        np.setMaxValue(31);
        np.setWrapSelectorWheel(true);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                int day = newVal;
            }
        });

        btn = (Button) getView().findViewById(R.id.np_apply_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double monthlyIncome = Double.parseDouble(et.getText().toString());
            }
        });

         newFix = (Button) getView().findViewById(R.id.newFixedcost);
        newFix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), CreateFixedcost.class);
               // startActivity(i);
            }
        });
    }



    /*public void addFixcost(View view) {
        Intent i = new Intent(this, CreateFixedcost.class);

    }*/
}
