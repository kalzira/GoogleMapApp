package com.example.googlemapapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static LatLng MELBOURNE;
    private Marker melbourne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {



        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(38.609556, -1.139637))
                .anchor(0.5f, 0.5f)
                .title("Title1")
                .snippet("Snippet1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_arrow)));



        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(40.4272414,-3.7020037))
                .anchor(0.5f, 0.5f)
                .title("Title2")
                .snippet("Snippet2")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_add_shopping_cart)));

        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.2568193,-2.9225534))
                .anchor(0.5f, 0.5f)
                .title("Title3")
                .snippet("Snippet3")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_android)));
        Marker m4 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.2568193,-2.9225534))
                .anchor(0.5f, 0.5f)
                .title("Title3")
                .snippet("Snippet4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_fastfood)));

    }

}
