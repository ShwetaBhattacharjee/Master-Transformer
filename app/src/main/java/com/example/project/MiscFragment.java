package com.example.project;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MiscFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_misc, container, false);

        final Button fuel_button=(Button)view.findViewById(R.id.fuel_button);
        final Button illuminance_button=(Button)view.findViewById(R.id.illuminance_button);
        final Button radiation_button=(Button)view.findViewById(R.id.radiation_button);
        final Button blood_button=(Button)view.findViewById(R.id.blood_button);

        fuel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fuel_button.setBackgroundColor(Color.rgb(255,152,0));
                illuminance_button.setBackgroundColor(Color.rgb(160,103,75));
                radiation_button.setBackgroundColor(Color.rgb(160,103,75));
                blood_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new MiscFuelFragment());
                fr.commit();
            }
        });



        illuminance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                illuminance_button.setBackgroundColor(Color.rgb(255,152,0));
                fuel_button.setBackgroundColor(Color.rgb(160,103,75));
                radiation_button.setBackgroundColor(Color.rgb(160,103,75));
                blood_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new MiscIlluminanceFragment());
                fr.commit();
            }
        });



        radiation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radiation_button.setBackgroundColor(Color.rgb(255,152,0));
                illuminance_button.setBackgroundColor(Color.rgb(160,103,75));
                fuel_button.setBackgroundColor(Color.rgb(160,103,75));
                blood_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new MiscRadiationFragment());
                fr.commit();
            }
        });



        blood_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood_button.setBackgroundColor(Color.rgb(255,152,0));
                illuminance_button.setBackgroundColor(Color.rgb(160,103,75));
                radiation_button.setBackgroundColor(Color.rgb(160,103,75));
                fuel_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new MiscBloodSugar());
                fr.commit();
            }
        });






        return view;
    }


}
