package com.tracker.expensetracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import static android.R.*;
import static android.R.layout.simple_spinner_item;

/**
 * Created by admin on 28.09.2016.
 */
public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_settings);
    }

    Spinner spinner = (Spinner) findViewById(R.id.dayofmonth_spinner);
    //spinner.OnItemSelectedListener(this);

    List<Integer> listDays = new ArrayList<Integer>(31);
    //for(int i = 1; i < 32; i++) {
    //    listDays.add(i);
    //}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
