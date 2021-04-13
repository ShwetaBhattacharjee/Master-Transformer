package com.example.project;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
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

import java.text.DecimalFormat;


public class BasicLengthFragment extends Fragment {
    EditText inputtextLength ;
    TextView um,mm,cm,dm,m,inch,ft,yd,mile,km,nm;
    double value,value2,umValue,mmValue,cmValue,dmValue,mValue,inchValue,ftValue,ydValue,mileValue,kmValue,nmValue;
    String str;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_basic_length, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.length_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.lengths,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        inputtextLength=(EditText) view.findViewById(R.id.inputtext_length);
        um=(TextView) view.findViewById(R.id.um);
        mm=(TextView) view.findViewById(R.id.mm);
        cm=(TextView) view.findViewById(R.id.cm);
        dm=(TextView) view.findViewById(R.id.dm);
        m=(TextView) view.findViewById(R.id.m);
        inch=(TextView) view.findViewById(R.id.inch);
        ft=(TextView) view.findViewById(R.id.ft);
        yd=(TextView) view.findViewById(R.id.yd);
        mile=(TextView) view.findViewById(R.id.mile);
        km=(TextView) view.findViewById(R.id.km);
        nm=(TextView) view.findViewById(R.id.nm);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {   //////////////////////////microm////////////////////////////////////
                    case 0:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*1;
                                    mmValue=value/1000;
                                    cmValue=value/10000;
                                    dmValue=value/100000;
                                    mValue=value/(1e+6);
                                    inchValue=value/(25400);
                                    ftValue=value/(304800);
                                    ydValue=value/(914400);
                                    mileValue=value/(1.609e+9);
                                    kmValue=value/(1e+9);
                                    nmValue=value/(1.852e+9);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                 ///////////////////////////////////////////////mm///////////////////////////////////////////////////////////
                    case 1:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*1000;
                                    mmValue=value*1;
                                    cmValue=value/10;
                                    dmValue=value/100;
                                    mValue=value/1000;
                                    inchValue=value/(25.4);
                                    ftValue=value/(304.8);
                                    ydValue=value/(914.4);
                                    mileValue=value/(1.609e+6);
                                    kmValue=value/(1e+6);
                                    nmValue=value/(1.852e+6);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                {um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                 ////////////////////////////cm//////////////////////////////////////
                    case 2:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*10000;
                                    mmValue=value*10;
                                    cmValue=value/1;
                                    dmValue=value/10;
                                    mValue=value/100;
                                    inchValue=value/(2.54);
                                    ftValue=value/(30.48);
                                    ydValue=value/(91.44);
                                    mileValue=value/(160934.4);
                                    kmValue=value/(100000);
                                    nmValue=value/(185200);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                        //////////////////////////////////////dm//////////////////////////////////////
                    case 3:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*100000;
                                    mmValue=value*100;
                                    cmValue=value*10;
                                    dmValue=value*1;
                                    mValue=value/10;
                                    inchValue=value*(3.937);
                                    ftValue=value/(3.048);
                                    ydValue=value/(9.144);
                                    mileValue=value/(16093.44);
                                    kmValue=value/(10000);
                                    nmValue=value/(18520);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////m//////////////////////////////////////
                    case 4:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*(1e+6);
                                    mmValue=value*1000;
                                    cmValue=value*100;
                                    dmValue=value*10;
                                    mValue=value*1;
                                    inchValue=value*(39.37);
                                    ftValue=value*(3.281);
                                    ydValue=value*(1.094);
                                    mileValue=value/(1609.344);
                                    kmValue=value/(1000);
                                    nmValue=value/(1852);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0");
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////inch//////////////////////////////////////
                    case 5:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*25400;
                                    mmValue=value*25.4;
                                    cmValue=value*2.54;
                                    dmValue=value/3.937;
                                    mValue=value/39.37;
                                    inchValue=value*(1);
                                    ftValue=value/(12);
                                    ydValue=value/(36);
                                    mileValue=value/(63360);
                                    kmValue=value/(39370.079);
                                    nmValue=value/(72913.386);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0");
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////ft//////////////////////////////////////
                    case 6:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*304800;
                                    mmValue=value*304.8;
                                    cmValue=value*30.48;
                                    dmValue=value*3.048;
                                    mValue=value/3.281;
                                    inchValue=value*(12);
                                    ftValue=value*(1);
                                    ydValue=value/(3);
                                    mileValue=value/(5280);
                                    kmValue=value/(3280.84);
                                    nmValue=value/(6076.115);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////yd//////////////////////////////////////
                    case 7:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*914400;
                                    mmValue=value*914.4;
                                    cmValue=value*91.44;
                                    dmValue=value*9.144;
                                    mValue=value/1.094;
                                    inchValue=value*(36);
                                    ftValue=value*(3);
                                    ydValue=value*(1);
                                    mileValue=value/(1760);
                                    kmValue=value/(1093.613);
                                    nmValue=value/(2025.372);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0");}
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////mile//////////////////////////////////////
                    case 8:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*(1.609e+9);
                                    mmValue=value*(1.609e+6);
                                    cmValue=value*160934.4;
                                    dmValue=value*16093.44;
                                    mValue=value*1609.344;
                                    inchValue=value*(63360);
                                    ftValue=value*(5280);
                                    ydValue=value*(1760);
                                    mileValue=value*(1);
                                    kmValue=value*(1.609);
                                    nmValue=value/(1.151);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////////////////km//////////////////////////////////////
                    case 9:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*(1e+9);
                                    mmValue=value*(1e+6);
                                    cmValue=value*100000;
                                    dmValue=value*10000;
                                    mValue=value*1000;
                                    inchValue=value*(39370.079);
                                    ftValue=value*(3280.84);
                                    ydValue=value*(1093.613);
                                    mileValue=value/(1.609);
                                    kmValue=value*(1);
                                    nmValue=value/(1.852);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                        ////////////////////////////////////////NM/////////////////////////////////////////
                    case 10:
                        inputtextLength.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextLength.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextLength.getText().toString());
                                    umValue=value*(1.852e+9);
                                    mmValue=value*(1.852e+6);
                                    cmValue=value*185200;
                                    dmValue=value*18520;
                                    mValue=value*1852;
                                    inchValue=value*(72913.386);
                                    ftValue=value*(6076.115);
                                    ydValue=value*(2025.372);
                                    mileValue=value*(1.151);
                                    kmValue=value*(1.852);
                                    nmValue=value*(1);
                                    um.setText(String.valueOf(umValue));
                                    mm.setText(String.valueOf(mmValue));
                                    cm.setText(String.valueOf(cmValue));
                                    dm.setText(String.valueOf(dmValue));
                                    m.setText(String.valueOf(mValue));
                                    inch.setText(String.valueOf(inchValue));
                                    ft.setText(String.valueOf(ftValue));
                                    yd.setText(String.valueOf(ydValue));
                                    mile.setText(String.valueOf(mileValue));
                                    km.setText(String.valueOf(kmValue));
                                    nm.setText(String.valueOf(nmValue));
                                }
                                else
                                { um.setText("0");
                                    mm.setText("0");
                                    cm.setText("0");
                                    dm.setText("0");
                                    m.setText("0");
                                    inch.setText("0");
                                    ft.setText("0");
                                    yd.setText("0");
                                    mile.setText("0");
                                    km.setText("0");
                                    nm.setText("0"); }
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
