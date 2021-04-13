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

public class BasicVolumeFragment extends Fragment {
EditText inputtext;
double value;
TextView ml,cl,dl,L,mm3,cm3,dm3,m3,in3,ft3,yd3,galUk,galUs,ptUs,fl_oz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_basic_volume, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.volume_spinner);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.volumes,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        inputtext=view.findViewById(R.id.inputtext);
        ml=view.findViewById(R.id.ml_cc);
        cl=view.findViewById(R.id.cl);
        dl=view.findViewById(R.id.dl);
        L=view.findViewById(R.id.litre);
        mm3=view.findViewById(R.id.cube_mm);
        cm3=view.findViewById(R.id.cube_cm);
        dm3=view.findViewById(R.id.cube_dm);
        m3=view.findViewById(R.id.cube_m);
        in3=view.findViewById(R.id.cube_in);
        ft3=view.findViewById(R.id.cube_ft);
        yd3=view.findViewById(R.id.cube_yd);
        galUk=view.findViewById(R.id.gal_uk);
        galUs=view.findViewById(R.id.gal_us);
        ptUs=view.findViewById(R.id.pt_us);
        fl_oz=view.findViewById(R.id.fl_oz_us);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {   //////////////////////////ml////////////////////////////////////
                    case 0:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value));
                                    cl.setText(String.valueOf(value/10));
                                    dl.setText(String.valueOf(value/100));
                                    L.setText(String.valueOf(value/1000));
                                    mm3.setText(String.valueOf(value*1000));
                                    cm3.setText(String.valueOf(value*1));
                                    dm3.setText(String.valueOf(value/1000));
                                    m3.setText(String.valueOf(value/1e+6));
                                    in3.setText(String.valueOf(value/16.387));
                                    ft3.setText(String.valueOf(value/28316.847));
                                    yd3.setText(String.valueOf(value/764554.858));
                                    galUk.setText(String.valueOf(value/4546.09));
                                    galUs.setText(String.valueOf(value/3785.412));
                                    ptUs.setText(String.valueOf(value/568.261));
                                    fl_oz.setText(String.valueOf(value/29.574));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");

                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////cl////////////////////////////////////
                    case 1:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*10));
                                    cl.setText(String.valueOf(value));
                                    dl.setText(String.valueOf(value/10));
                                    L.setText(String.valueOf(value/100));
                                    mm3.setText(String.valueOf(value*10000));
                                    cm3.setText(String.valueOf(value*10));
                                    dm3.setText(String.valueOf(value/100));
                                    m3.setText(String.valueOf(value/100000));
                                    ft3.setText(String.valueOf(value/2831.685));
                                    yd3.setText(String.valueOf(value/76455.486));
                                    galUk.setText(String.valueOf(value/454.609));
                                    galUs.setText(String.valueOf(value/378.541));
                                    in3.setText(String.valueOf(value/1.639));
                                    ptUs.setText(String.valueOf(value/56.826));
                                    fl_oz.setText(String.valueOf(value/2.957));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////dl////////////////////////////////////
                    case 2:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*100));
                                    cl.setText(String.valueOf(value*10));
                                    dl.setText(String.valueOf(value));//
                                    L.setText(String.valueOf(value/10));
                                    mm3.setText(String.valueOf(value*100000));
                                    cm3.setText(String.valueOf(value*100));
                                    dm3.setText(String.valueOf(value/10));
                                    m3.setText(String.valueOf(value/10000));
                                    ft3.setText(String.valueOf(value/283.168));
                                    yd3.setText(String.valueOf(value/7645.549));
                                    galUk.setText(String.valueOf(value/45.461));
                                    galUs.setText(String.valueOf(value/37.854));
                                   in3.setText(String.valueOf(value*6.102));
                                    ptUs.setText(String.valueOf(value/5.683));
                                    fl_oz.setText(String.valueOf(value*3.381));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////L////////////////////////////////////
                    case 3:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*1000));
                                    cl.setText(String.valueOf(value*100));
                                    dl.setText(String.valueOf(value*10));
                                    L.setText(String.valueOf(value));//
                                    mm3.setText(String.valueOf(value*1e+6));
                                    cm3.setText(String.valueOf(value*1000));
                                    dm3.setText(String.valueOf(value*1));
                                    m3.setText(String.valueOf(value/1000));
                                    ft3.setText(String.valueOf(value/28.317));
                                    yd3.setText(String.valueOf(value/764.555));
                                    galUk.setText(String.valueOf(value/4.546));
                                    galUs.setText(String.valueOf(value/3.785));
                                    in3.setText(String.valueOf(value*61.024));
                                    ptUs.setText(String.valueOf(value*1.76));
                                    fl_oz.setText(String.valueOf(value*33.814));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////mm3////////////////////////////////////
                    case 4:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value/1000));
                                    cl.setText(String.valueOf(value/10000));
                                    dl.setText(String.valueOf(value/100000));
                                    L.setText(String.valueOf(value/1000000));
                                    mm3.setText(String.valueOf(value));//
                                    cm3.setText(String.valueOf(value/1000));
                                    dm3.setText(String.valueOf(value/1e+6));
                                    m3.setText(String.valueOf(value/1e+9));
                                    ft3.setText(String.valueOf(value/2.832e+7));
                                    yd3.setText(String.valueOf(value/7.646e+8));
                                    galUk.setText(String.valueOf(value/4.546e+6));
                                    galUs.setText(String.valueOf(value/3.785e+6));
                                    in3.setText(String.valueOf(value/16387.064));
                                    ptUs.setText(String.valueOf(value/568261.25));
                                    fl_oz.setText(String.valueOf(value/29573.53));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////cm3////////////////////////////////////
                    case 5:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*1));
                                    cl.setText(String.valueOf(value/10));
                                    dl.setText(String.valueOf(value/100));
                                    L.setText(String.valueOf(value/1000));
                                    mm3.setText(String.valueOf(value*1000));
                                    cm3.setText(String.valueOf(value));//
                                    dm3.setText(String.valueOf(value/1000));
                                    m3.setText(String.valueOf(value/1e+6));
                                    ft3.setText(String.valueOf(value/28316.847));
                                    yd3.setText(String.valueOf(value/764554.858));
                                    galUk.setText(String.valueOf(value/4546.09));
                                    galUs.setText(String.valueOf(value/3785.412));
                                    in3.setText(String.valueOf(value/16.387));
                                    ptUs.setText(String.valueOf(value/568.261));
                                    fl_oz.setText(String.valueOf(value/29.574));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////dm3////////////////////////////////////
                    case 6:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*1000));
                                    cl.setText(String.valueOf(value*100));
                                    dl.setText(String.valueOf(value*10));
                                    L.setText(String.valueOf(value*1));
                                    mm3.setText(String.valueOf(value*1e+6));
                                    cm3.setText(String.valueOf(value*1000));
                                    dm3.setText(String.valueOf(value));//
                                    m3.setText(String.valueOf(value/1000));
                                    ft3.setText(String.valueOf(value/28.317));
                                    yd3.setText(String.valueOf(value/764.555));
                                    galUk.setText(String.valueOf(value/4.546));
                                    galUs.setText(String.valueOf(value/3.785));
                                    in3.setText(String.valueOf(value*61.024));
                                    ptUs.setText(String.valueOf(value*1.76));
                                    fl_oz.setText(String.valueOf(value*33.814));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////m3////////////////////////////////////
                    case 7:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*1e+6));
                                    cl.setText(String.valueOf(value*1e+5));
                                    dl.setText(String.valueOf(value*1e+4));
                                    L.setText(String.valueOf(value*1000));
                                    mm3.setText(String.valueOf(value*1e+9));
                                    cm3.setText(String.valueOf(value*1e+6));
                                    dm3.setText(String.valueOf(value*1000));
                                    m3.setText(String.valueOf(value));//
                                    ft3.setText(String.valueOf(value*35.315));
                                    yd3.setText(String.valueOf(value*1.308));
                                    galUk.setText(String.valueOf(value*219.969));
                                    galUs.setText(String.valueOf(value*264.172));
                                    in3.setText(String.valueOf(value*61023.744));
                                    ptUs.setText(String.valueOf(value*1759.754));
                                    fl_oz.setText(String.valueOf(value*33814.023));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////ft3////////////////////////////////////
                    case 8:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*28316.847));
                                    cl.setText(String.valueOf(value*2831.685));
                                    dl.setText(String.valueOf(value*283.168));
                                    L.setText(String.valueOf(value*28.317));
                                    mm3.setText(String.valueOf(value*2.832e+7));
                                    cm3.setText(String.valueOf(value*28316.847));
                                    dm3.setText(String.valueOf(value*28.317));
                                    m3.setText(String.valueOf(value/35.315));
                                    ft3.setText(String.valueOf(value));//
                                    yd3.setText(String.valueOf(value/27));
                                    galUk.setText(String.valueOf(value*6.229));
                                    galUs.setText(String.valueOf(value*7.481));
                                    in3.setText(String.valueOf(value*1728));
                                    ptUs.setText(String.valueOf(value*49.831));
                                    fl_oz.setText(String.valueOf(value*957.506));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////yd3////////////////////////////////////
                    case 9:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*764554.858));
                                    cl.setText(String.valueOf(value*76455.486));
                                    dl.setText(String.valueOf(value*7645.549));
                                    L.setText(String.valueOf(value*764.555));
                                    mm3.setText(String.valueOf(value*7.646e+8));
                                    cm3.setText(String.valueOf(value*764554.858));
                                    dm3.setText(String.valueOf(value*764.555));
                                    m3.setText(String.valueOf(value/1.308));
                                    ft3.setText(String.valueOf(value*27));
                                    yd3.setText(String.valueOf(value));//
                                    galUk.setText(String.valueOf(value*168.179));
                                    galUs.setText(String.valueOf(value*201.974));
                                    in3.setText(String.valueOf(value*46656));
                                    ptUs.setText(String.valueOf(value*1345.428));
                                    fl_oz.setText(String.valueOf(value*25852.675));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////galUK////////////////////////////////////
                    case 10:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*4546.09));
                                    cl.setText(String.valueOf(value*454.609));
                                    dl.setText(String.valueOf(value*45.461));
                                    L.setText(String.valueOf(value*4.546));
                                    mm3.setText(String.valueOf(value*4.546e+6));
                                    cm3.setText(String.valueOf(value*4546.09));
                                    dm3.setText(String.valueOf(value*4.546));
                                    m3.setText(String.valueOf(value/219.969));
                                    ft3.setText(String.valueOf(value/6.229));
                                    yd3.setText(String.valueOf(value/168.179));
                                    galUk.setText(String.valueOf(value));//
                                    galUs.setText(String.valueOf(value*1.201));
                                    in3.setText(String.valueOf(value*277.419));
                                    ptUs.setText(String.valueOf(value*8));
                                    fl_oz.setText(String.valueOf(value*153.722));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////galUs////////////////////////////////////
                    case 11:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*3785.412));
                                    cl.setText(String.valueOf(value*378.541));
                                    dl.setText(String.valueOf(value*37.854));
                                    L.setText(String.valueOf(value*3.785));
                                    mm3.setText(String.valueOf(value*3.785e+6));
                                    cm3.setText(String.valueOf(value*3785.412));
                                    dm3.setText(String.valueOf(value*3.785));
                                    m3.setText(String.valueOf(value/264.172));
                                    ft3.setText(String.valueOf(value/7.481));
                                    yd3.setText(String.valueOf(value/201.974));
                                    galUk.setText(String.valueOf(value/1.201));
                                    galUs.setText(String.valueOf(value));//
                                    in3.setText(String.valueOf(value*231));
                                    ptUs.setText(String.valueOf(value*6.661));
                                    fl_oz.setText(String.valueOf(value*128));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////in3////////////////////////////////////
                    case 12:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*16.387));
                                    cl.setText(String.valueOf(value*1.639));
                                    dl.setText(String.valueOf(value/6.102));
                                    L.setText(String.valueOf(value/61.024));
                                    mm3.setText(String.valueOf(value*16387.064));
                                    cm3.setText(String.valueOf(value*16.387));
                                    dm3.setText(String.valueOf(value/61.024));
                                    m3.setText(String.valueOf(value/61023.744));
                                    ft3.setText(String.valueOf(value/1728));
                                    yd3.setText(String.valueOf(value/46656));
                                    galUk.setText(String.valueOf(value/277.419));
                                    galUs.setText(String.valueOf(value/231));
                                    in3.setText(String.valueOf(value));//
                                    ptUs.setText(String.valueOf(value/34.677));
                                    fl_oz.setText(String.valueOf(value/1.805));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////ptUK////////////////////////////////////
                    case 13:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*568.261));
                                    cl.setText(String.valueOf(value*56.826));
                                    dl.setText(String.valueOf(value*5.682));
                                    L.setText(String.valueOf(value/1.76));
                                    mm3.setText(String.valueOf(value*568261.25));
                                    cm3.setText(String.valueOf(value*568.261));
                                    dm3.setText(String.valueOf(value/1.76));
                                    m3.setText(String.valueOf(value/1759.754));
                                    ft3.setText(String.valueOf(value/49.831));
                                    yd3.setText(String.valueOf(value/1345.428));
                                    galUk.setText(String.valueOf(value/8));
                                    galUs.setText(String.valueOf(value/6.661));
                                    in3.setText(String.valueOf(value*34.667));
                                    ptUs.setText(String.valueOf(value));//
                                    fl_oz.setText(String.valueOf(value*19.215));
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////fl_oz////////////////////////////////////
                    case 14:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());

                                    ml.setText(String.valueOf(value*29.574));
                                    cl.setText(String.valueOf(value*2.957));
                                    dl.setText(String.valueOf(value/3.381));
                                    L.setText(String.valueOf(value/33.814));
                                    mm3.setText(String.valueOf(value*29573.53));
                                    cm3.setText(String.valueOf(value*29.574));
                                    dm3.setText(String.valueOf(value/33.814));
                                    m3.setText(String.valueOf(value/33814.023));
                                    ft3.setText(String.valueOf(value/957.506));
                                    yd3.setText(String.valueOf(value/25852.675));
                                    galUk.setText(String.valueOf(value/153.722));
                                    galUs.setText(String.valueOf(value/128));
                                    in3.setText(String.valueOf(value*1.805));
                                    ptUs.setText(String.valueOf(value/19.215));
                                    fl_oz.setText(String.valueOf(value));//
                                }
                                else
                                { ml.setText("0");
                                    cl.setText("0");
                                    dl.setText("0");
                                    L.setText("0");
                                    mm3.setText("0");
                                    cm3.setText("0");
                                    dm3.setText("0");
                                    m3.setText("0");
                                    in3.setText("0");
                                    ft3.setText("0");
                                    yd3.setText("0");
                                    galUk.setText("0");
                                    galUs.setText("0");
                                    ptUs.setText("0");
                                    fl_oz.setText("0");

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
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return view;
    }

}
