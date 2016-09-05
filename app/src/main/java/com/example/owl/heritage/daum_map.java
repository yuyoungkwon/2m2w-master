package com.example.owl.heritage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


// Created by owl on 2016-09-05.

public class daum_map extends AppCompatActivity implements MapView.MapViewEventListener {

    private static final String DAUM_API_KEY = "97f41014e36ff8e1707666e7be5fa51e";

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daum_map_content);

        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey(DAUM_API_KEY);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.map_view);
        viewGroup.addView(mapView);
        mapView.setMapViewEventListener(this);

    }

    @Override
    public void onMapViewInitialized(MapView mapView) {

        MapPoint myPoint = MapPoint.mapPointWithGeoCoord(37.6225033,126.9105216);
        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("wow");
        marker.setTag(0);
        marker.setMapPoint(myPoint);

        mapView.setMapCenterPoint(myPoint,true);
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);
        mapView.addPOIItem(marker);
        mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithoutHeading);
    }

    @Override
    public void onMapViewCenterPointMoved(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewZoomLevelChanged(MapView mapView, int i) {

    }

    @Override
    public void onMapViewSingleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDoubleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewLongPressed(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragStarted(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragEnded(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewMoveFinished(MapView mapView, MapPoint mapPoint) {

    }
}

