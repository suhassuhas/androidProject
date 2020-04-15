package com.example.location_notify_final.Interface;

import com.google.android.gms.maps.model.LatLng;

import com.example.location_notify_final.MyLatLng;

import java.util.List;

public interface IOnloadLocationListener {

    void onLoadLocationSuccess(List<MyLatLng> latLngs);

    void onLoadLocationFailed(String Message);
}
