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


public class MiscRadiationFragment extends Fragment {
EditText inputtextradiation;
double value;
TextView uSv,mSv,Sv,rem,ctdi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_misc_radiation, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.radiation_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.radiations,android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtextradiation=view.findViewById(R.id.inputtextradiation);
        uSv=view.findViewById(R.id.uSv);
        mSv=view.findViewById(R.id.mSv);
        Sv=view.findViewById(R.id.Sv);
        rem=view.findViewById(R.id.rem);
        ctdi=view.findViewById(R.id.ctdi);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////uSv////////////////////////////////////
                    case 0:
                        inputtextradiation.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextradiation.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextradiation.getText().toString());
                                    uSv.setText(String.valueOf(value));//
                                    mSv.setText(String.valueOf(value*0.001));
                                    Sv.setText(String.valueOf(value*0.000001));
                                    rem.setText(String.valueOf(value*0.0001));
                                    ctdi.setText(String.valueOf(value*0.00001));
                                }
                                else
                                {
                                    uSv.setText(String.valueOf(0));//
                                    mSv.setText(String.valueOf(0));
                                    Sv.setText(String.valueOf(0));
                                    rem.setText(String.valueOf(0));
                                    ctdi.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mSv////////////////////////////////////
                    case 1:
                        inputtextradiation.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextradiation.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextradiation.getText().toString());
                                    uSv.setText(String.valueOf(value*1000));
                                    mSv.setText(String.valueOf(value));//
                                    Sv.setText(String.valueOf(value*0.001));
                                    rem.setText(String.valueOf(value*0.1));
                                    ctdi.setText(String.valueOf(value*0.01));
                                }
                                else
                                {
                                    uSv.setText(String.valueOf(0));//
                                    mSv.setText(String.valueOf(0));
                                    Sv.setText(String.valueOf(0));
                                    rem.setText(String.valueOf(0));
                                    ctdi.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////Sv////////////////////////////////////
                    case 2:
                        inputtextradiation.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextradiation.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextradiation.getText().toString());
                                    uSv.setText(String.valueOf(value*1000000));
                                    mSv.setText(String.valueOf(value*1000));
                                    Sv.setText(String.valueOf(value));//
                                    rem.setText(String.valueOf(value*100));
                                    ctdi.setText(String.valueOf(value*10));
                                }
                                else
                                {
                                    uSv.setText(String.valueOf(0));//
                                    mSv.setText(String.valueOf(0));
                                    Sv.setText(String.valueOf(0));
                                    rem.setText(String.valueOf(0));
                                    ctdi.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////rem////////////////////////////////////
                    case 3:
                        inputtextradiation.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextradiation.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextradiation.getText().toString());
                                    uSv.setText(String.valueOf(value*10000));
                                    mSv.setText(String.valueOf(value*10));
                                    Sv.setText(String.valueOf(value*0.01));
                                    rem.setText(String.valueOf(value));//
                                    ctdi.setText(String.valueOf(value*0.1));
                                }
                                else
                                {
                                    uSv.setText(String.valueOf(0));//
                                    mSv.setText(String.valueOf(0));
                                    Sv.setText(String.valueOf(0));
                                    rem.setText(String.valueOf(0));
                                    ctdi.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////CTDI////////////////////////////////////
                    case 4:
                        inputtextradiation.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextradiation.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextradiation.getText().toString());
                                    uSv.setText(String.valueOf(value*100000));
                                    mSv.setText(String.valueOf(value*100));
                                    Sv.setText(String.valueOf(value*0.1));
                                    rem.setText(String.valueOf(value*10));
                                    ctdi.setText(String.valueOf(value));//
                                }
                                else
                                {
                                    uSv.setText(String.valueOf(0));//
                                    mSv.setText(String.valueOf(0));
                                    Sv.setText(String.valueOf(0));
                                    rem.setText(String.valueOf(0));
                                    ctdi.setText(String.valueOf(0));
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
