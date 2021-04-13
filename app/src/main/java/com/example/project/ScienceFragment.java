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


public class ScienceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_science, container, false);

        final Button pressure_button=(Button)view.findViewById(R.id.pressure_button);
        final Button concentration_button=(Button)view.findViewById(R.id.concentration_button);
        final Button viscosity_button=(Button)view.findViewById(R.id.viscosity_button);
        final Button torque_button=(Button)view.findViewById(R.id.torque_button);

        pressure_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pressure_button.setBackgroundColor(Color.rgb(255,152,0));
                concentration_button.setBackgroundColor(Color.rgb(160,103,75));
                viscosity_button.setBackgroundColor(Color.rgb(160,103,75));
                torque_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new SciencePressureFragment());
                fr.commit();
            }
        });



        concentration_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concentration_button.setBackgroundColor(Color.rgb(255,152,0));
                pressure_button.setBackgroundColor(Color.rgb(160,103,75));
                viscosity_button.setBackgroundColor(Color.rgb(160,103,75));
                torque_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new ScienceConcentrationFragment());
                fr.commit();
            }
        });



        viscosity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viscosity_button.setBackgroundColor(Color.rgb(255,152,0));
                pressure_button.setBackgroundColor(Color.rgb(160,103,75));
                concentration_button.setBackgroundColor(Color.rgb(160,103,75));
                torque_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new ScienceViscosityFragment());
                fr.commit();
            }
        });



        torque_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                torque_button.setBackgroundColor(Color.rgb(255,152,0));
                concentration_button.setBackgroundColor(Color.rgb(160,103,75));
                viscosity_button.setBackgroundColor(Color.rgb(160,103,75));
                pressure_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new ScienceTorqueFragment());
                fr.commit();
            }
        });







        return view;
    }

}
