package com.example.project;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

public class converter extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        final Button basic_button = (Button) findViewById(R.id.basic_button);
        final Button living_button = (Button) findViewById(R.id.living_button);
        final Button science_button = (Button) findViewById(R.id.science_button);
        final Button misc_button = (Button) findViewById(R.id.misc_button);


        basic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basic_button.setBackgroundColor(Color.RED);
                living_button.setBackgroundColor(Color.rgb(0,0,0));
                science_button.setBackgroundColor(Color.rgb(0,0,0));
                misc_button.setBackgroundColor(Color.rgb(0,0,0));
                FragmentManager fragmentManager = getSupportFragmentManager();
                BasicFragment fragment = new BasicFragment();
                BasicLengthFragment fragment2=new BasicLengthFragment();
                fragmentManager.beginTransaction().replace(R.id.fragment_one, fragment).commit();
                fragmentManager.beginTransaction().replace(R.id.fragment_two, fragment2).commit();

           ;
            }
        });

        living_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                living_button.setBackgroundColor(Color.RED);
                basic_button.setBackgroundColor(Color.rgb(0,0,0));
                science_button.setBackgroundColor(Color.rgb(0,0,0));
                misc_button.setBackgroundColor(Color.rgb(0,0,0));
                FragmentManager fragmentManager = getSupportFragmentManager();
                LivingFragment fragment = new LivingFragment();
                LivingCurrencyFragment fragment3=new LivingCurrencyFragment();
                fragmentManager.beginTransaction().replace(R.id.fragment_one, fragment).commit();
                fragmentManager.beginTransaction().replace(R.id.fragment_two, fragment3).commit();
                ;
            }
        });

        science_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                science_button.setBackgroundColor(Color.RED);
                basic_button.setBackgroundColor(Color.rgb(0,0,0));
                living_button.setBackgroundColor(Color.rgb(0,0,0));
                misc_button.setBackgroundColor(Color.rgb(0,0,0));
                FragmentManager fragmentManager = getSupportFragmentManager();
                ScienceFragment fragment = new ScienceFragment();
                SciencePressureFragment fragment4=new SciencePressureFragment();
                fragmentManager.beginTransaction().replace(R.id.fragment_one, fragment).commit();
                fragmentManager.beginTransaction().replace(R.id.fragment_two, fragment4).commit();
            }
        });
        misc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                misc_button.setBackgroundColor(Color.RED);
                basic_button.setBackgroundColor(Color.rgb(0,0,0));
                science_button.setBackgroundColor(Color.rgb(0,0,0));
                living_button.setBackgroundColor(Color.rgb(0,0,0));
                FragmentManager fragmentManager = getSupportFragmentManager();
                MiscFragment fragment = new MiscFragment();
                MiscFuelFragment fragment5=new MiscFuelFragment();
                fragmentManager.beginTransaction().replace(R.id.fragment_one, fragment).commit();
                fragmentManager.beginTransaction().replace(R.id.fragment_two, fragment5).commit();

            }
        });


    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_down);
    }


}
