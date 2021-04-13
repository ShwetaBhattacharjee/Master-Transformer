package com.example.project;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BasicFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_basic, container, false);

        final Button lenght_button=(Button)view.findViewById(R.id.length_button);
        final Button area_button=(Button)view.findViewById(R.id.area_button);
        final Button weight_button=(Button)view.findViewById(R.id.weight_button);
        final Button volume_button=(Button)view.findViewById(R.id.volume_button);

        lenght_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lenght_button.setBackgroundColor(Color.rgb(255,152,0));
                area_button.setBackgroundColor(Color.rgb(160,103,75));
                weight_button.setBackgroundColor(Color.rgb(160,103,75));
                volume_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                //ft.setCustomAnimations(R.anim.activity_slide_from_bottom, R.anim.activity_stay);
                fr.replace(R.id.fragment_two,new BasicLengthFragment());
                fr.commit();

            }
        });



        area_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                area_button.setBackgroundColor(Color.rgb(255,152,0));
                lenght_button.setBackgroundColor(Color.rgb(160,103,75));
                weight_button.setBackgroundColor(Color.rgb(160,103,75));
                volume_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                //fr.setCustomAnimations(R.anim.activity_slide_from_bottom, R.anim.activity_stay);
                fr.replace(R.id.fragment_two,new BasicAreaFragment());
                fr.commit();
            }
        });



        weight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight_button.setBackgroundColor(Color.rgb(255,152,0));
                lenght_button.setBackgroundColor(Color.rgb(160,103,75));
                area_button.setBackgroundColor(Color.rgb(160,103,75));
                volume_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                //fr.setCustomAnimations(R.anim.activity_slide_from_bottom, R.anim.activity_stay);
                fr.replace(R.id.fragment_two,new BasicWeightFragment());
                fr.commit();
            }
        });



        volume_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volume_button.setBackgroundColor(Color.rgb(255,152,0));
                lenght_button.setBackgroundColor(Color.rgb(160,103,75));
                weight_button.setBackgroundColor(Color.rgb(160,103,75));
                area_button.setBackgroundColor(Color.rgb(160,103,75));
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                //fr.setCustomAnimations(R.anim.activity_slide_from_bottom, R.anim.activity_stay);
                fr.replace(R.id.fragment_two,new BasicVolumeFragment());
                fr.commit();
            }
        });







        return view;
    }


}
