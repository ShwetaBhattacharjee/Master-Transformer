package com.example.project;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LivingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_living, container, false);

        final Button currency_button=(Button)view.findViewById(R.id.currency_button);
        final Button temperature_button=(Button)view.findViewById(R.id.temperature_button);
        final Button time_button=(Button)view.findViewById(R.id.time_button);
        final Button speed_button=(Button)view.findViewById(R.id.speed_button);

        currency_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currency_button.setBackgroundColor(Color.rgb(255,152,0));
                temperature_button.setBackgroundColor(Color.rgb(160,103,75));
                time_button.setBackgroundColor(Color.rgb(160,103,75));
                speed_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new LivingCurrencyFragment());
                fr.commit();
            }
        });



        temperature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temperature_button.setBackgroundColor(Color.rgb(255,152,0));
                currency_button.setBackgroundColor(Color.rgb(160,103,75));
                time_button.setBackgroundColor(Color.rgb(160,103,75));
                speed_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new LivingTemperatureFragment());
                fr.commit();
            }
        });



        time_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time_button.setBackgroundColor(Color.rgb(255,152,0));
                temperature_button.setBackgroundColor(Color.rgb(160,103,75));
                currency_button.setBackgroundColor(Color.rgb(160,103,75));
                speed_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new LivingTimeFragment());
                fr.commit();
            }
        });



        speed_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speed_button.setBackgroundColor(Color.rgb(255,152,0));
                temperature_button.setBackgroundColor(Color.rgb(160,103,75));
                time_button.setBackgroundColor(Color.rgb(160,103,75));
                currency_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_two,new LivingSpeedFragment());
                fr.commit();
            }
        });





        return view;
    }


}
