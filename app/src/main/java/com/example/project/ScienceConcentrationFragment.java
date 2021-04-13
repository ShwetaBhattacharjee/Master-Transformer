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


public class ScienceConcentrationFragment extends Fragment {
EditText inputtextConcentration;
TextView percent,ug_l,g_l,mg_l,ppm,ppb;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_science_concentration, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.concentration_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.concentrations,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        inputtextConcentration=view.findViewById(R.id.inputtextconcentration);
        percent=view.findViewById(R.id.percent);
        ug_l=view.findViewById(R.id.ug_l);
        g_l=view.findViewById(R.id.g_l);
        ppm=view.findViewById(R.id.ppm);
        ppb=view.findViewById(R.id.ppb);
        mg_l=view.findViewById(R.id.mg_l);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////%////////////////////////////////////
                    case 0:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value));
                                    ug_l.setText(String.valueOf(value*10000000));
                                    mg_l.setText(String.valueOf(value*10000));
                                    g_l.setText(String.valueOf(value*10));
                                    ppm.setText(String.valueOf(value*10000));
                                    ppb.setText(String.valueOf(value*10000000));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ug/L////////////////////////////////////
                    case 1:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value*1.0e-7));
                                    ug_l.setText(String.valueOf(value));
                                    mg_l.setText(String.valueOf(value*0.001));
                                    g_l.setText(String.valueOf(value*0.000001));
                                    ppm.setText(String.valueOf(value*0.001));
                                    ppb.setText(String.valueOf(value*1));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;

                    //////////////////////////mg/L////////////////////////////////////
                    case 2:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value*0.0001));
                                    ug_l.setText(String.valueOf(value*1000));
                                    mg_l.setText(String.valueOf(value));
                                    g_l.setText(String.valueOf(value*0.001));
                                    ppm.setText(String.valueOf(value*1));
                                    ppb.setText(String.valueOf(value*1000));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;

                    //////////////////////////g/L////////////////////////////////////
                    case 3:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value*0.1));
                                    ug_l.setText(String.valueOf(value*1000000));
                                    mg_l.setText(String.valueOf(value*1000));
                                    g_l.setText(String.valueOf(value*1));
                                    ppm.setText(String.valueOf(value*1000));
                                    ppb.setText(String.valueOf(value*1000000));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;


                    //////////////////////////ppm////////////////////////////////////
                    case 4:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value*0.0001));
                                    ug_l.setText(String.valueOf(value*1000));
                                    mg_l.setText(String.valueOf(value*1));
                                    g_l.setText(String.valueOf(value*0.001));
                                    ppm.setText(String.valueOf(value));
                                    ppb.setText(String.valueOf(value*1000));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ppb////////////////////////////////////
                    case 5:
                        inputtextConcentration.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextConcentration.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextConcentration.getText().toString());
                                    percent.setText(String.valueOf(value*1.0e-7));
                                    ug_l.setText(String.valueOf(value*1));
                                    mg_l.setText(String.valueOf(value*0.001));
                                    g_l.setText(String.valueOf(value*0.000001));
                                    ppm.setText(String.valueOf(value*0.001));
                                    ppb.setText(String.valueOf(value*1));

                                }
                                else
                                {   percent.setText(String.valueOf(0));
                                    ug_l.setText(String.valueOf(0));
                                    mg_l.setText(String.valueOf(0));
                                    g_l.setText(String.valueOf(0));
                                    ppm.setText(String.valueOf(0));
                                    ppb.setText(String.valueOf(0));


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
