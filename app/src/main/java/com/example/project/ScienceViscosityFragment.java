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


public class ScienceViscosityFragment extends Fragment {
EditText inputtextviscosity;
TextView cp,p,dyn_s_cm2,kg_ms,pa_s,mPa_s,lb_fts;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_science_viscosity, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.viscosity_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.viscositys,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtextviscosity=view.findViewById(R.id.inputtextviscosity);
        cp=view.findViewById(R.id.cp);
        p=view.findViewById(R.id.p);
        dyn_s_cm2=view.findViewById(R.id.dyn_s_cm2);
        kg_ms=view.findViewById(R.id.kg_ms);
        pa_s=view.findViewById(R.id.pa_s);
        mPa_s=view.findViewById(R.id.mPa_s);
        lb_fts=view.findViewById(R.id.lb_fts);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////cp////////////////////////////////////
                    case 0:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value));
                                    p.setText(String.valueOf(value*0.01));
                                    dyn_s_cm2.setText(String.valueOf(value*0.01));
                                    kg_ms.setText(String.valueOf(value*0.001));
                                    pa_s.setText(String.valueOf(value*0.001));
                                    mPa_s.setText(String.valueOf(value*1));
                                    lb_fts.setText(String.valueOf(value*0.00067197));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////p////////////////////////////////////
                    case 1:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*100));
                                    p.setText(String.valueOf(value));
                                    dyn_s_cm2.setText(String.valueOf(value*1));
                                    kg_ms.setText(String.valueOf(value*0.1));
                                    pa_s.setText(String.valueOf(value*0.1));
                                    mPa_s.setText(String.valueOf(value*100));
                                    lb_fts.setText(String.valueOf(value*0.06719689));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////dyn_s_cm2////////////////////////////////////
                    case 2:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*100));
                                    p.setText(String.valueOf(value*1));
                                    dyn_s_cm2.setText(String.valueOf(value));//
                                    kg_ms.setText(String.valueOf(value*0.1));
                                    pa_s.setText(String.valueOf(value*0.1));
                                    mPa_s.setText(String.valueOf(value*100));
                                    lb_fts.setText(String.valueOf(value*0.06719689));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kg_ms////////////////////////////////////
                    case 3:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*1000));
                                    p.setText(String.valueOf(value*10));
                                    dyn_s_cm2.setText(String.valueOf(value*10));
                                    kg_ms.setText(String.valueOf(value));
                                    pa_s.setText(String.valueOf(value*1));
                                    mPa_s.setText(String.valueOf(value*1000));
                                    lb_fts.setText(String.valueOf(value*0.6719689));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////pa_s////////////////////////////////////
                    case 4:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*1000));
                                    p.setText(String.valueOf(value*10));
                                    dyn_s_cm2.setText(String.valueOf(value*10));
                                    kg_ms.setText(String.valueOf(value*1));
                                    pa_s.setText(String.valueOf(value));
                                    mPa_s.setText(String.valueOf(value*1000));
                                    lb_fts.setText(String.valueOf(value*0.6719689));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mPa_s////////////////////////////////////
                    case 5:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*1));
                                    p.setText(String.valueOf(value*0.01));
                                    dyn_s_cm2.setText(String.valueOf(value*0.01));
                                    kg_ms.setText(String.valueOf(value*0.001));
                                    pa_s.setText(String.valueOf(value*0.001));
                                    mPa_s.setText(String.valueOf(value));
                                    lb_fts.setText(String.valueOf(value*0.0006719689));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////lb_fts////////////////////////////////////
                    case 6:
                        inputtextviscosity.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextviscosity.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextviscosity.getText().toString());
                                    cp.setText(String.valueOf(value*1488.16411));
                                    p.setText(String.valueOf(value*14.8816411));
                                    dyn_s_cm2.setText(String.valueOf(value*14.8816411));
                                    kg_ms.setText(String.valueOf(value*1.48816411));
                                    pa_s.setText(String.valueOf(value*1.48816411));
                                    mPa_s.setText(String.valueOf(value*1488.16411));
                                    lb_fts.setText(String.valueOf(value));

                                }
                                else
                                {   cp.setText(String.valueOf(0));
                                    p.setText(String.valueOf(0));
                                    dyn_s_cm2.setText(String.valueOf(0));
                                    kg_ms.setText(String.valueOf(0));
                                    pa_s.setText(String.valueOf(0));
                                    mPa_s.setText(String.valueOf(0));
                                    lb_fts.setText(String.valueOf(0));

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
