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

public class SciencePressureFragment extends Fragment {
EditText inputtextpressure;
TextView atm,pa,bar,psf,ksi,kgf,mmHg,mmH20,mTorr;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_science_pressure, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.pressure_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.pressures,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        inputtextpressure=view.findViewById(R.id.inputtextpressure);
        atm=view.findViewById(R.id.atm);
        pa=view.findViewById(R.id.pa);
        bar=view.findViewById(R.id.bar);
        psf=view.findViewById(R.id.psf);
        ksi=view.findViewById(R.id.ksi);
        kgf=view.findViewById(R.id.kgf_m);
        mmHg=view.findViewById(R.id.mmHg);
        mmH20=view.findViewById(R.id.mmho);
        mTorr=view.findViewById(R.id.mTorr);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////atm////////////////////////////////////
                    case 0:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value));
                                    pa.setText(String.valueOf(value*101325));
                                    bar.setText(String.valueOf(value*1.01325));
                                    psf.setText(String.valueOf(value*2116.2166));
                                    ksi.setText(String.valueOf(value/68.046));
                                    kgf.setText(String.valueOf(value*10332.275));
                                    mmHg.setText(String.valueOf(value*760));
                                    mmH20.setText(String.valueOf(value/9.67841e-5));
                                    mTorr.setText(String.valueOf(value*760));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////pa////////////////////////////////////
                    case 1:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/101325));
                                    pa.setText(String.valueOf(value));//
                                    bar.setText(String.valueOf(value/100000));
                                    psf.setText(String.valueOf(value*0.020885));
                                    ksi.setText(String.valueOf(value/6.895e+6));
                                    kgf.setText(String.valueOf(value/9.807));
                                    mmHg.setText(String.valueOf(value/133.322));
                                    mmH20.setText(String.valueOf(value*0.101972));
                                    mTorr.setText(String.valueOf(value/133.322));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////bar////////////////////////////////////
                    case 2:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/1.013));
                                    pa.setText(String.valueOf(value*100000));
                                    bar.setText(String.valueOf(value));//
                                    psf.setText(String.valueOf(value*2088.5434));
                                    ksi.setText(String.valueOf(value/68.948));
                                    kgf.setText(String.valueOf(value*10197.162));
                                    mmHg.setText(String.valueOf(value*750.062));
                                    mmH20.setText(String.valueOf(value*10197.16213));
                                    mTorr.setText(String.valueOf(value*750.062));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////psf////////////////////////////////////
                    case 3:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/2116));
                                    pa.setText(String.valueOf(value*47.88));
                                    bar.setText(String.valueOf(value*0.000479));
                                    psf.setText(String.valueOf(value));//
                                    ksi.setText(String.valueOf(value*6.945e-6));
                                    kgf.setText(String.valueOf(value/4.88));
                                    mmHg.setText(String.valueOf(value*0.35913));
                                    mmH20.setText(String.valueOf(value*4.88));
                                    mTorr.setText(String.valueOf(value*0.359131));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////ksi////////////////////////////////////
                    case 4:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value*68.046));
                                    pa.setText(String.valueOf(value*6.895e+6));
                                    bar.setText(String.valueOf(value*68.948));
                                    psf.setText(String.valueOf(value/	6.945E-6));
                                    ksi.setText(String.valueOf(value));//
                                    kgf.setText(String.valueOf(value*703069.579));
                                    mmHg.setText(String.valueOf(value*51714.840249));
                                    mmH20.setText(String.valueOf(value*703088.937324));
                                    mTorr.setText(String.valueOf(value*51714.933));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////kgf////////////////////////////////////
                    case 5:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/10332.27426));
                                    pa.setText(String.valueOf(value*9.807));
                                    bar.setText(String.valueOf(value/10197.1621));
                                    psf.setText(String.valueOf(value*0.20));
                                    ksi.setText(String.valueOf(value/703068.30624));
                                    kgf.setText(String.valueOf(value));//
                                    mmHg.setText(String.valueOf(value/13.595098));
                                    mmH20.setText(String.valueOf(value));
                                    mTorr.setText(String.valueOf(value/13.595098));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mmHg////////////////////////////////////
                    case 6:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/760));
                                    pa.setText(String.valueOf(value*133.322365));
                                    bar.setText(String.valueOf(value/750.0617));
                                    psf.setText(String.valueOf(value*2.7845));
                                    ksi.setText(String.valueOf(value/51714.840249));
                                    kgf.setText(String.valueOf(value*13.595));
                                    mmHg.setText(String.valueOf(value));//
                                    mmH20.setText(String.valueOf(value*13.5951));
                                    mTorr.setText(String.valueOf(value));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mmH20////////////////////////////////////
                    case 7:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/10332.27));
                                    pa.setText(String.valueOf(value*9.80665));
                                    bar.setText(String.valueOf(value*0.0000980665));
                                    psf.setText(String.valueOf(value*0.20482));
                                    ksi.setText(String.valueOf(value*1.4222951732392E-6));
                                    kgf.setText(String.valueOf(value));
                                    mmHg.setText(String.valueOf(value*0.07356));
                                    mmH20.setText(String.valueOf(value));//
                                    mTorr.setText(String.valueOf(value*0.07356));

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////Torr////////////////////////////////////
                    case 8:
                        inputtextpressure.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextpressure.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextpressure.getText().toString());
                                    atm.setText(String.valueOf(value/760));
                                    pa.setText(String.valueOf(value*133.32237));
                                    bar.setText(String.valueOf(value*0.00133322));
                                    psf.setText(String.valueOf(value*2.7844956));
                                    ksi.setText(String.valueOf(value/51714.933));
                                    kgf.setText(String.valueOf(value*13.595));
                                    mmHg.setText(String.valueOf(value*1));
                                    mmH20.setText(String.valueOf(value*13.5951));
                                    mTorr.setText(String.valueOf(value));//

                                }
                                else
                                {  atm.setText(String.valueOf(0));
                                    pa.setText(String.valueOf(0));
                                    bar.setText(String.valueOf(0));
                                    psf.setText(String.valueOf(0));
                                    ksi.setText(String.valueOf(0));
                                    kgf.setText(String.valueOf(0));
                                    mmHg.setText(String.valueOf(0));
                                    mmH20.setText(String.valueOf(0));
                                    mTorr.setText(String.valueOf(0));


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
