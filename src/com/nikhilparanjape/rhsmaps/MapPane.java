/*package com.nikhilparanjape.rhsmaps;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.app.Activity;
import android.os.Bundle;

public class MapPane extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng rhs = new LatLng(41.326778, -73.530086);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(rhs, 13));

        map.addMarker(new MarkerOptions()
                .title("Ridgefield High School")
                .snippet("The only high school in Ridgefield")
                .position(rhs));
    }
}*/