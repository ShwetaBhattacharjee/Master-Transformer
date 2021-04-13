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


public class BasicAreaFragment extends Fragment {
    EditText inputtextArea;
    TextView square_mm,square_cm,square_dm,square_m,square_inch,square_ft,square_yd,square_km,square_mile,ha,a,acre;
    double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_basic_area, container, false);

        Spinner spinner=(Spinner)view.findViewById(R.id.area_spinner);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.areas,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        inputtextArea=(EditText) view.findViewById(R.id.inputtext);
        square_mm=(TextView) view.findViewById(R.id.square_mm);
        square_cm=(TextView) view.findViewById(R.id.square_cm);
        square_dm=(TextView) view.findViewById(R.id.square_dm);
        square_m=(TextView) view.findViewById(R.id.square_m);
        square_inch=(TextView) view.findViewById(R.id.square_in);
        square_ft=(TextView) view.findViewById(R.id.square_ft);
        square_yd=(TextView) view.findViewById(R.id.square_yd);
        ha=(TextView) view.findViewById(R.id.ha);
        square_km=(TextView) view.findViewById(R.id.square_km);
        square_mile=(TextView) view.findViewById(R.id.square_mile);
        acre=(TextView) view.findViewById(R.id.acre);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {   //////////////////////////square_mm////////////////////////////////////
                    case 0:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*1));
                                    square_cm.setText(String.valueOf(value/100));
                                    square_dm.setText(String.valueOf(value/10000));
                                    square_m.setText(String.valueOf(value/(1e+6)));
                                    square_inch.setText(String.valueOf(value/645.16));
                                    square_ft.setText(String.valueOf(value/92903.04));
                                    square_yd.setText(String.valueOf(value/836127.36));
                                    ha.setText(String.valueOf(value/1e+10));
                                    square_km.setText(String.valueOf(value/(1e+12)));
                                    acre.setText(String.valueOf(value/(4.047e+9)));
                                    square_mile.setText(String.valueOf(value/(2.59e+12)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;

                    //////////////////////////square_cm////////////////////////////////////
                    case 1:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*100));
                                    square_cm.setText(String.valueOf(value*1));
                                    square_dm.setText(String.valueOf(value/100));
                                    square_m.setText(String.valueOf(value/(10000)));
                                    square_inch.setText(String.valueOf(value/6.452));
                                    square_ft.setText(String.valueOf(value/929.03));
                                    square_yd.setText(String.valueOf(value/8361.274));
                                    ha.setText(String.valueOf(value/(1e+8)));
                                    square_km.setText(String.valueOf(value/(1e+10)));
                                    acre.setText(String.valueOf(value/(4.047e+7)));
                                    square_mile.setText(String.valueOf(value/(2.59e+10)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_dm////////////////////////////////////
                    case 2:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*10000));
                                    square_cm.setText(String.valueOf(value*100));
                                    square_dm.setText(String.valueOf(value/1));
                                    square_m.setText(String.valueOf(value/(100)));
                                    square_inch.setText(String.valueOf(value*15.5));
                                    square_ft.setText(String.valueOf(value/9.29));
                                    square_yd.setText(String.valueOf(value/83.613));
                                    ha.setText(String.valueOf(value/(1000000)));
                                    square_km.setText(String.valueOf(value/(1e+8)));
                                    acre.setText(String.valueOf(value/(404685.642)));
                                    square_mile.setText(String.valueOf(value/(2.59e+8)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_m////////////////////////////////////
                    case 3:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*(1e+6)));
                                    square_cm.setText(String.valueOf(value*10000));
                                    square_dm.setText(String.valueOf(value*100));
                                    square_m.setText(String.valueOf(value*1));
                                    square_inch.setText(String.valueOf(value*1550.003));
                                    square_ft.setText(String.valueOf(value*10.764));
                                    square_yd.setText(String.valueOf(value*1.196));
                                    ha.setText(String.valueOf(value/(10000)));
                                    square_km.setText(String.valueOf(value/(1e+6)));
                                    acre.setText(String.valueOf(value/4046.856));
                                    square_mile.setText(String.valueOf(value/(2.59e+6)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_in////////////////////////////////////
                    case 4:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*645.16));
                                    square_cm.setText(String.valueOf(value*6.452));
                                    square_dm.setText(String.valueOf(value/15.5));
                                    square_m.setText(String.valueOf(value/(1550.003)));
                                    square_inch.setText(String.valueOf(value*1));
                                    square_ft.setText(String.valueOf(value/144));
                                    square_yd.setText(String.valueOf(value/1296));
                                    ha.setText(String.valueOf(value/(1.55e+7)));
                                    square_km.setText(String.valueOf(value/(1.55e+9)));
                                    acre.setText(String.valueOf(value/(6.273e+6)));
                                    square_mile.setText(String.valueOf(value/(4.014e+9)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_ft////////////////////////////////////
                    case 5:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*92903.04));
                                    square_cm.setText(String.valueOf(value*929.03));
                                    square_dm.setText(String.valueOf(value*9.29));
                                    square_m.setText(String.valueOf(value/(10.764)));
                                    square_inch.setText(String.valueOf(value*144));
                                    square_ft.setText(String.valueOf(value*1));
                                    square_yd.setText(String.valueOf(value/9));
                                    ha.setText(String.valueOf(value/(107639.104)));
                                    square_km.setText(String.valueOf(value/(1.076e+7)));
                                    acre.setText(String.valueOf(value/(43560)));
                                    square_mile.setText(String.valueOf(value/(2.788e+7)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_yd////////////////////////////////////
                    case 6:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*836127.36));
                                    square_cm.setText(String.valueOf(value*8361.274));
                                    square_dm.setText(String.valueOf(value*83.613));
                                    square_m.setText(String.valueOf(value/(1.196)));
                                    square_inch.setText(String.valueOf(value*1296));
                                    square_ft.setText(String.valueOf(value*9));
                                    square_yd.setText(String.valueOf(value*1));
                                    ha.setText(String.valueOf(value/(11959.9)));
                                    square_km.setText(String.valueOf(value/(1.196e+6)));
                                    acre.setText(String.valueOf(value/(4840)));
                                    square_mile.setText(String.valueOf(value/(3.098e+6)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ha////////////////////////////////////
                    case 7:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*(1e+10)));
                                    square_cm.setText(String.valueOf(value*(1e+8)));
                                    square_dm.setText(String.valueOf(value*(1e+6)));
                                    square_m.setText(String.valueOf(value*(10000)));
                                    square_inch.setText(String.valueOf(value*(1.55e+7)));
                                    square_ft.setText(String.valueOf(value*107639.104));
                                    square_yd.setText(String.valueOf(value*11959.9));
                                    ha.setText(String.valueOf(value*(1)));
                                    square_km.setText(String.valueOf(value/(100)));
                                    acre.setText(String.valueOf(value*(2.471)));
                                    square_mile.setText(String.valueOf(value/(258.999)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_km////////////////////////////////////
                    case 8:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*(1e+12)));
                                    square_cm.setText(String.valueOf(value*(1e+10)));
                                    square_dm.setText(String.valueOf(value*(1e+8)));
                                    square_m.setText(String.valueOf(value*(1e+6)));
                                    square_inch.setText(String.valueOf(value*(1.55e+9)));
                                    square_ft.setText(String.valueOf(value*(1.076e+7)));
                                    square_yd.setText(String.valueOf(value*(1.196e+6)));
                                    ha.setText(String.valueOf(value*(100)));
                                    square_km.setText(String.valueOf(value*(1)));
                                    acre.setText(String.valueOf(value*(247.105)));
                                    square_mile.setText(String.valueOf(value/(2.59)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////acre////////////////////////////////////
                    case 9:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*(4.047e+9)));
                                    square_cm.setText(String.valueOf(value*(4.047e+7)));
                                    square_dm.setText(String.valueOf(value*404685.642));
                                    square_m.setText(String.valueOf(value*(4046.856)));
                                    square_inch.setText(String.valueOf(value*(6.273e+6)));
                                    square_ft.setText(String.valueOf(value*43560));
                                    square_yd.setText(String.valueOf(value*4840));
                                    ha.setText(String.valueOf(value/(2.471)));
                                    square_km.setText(String.valueOf(value/(247.105)));
                                    acre.setText(String.valueOf(value*(1)));
                                    square_mile.setText(String.valueOf(value/(640)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////square_mile////////////////////////////////////
                    case 10:
                        inputtextArea.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextArea.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextArea.getText().toString());
                                    square_mm.setText(String.valueOf(value*(2.59e+12)));
                                    square_cm.setText(String.valueOf(value*(2.59e+10)));
                                    square_dm.setText(String.valueOf(value*(2.59e+8)));
                                    square_m.setText(String.valueOf(value*(2.59e+6)));
                                    square_inch.setText(String.valueOf(value*(4.014e+9)));
                                    square_ft.setText(String.valueOf(value*(2.788e+7)));
                                    square_yd.setText(String.valueOf(value*(3.098e+6)));
                                    ha.setText(String.valueOf(value*(258.999)));
                                    square_km.setText(String.valueOf(value*(2.59)));
                                    acre.setText(String.valueOf(value*(640)));
                                    square_mile.setText(String.valueOf(value*(1)));
                                }
                                else
                                { square_mm.setText("0");
                                    square_cm.setText("0");
                                    square_dm.setText("0");
                                    square_m.setText("0");
                                    square_inch.setText("0");
                                    square_ft.setText("0");
                                    square_yd.setText("0");
                                    ha.setText("0");
                                    square_km.setText("0");
                                    acre.setText("0");
                                    square_mile.setText("0");

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
