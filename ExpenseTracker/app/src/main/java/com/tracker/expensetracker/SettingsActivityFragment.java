package com.tracker.expensetracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 22.09.2016.
 */
public class SettingsActivityFragment extends Fragment {

    public SettingsActivityFragment() {

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.activity_screen_settings, container, false);
        return V;
    }


}
