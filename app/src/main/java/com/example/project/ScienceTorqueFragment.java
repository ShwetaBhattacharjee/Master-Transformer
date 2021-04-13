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


public class ScienceTorqueFragment extends Fragment {
EditText inputtextTorque;
TextView Nm,daNm,kgfm,ozfin,lbfft,gfCm;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_science_torque, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.torque_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.torques,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        inputtextTorque=view.findViewById(R.id.inputtexttorque);
        Nm=view.findViewById(R.id.Nm_torque);
        daNm=view.findViewById(R.id.daNm);
        kgfm=view.findViewById(R.id.kgfm);
        ozfin=view.findViewById(R.id.ozf_in);
        lbfft=view.findViewById(R.id.lbf_ft);
        gfCm=view.findViewById(R.id.gf_cm);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////Nm////////////////////////////////////
                    case 0:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value));
                                    daNm.setText(String.valueOf(value*0.1));
                                    kgfm.setText(String.valueOf(value*0.101972));
                                    ozfin.setText(String.valueOf(value*141.611933));
                                    lbfft.setText(String.valueOf(value*0.737562));
                                    gfCm.setText(String.valueOf(value*10197.1621));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////daNm////////////////////////////////////
                    case 1:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value*10));
                                    daNm.setText(String.valueOf(value));
                                    kgfm.setText(String.valueOf(value*1.019716));
                                    ozfin.setText(String.valueOf(value*1416.11933));
                                    lbfft.setText(String.valueOf(value*7.375621));
                                    gfCm.setText(String.valueOf(value*101971.621));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kgfm////////////////////////////////////
                    case 2:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value*9.80665));
                                    daNm.setText(String.valueOf(value*0.980665));
                                    kgfm.setText(String.valueOf(value));
                                    ozfin.setText(String.valueOf(value*1388.73866));
                                    lbfft.setText(String.valueOf(value*7.233014));
                                    gfCm.setText(String.valueOf(value*100000));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ozfin////////////////////////////////////
                    case 3:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value*0.007062));
                                    daNm.setText(String.valueOf(value*0.000706));
                                    kgfm.setText(String.valueOf(value*0.00072));
                                    ozfin.setText(String.valueOf(value));
                                    lbfft.setText(String.valueOf(value*0.005208));
                                    gfCm.setText(String.valueOf(value*72.007789));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////lbfft////////////////////////////////////
                    case 4:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value*1.355818));
                                    daNm.setText(String.valueOf(value*0.135582));
                                    kgfm.setText(String.valueOf(value*0.138255));
                                    ozfin.setText(String.valueOf(value*192));
                                    lbfft.setText(String.valueOf(value));//
                                    gfCm.setText(String.valueOf(value*13825.4954));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////gfcm////////////////////////////////////
                    case 5:
                        inputtextTorque.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextTorque.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextTorque.getText().toString());
                                    Nm.setText(String.valueOf(value*0.000098));
                                    daNm.setText(String.valueOf(value*0.00001));
                                    kgfm.setText(String.valueOf(value*0.00001));
                                    ozfin.setText(String.valueOf(value*0.013887));
                                    lbfft.setText(String.valueOf(value*0.000072));
                                    gfCm.setText(String.valueOf(value));
                                }
                                else
                                {   Nm.setText(String.valueOf(0));
                                    daNm.setText(String.valueOf(0));
                                    kgfm.setText(String.valueOf(0));
                                    ozfin.setText(String.valueOf(0));
                                    lbfft.setText(String.valueOf(0));
                                    gfCm.setText(String.valueOf(0));

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
