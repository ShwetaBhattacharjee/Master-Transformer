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


public class LivingSpeedFragment extends Fragment {
    EditText inputtextspeed;
    TextView m_s,fts,kms,mmin,ftmin,kmmin,kmh,mih,knot,mach;
    double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_living_speed, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.speed_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.speeds,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtextspeed=view.findViewById(R.id.inputtextspeed);
        m_s=view.findViewById(R.id.mbys);
        fts=view.findViewById(R.id.ftbys);
        kms=view.findViewById(R.id.km_s);
        mmin=view.findViewById(R.id.m_min);
        ftmin=view.findViewById(R.id.ft_min);
        kmmin=view.findViewById(R.id.km_min);
        kmh=view.findViewById(R.id.km_h);
        mih=view.findViewById(R.id.mi_h);
        knot=view.findViewById(R.id.knot);
        mach=view.findViewById(R.id.mach);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////m_s////////////////////////////////////
                    case 0:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value));//
                                    fts.setText(String.valueOf(value*3.2808));
                                    kms.setText(String.valueOf(value*0.001));
                                    mmin.setText(String.valueOf(value*60));
                                    ftmin.setText(String.valueOf(value*196.85));
                                    kmmin.setText(String.valueOf(value/16.667));
                                    kmh.setText(String.valueOf(value*3.6));
                                    mih.setText(String.valueOf(value*2.2369));
                                    knot.setText(String.valueOf(value*1.9438));
                                    mach.setText(String.valueOf(value/343));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;

                    //////////////////////////fts////////////////////////////////////
                    case 1:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.3048));
                                    fts.setText(String.valueOf(value));//
                                    kms.setText(String.valueOf(value*0.0003048));
                                    mmin.setText(String.valueOf(value*18.288));
                                    ftmin.setText(String.valueOf(value*60));
                                    kmmin.setText(String.valueOf(value/54.681));
                                    kmh.setText(String.valueOf(value*1.09728));
                                    mih.setText(String.valueOf(value*0.681818));
                                    knot.setText(String.valueOf(value*0.59248));
                                    mach.setText(String.valueOf(value/1125.328));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kms////////////////////////////////////
                    case 2:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*1000));
                                    fts.setText(String.valueOf(value*3280.839895));
                                    kms.setText(String.valueOf(value));//
                                    mmin.setText(String.valueOf(value*60000));
                                    ftmin.setText(String.valueOf(value*196850.394));
                                    kmmin.setText(String.valueOf(value*60));
                                    kmh.setText(String.valueOf(value*3600));
                                    mih.setText(String.valueOf(value*2236.936292));
                                    knot.setText(String.valueOf(value*1943.844));
                                    mach.setText(String.valueOf(value*2.915));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mmin////////////////////////////////////
                    case 3:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.01667));
                                    fts.setText(String.valueOf(value*0.054681));
                                    kms.setText(String.valueOf(value*1.67e-5));
                                    mmin.setText(String.valueOf(value));//
                                    ftmin.setText(String.valueOf(value*3.2808));
                                    kmmin.setText(String.valueOf(value*0.001));
                                    kmh.setText(String.valueOf(value*0.06));
                                    mih.setText(String.valueOf(value*0.03728));
                                    knot.setText(String.valueOf(value*0.03297));
                                    mach.setText(String.valueOf(value/20580));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ftmin////////////////////////////////////
                    case 4:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.00508));
                                    fts.setText(String.valueOf(value*0.01667));
                                    kms.setText(String.valueOf(value*5.08e-6));
                                    mmin.setText(String.valueOf(value*0.3048));
                                    ftmin.setText(String.valueOf(value));//
                                    kmmin.setText(String.valueOf(value*0.0003048));
                                    kmh.setText(String.valueOf(value*0.018288));
                                    mih.setText(String.valueOf(value*0.01136364));
                                    knot.setText(String.valueOf(value*0.0098747));
                                    mach.setText(String.valueOf(value/67519.685));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kmmin////////////////////////////////////
                    case 5:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*16.667));
                                    fts.setText(String.valueOf(value*54.6807));
                                    kms.setText(String.valueOf(value*0.01667));
                                    mmin.setText(String.valueOf(value*1000));
                                    ftmin.setText(String.valueOf(value*3280.8399));
                                    kmmin.setText(String.valueOf(value));//
                                    kmh.setText(String.valueOf(value*60));
                                    mih.setText(String.valueOf(value*37.2823));
                                    knot.setText(String.valueOf(value*32.39741));
                                    mach.setText(String.valueOf(value/20.58));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kmh////////////////////////////////////
                    case 6:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.2778));
                                    fts.setText(String.valueOf(value*0.911344));
                                    kms.setText(String.valueOf(value*0.0002778));
                                    mmin.setText(String.valueOf(value*16.6667));
                                    ftmin.setText(String.valueOf(value*54.6807));
                                    kmmin.setText(String.valueOf(value*0.01667));
                                    kmh.setText(String.valueOf(value));//
                                    mih.setText(String.valueOf(value*0.62137));
                                    knot.setText(String.valueOf(value*0.539957));
                                    mach.setText(String.valueOf(value/1234.8));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mih////////////////////////////////////
                    case 7:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.44704));
                                    fts.setText(String.valueOf(value*1.4667));
                                    kms.setText(String.valueOf(value*0.00044704));
                                    mmin.setText(String.valueOf(value*26.8224));
                                    ftmin.setText(String.valueOf(value*88));
                                    kmmin.setText(String.valueOf(value*0.0268224));
                                    kmh.setText(String.valueOf(value*1.609344));
                                    mih.setText(String.valueOf(value));//
                                    knot.setText(String.valueOf(value*0.868976));
                                    mach.setText(String.valueOf(value/767.269));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////knot////////////////////////////////////
                    case 8:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*0.514444));
                                    fts.setText(String.valueOf(value*1.68781));
                                    kms.setText(String.valueOf(value*0.0005144));
                                    mmin.setText(String.valueOf(value*30.8666));
                                    ftmin.setText(String.valueOf(value*101.268592));
                                    kmmin.setText(String.valueOf(value*0.0308667));
                                    kmh.setText(String.valueOf(value*1.852));
                                    mih.setText(String.valueOf(value*1.150779));
                                    knot.setText(String.valueOf(value));//
                                    mach.setText(String.valueOf(value/666.739));

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mach////////////////////////////////////
                    case 9:
                        inputtextspeed.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextspeed.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextspeed.getText().toString());
                                    m_s.setText(String.valueOf(value*343));
                                    fts.setText(String.valueOf(value*1125.328));
                                    kms.setText(String.valueOf(value/2.915));
                                    mmin.setText(String.valueOf(value*20580));
                                    ftmin.setText(String.valueOf(value*67519.685));
                                    kmmin.setText(String.valueOf(value*20.58));
                                    kmh.setText(String.valueOf(value*1234.8));
                                    mih.setText(String.valueOf(value*767.269));
                                    knot.setText(String.valueOf(value*666.739));
                                    mach.setText(String.valueOf(value));//

                                }
                                else
                                {  m_s.setText(String.valueOf(0));
                                    fts.setText(String.valueOf(0));
                                    kms.setText(String.valueOf(0));
                                    mmin.setText(String.valueOf(0));
                                    ftmin.setText(String.valueOf(0));
                                    kmmin.setText(String.valueOf(0));
                                    kmh.setText(String.valueOf(0));
                                    mih.setText(String.valueOf(0));
                                    knot.setText(String.valueOf(0));
                                    mach.setText(String.valueOf(0));


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
