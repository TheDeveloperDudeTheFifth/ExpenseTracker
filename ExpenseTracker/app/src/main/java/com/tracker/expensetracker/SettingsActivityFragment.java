package com.tracker.expensetracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
<<<<<<< HEAD
import android.widget.AdapterView;
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
>>>>>>> nicolas
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 22.09.2016.
 */
public class SettingsActivityFragment extends Fragment {

    public SettingsActivityFragment() {

    }

    @Override
<<<<<<< HEAD
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_settings);

        ExpandableListView fixedcosts = (ExpandableListView) findViewById(R.id.fixedcosts);
        ExpandableListView categories = (ExpandableListView) findViewById(R.id.categories);
        Button newFixedcost = (Button) findViewById(R.id.newFixedcost);
        TextView totalFixedcosts = (TextView) findViewById(R.id.totalFixedcosts);
        Spinner spinner = (Spinner) findViewById(R.id.dayofmonth_spinner);



=======
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.activity_screen_settings, container, false);
        return V;
>>>>>>> nicolas
    }
}
