package com.example.project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MiscIlluminanceFragment extends Fragment {
EditText inputtextillluminance;
double value;
TextView lux,lumen_m2,lumen_cm2,lumen_ft2,foot_candle,meter_candle,phot,uw_cm2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_misc_illuminance, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.illuminance_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.Illuminances,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        inputtextillluminance=view.findViewById(R.id.inputtextilluminance);
        lux=view.findViewById(R.id.lux);
        lumen_m2=view.findViewById(R.id.lumen_m2);
        lumen_cm2=view.findViewById(R.id.lumen_cm2);
        lumen_ft2=view.findViewById(R.id.lumen_ft2);
        meter_candle=view.findViewById(R.id.meter_candle);
        foot_candle=view.findViewById(R.id.foot_candle);
        phot=view.findViewById(R.id.phot);
        uw_cm2=view.findViewById(R.id.uw_cm2);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////lux////////////////////////////////////
                    case 0:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value));//
                                    lumen_m2.setText(String.valueOf(value*1));
                                    meter_candle.setText(String.valueOf(value*1));
                                    lumen_ft2.setText(String.valueOf(value*0.092903));
                                    foot_candle.setText(String.valueOf(value*0.092903));
                                    lumen_cm2.setText(String.valueOf(value*0.0001));
                                    phot.setText(String.valueOf(value*0.0001));
                                    uw_cm2.setText(String.valueOf(value*0.146413));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////lumen_m2////////////////////////////////////
                    case 1:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*1));
                                    lumen_m2.setText(String.valueOf(value));//
                                    meter_candle.setText(String.valueOf(value*1));
                                    lumen_ft2.setText(String.valueOf(value*0.092903));
                                    foot_candle.setText(String.valueOf(value*0.092903));
                                    lumen_cm2.setText(String.valueOf(value*0.0001));
                                    phot.setText(String.valueOf(value*0.0001));
                                    uw_cm2.setText(String.valueOf(value*0.146413));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////lumen_cm2////////////////////////////////////
                    case 2:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*10000));
                                    lumen_m2.setText(String.valueOf(value*10000));
                                    meter_candle.setText(String.valueOf(value*10000));
                                    lumen_ft2.setText(String.valueOf(value*929.0304));
                                    foot_candle.setText(String.valueOf(value*929.0304));
                                    lumen_cm2.setText(String.valueOf(value));//
                                    phot.setText(String.valueOf(value*1));
                                    uw_cm2.setText(String.valueOf(value*1464.12884));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////lumen_ft2////////////////////////////////////
                    case 3:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*10.76391));
                                    lumen_m2.setText(String.valueOf(value*10.76391));
                                    meter_candle.setText(String.valueOf(value*10.76391));
                                    lumen_ft2.setText(String.valueOf(value));//
                                    foot_candle.setText(String.valueOf(value*1));
                                    lumen_cm2.setText(String.valueOf(value*0.001076));
                                    phot.setText(String.valueOf(value*0.001076));
                                    uw_cm2.setText(String.valueOf(value*1.575975));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////meter-candle////////////////////////////////////
                    case 4:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*1));
                                    lumen_m2.setText(String.valueOf(value*1));
                                    meter_candle.setText(String.valueOf(value));//
                                    lumen_ft2.setText(String.valueOf(value*0.092903));
                                    foot_candle.setText(String.valueOf(value*0.092903));
                                    lumen_cm2.setText(String.valueOf(value*0.0001));
                                    phot.setText(String.valueOf(value*0.0001));
                                    uw_cm2.setText(String.valueOf(value*0.146413));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////foot-candle////////////////////////////////////
                    case 5:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*10.76391));
                                    lumen_m2.setText(String.valueOf(value*10.76391));
                                    meter_candle.setText(String.valueOf(value*10.76391));
                                    lumen_ft2.setText(String.valueOf(value*1));
                                    foot_candle.setText(String.valueOf(value));//
                                    lumen_cm2.setText(String.valueOf(value*0.001076));
                                    phot.setText(String.valueOf(value*0.001076));
                                    uw_cm2.setText(String.valueOf(value*1.575975));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////phot////////////////////////////////////
                    case 6:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*10000));
                                    lumen_m2.setText(String.valueOf(value*10000));
                                    meter_candle.setText(String.valueOf(value*10000));
                                    lumen_ft2.setText(String.valueOf(value*929.0304));
                                    foot_candle.setText(String.valueOf(value*929.0304));
                                    lumen_cm2.setText(String.valueOf(value*1));
                                    phot.setText(String.valueOf(value));//
                                    uw_cm2.setText(String.valueOf(value*1464.12884));
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////uw_cm2////////////////////////////////////
                    case 7:
                        inputtextillluminance.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextillluminance.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextillluminance.getText().toString());
                                    lux.setText(String.valueOf(value*6.83));
                                    lumen_m2.setText(String.valueOf(value*6.83));
                                    meter_candle.setText(String.valueOf(value*6.83));
                                    lumen_ft2.setText(String.valueOf(value*0.634528));
                                    foot_candle.setText(String.valueOf(value*0.634528));
                                    lumen_cm2.setText(String.valueOf(value*0.000683));
                                    phot.setText(String.valueOf(value*0.000683));
                                    uw_cm2.setText(String.valueOf(value));//
                                }
                                else
                                {
                                    lux.setText(String.valueOf(0));
                                    lumen_m2.setText(String.valueOf(0));
                                    meter_candle.setText(String.valueOf(0));
                                    lumen_ft2.setText(String.valueOf(0));
                                    foot_candle.setText(String.valueOf(0));
                                    lumen_cm2.setText(String.valueOf(0));
                                    phot.setText(String.valueOf(0));
                                    uw_cm2.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        return view;
    }

}
