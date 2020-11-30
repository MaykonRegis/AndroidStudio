package com.example.android.meulocalx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnGps;
    TextView txtLatitude, txtLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitude = (TextView) findViewById(R.id.txtLatitude);
        txtLongitude = (TextView) findViewById(R.id.txtLongitude);

        btnGps = (Button) findViewById(R.id.btnGps);
        btnGps.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pedirPermissoes();
            }
        });

    }

    private void pedirPermissoes() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        } else {
            configurarServico();
        }

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    configurarServico();
                } else {
                    Toast.makeText(this, "Não vai funcionar!!!", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    public void configurarServico() {
        try {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            LocationListener locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    atualizar(location);
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {
                }

                @Override
                public void onProviderEnabled(String s) {
                }

                @Override
                public void onProviderDisabled(String s) {
                }
            };
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        } catch (SecurityException ex){
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }
    



    public void atualizar(Location location)
    {
        Double latPoint = location.getLatitude();
        Double lngPoint = location.getLongitude();

        txtLatitude.setText(latPoint.toString());
        txtLongitude.setText(lngPoint.toString());

        try {
            Address endereco = buscarEndereco(latPoint, lngPoint);

            TextView txt = (TextView) findViewById(R.id.cidadeView);
            txt.setText(endereco.getSubAdminArea());

            txt = (TextView) findViewById(R.id.estadoView);
            txt.setText("Estado: " + endereco.getAdminArea());

            txt = (TextView) findViewById(R.id.paisView);
            txt.setText("País: " + endereco.getCountryName());

        } catch (IOException e) {
            Log.i("GPS",e.getMessage());
        }
    }

    private Address buscarEndereco(double latitude, double longitude) throws IOException {

        Geocoder geocoder;
        Address address = null;
        List<Address> addresses;

        geocoder = new Geocoder(getApplicationContext());

        addresses = geocoder.getFromLocation(latitude,longitude,1);

        if(addresses.size()>0){
            address = addresses.get(0);
        }

        return address;

    }




}