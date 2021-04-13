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


public class MiscFuelFragment extends Fragment {
EditText inputtextfuel;
TextView kml,mil,kmGal,miGalUs,miGalUk,l_100;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_misc_fuel, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.fuel_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.fuels,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        inputtextfuel=view.findViewById(R.id.inputtextfuel);
        kml=view.findViewById(R.id.km_l);
        mil=view.findViewById(R.id.mi_l);
        kmGal=view.findViewById(R.id.km_gal_us);
        miGalUs=view.findViewById(R.id.mi_gal_us);
        miGalUk=view.findViewById(R.id.mi_gal_uk);
        l_100=view.findViewById(R.id.l_100km);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////kml////////////////////////////////////
                    case 0:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(value));
                                    mil.setText(String.valueOf(value*0.621371));
                                    kmGal.setText(String.valueOf(value*3.785412));
                                    miGalUs.setText(String.valueOf(value*2.352146));
                                    miGalUk.setText(String.valueOf(value*2.824811));
                                    l_100.setText(String.valueOf(100/value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mil////////////////////////////////////
                    case 1:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(value*1.609344));
                                    mil.setText(String.valueOf(value));
                                    kmGal.setText(String.valueOf(value*6.09203));
                                    miGalUs.setText(String.valueOf(value*3.785412));
                                    miGalUk.setText(String.valueOf(value*4.546092));
                                    l_100.setText(String.valueOf(62.137119/value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kmGal////////////////////////////////////
                    case 2:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(value*0.264172));
                                    mil.setText(String.valueOf(value*0.164149));
                                    kmGal.setText(String.valueOf(value));
                                    miGalUs.setText(String.valueOf(value*0.621371));
                                    miGalUk.setText(String.valueOf(value*0.746236));
                                    l_100.setText(String.valueOf(378.5412/value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////miGalUs////////////////////////////////////
                    case 3:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(value*0.425144));
                                    mil.setText(String.valueOf(value*0.264172));
                                    kmGal.setText(String.valueOf(value*1.609344));
                                    miGalUs.setText(String.valueOf(value));
                                    miGalUk.setText(String.valueOf(value*1.20095));
                                    l_100.setText(String.valueOf(235.215/value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////miGalUk////////////////////////////////////
                    case 4:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(value*0.354006));
                                    mil.setText(String.valueOf(value*0.219969));
                                    kmGal.setText(String.valueOf(value*1.340059));
                                    miGalUs.setText(String.valueOf(value*0.832674));
                                    miGalUk.setText(String.valueOf(value));
                                    l_100.setText(String.valueOf(282.481061/value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////l_100////////////////////////////////////
                    case 5:
                        inputtextfuel.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextfuel.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextfuel.getText().toString());
                                    kml.setText(String.valueOf(100/value));
                                    mil.setText(String.valueOf(62.137119/value));
                                    kmGal.setText(String.valueOf(378.5412/value));
                                    miGalUs.setText(String.valueOf(235.214597/value));
                                    miGalUk.setText(String.valueOf(282.481061/value));
                                    l_100.setText(String.valueOf(value));
                                }
                                else
                                {    kml.setText(String.valueOf(0));
                                    mil.setText(String.valueOf(0));
                                    kmGal.setText(String.valueOf(0));
                                    miGalUs.setText(String.valueOf(0));
                                    miGalUk.setText(String.valueOf(0));
                                    l_100.setText(String.valueOf(0));

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
