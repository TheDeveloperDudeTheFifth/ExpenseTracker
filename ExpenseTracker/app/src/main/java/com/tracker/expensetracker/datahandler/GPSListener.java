package com.tracker.expensetracker.datahandler;

import android.location.Geocoder;
import android.location.Location;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.tracker.expensetracker.AddActivity;

import java.util.Locale;

/**
 * Created by admin on 28.09.2016.
 */
public class GPSListener extends AddActivity implements android.location.LocationListener {


    private Location location;

    public Location getLocation(){
        return this.location;
    }
    public void setLocation(Location location){
        this.location = location;
    }
    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
