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


public class LivingTemperatureFragment extends Fragment {
   EditText inputtext;
    TextView c,f,k,r,re;
    double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_living_temperature, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.temperature_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.temps,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        inputtext=view.findViewById(R.id.inputtextTemperature);
        c=view.findViewById(R.id.celsius);
        f=view.findViewById(R.id.farenheit);
        k=view.findViewById(R.id.kelvin);
        r=view.findViewById(R.id.r);
        re=view.findViewById(R.id.re);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////c////////////////////////////////////
                    case 0:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    c.setText(String.valueOf(value));
                                    f.setText(String.valueOf((value *9/5) + 32 ));
                                    k.setText(String.valueOf(value+273.15));
                                    r.setText(String.valueOf(value*9/5 + 491.67));
                                    re.setText(String.valueOf(value*0.8));

                                }
                                else
                                { c.setText(String.valueOf(0));
                                    f.setText(String.valueOf(0));
                                    k.setText(String.valueOf(0));
                                    r.setText(String.valueOf(0));
                                    re.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////f////////////////////////////////////
                    case 1:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    c.setText(String.valueOf((value-32)* 5/9));
                                    f.setText(String.valueOf(value));
                                    k.setText(String.valueOf((value-32)*5/9 + 273.15));
                                    r.setText(String.valueOf(value+459.67));
                                    re.setText(String.valueOf(( value - 32) / 2.25));

                                }
                                else
                                { c.setText(String.valueOf(0));
                                    f.setText(String.valueOf(0));
                                    k.setText(String.valueOf(0));
                                    r.setText(String.valueOf(0));
                                    re.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////k////////////////////////////////////
                    case 2:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    c.setText(String.valueOf(value-273.15));
                                    f.setText(String.valueOf((value-273.15)*9/5 + 32 ));
                                    k.setText(String.valueOf(value));
                                    r.setText(String.valueOf(value*1.8));
                                    re.setText(String.valueOf((value-273.15)*0.8));

                                }
                                else
                                { c.setText(String.valueOf(0));
                                    f.setText(String.valueOf(0));
                                    k.setText(String.valueOf(0));
                                    r.setText(String.valueOf(0));
                                    re.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////r////////////////////////////////////
                    case 3:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    c.setText(String.valueOf((value-491.67)*5/9 ));
                                    f.setText(String.valueOf(value-459.67));
                                    k.setText(String.valueOf(value*5/9));
                                    r.setText(String.valueOf(value));
                                    re.setText(String.valueOf((value-32-459.67)/2.25));

                                }
                                else
                                { c.setText(String.valueOf(0));
                                    f.setText(String.valueOf(0));
                                    k.setText(String.valueOf(0));
                                    r.setText(String.valueOf(0));
                                    re.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////re////////////////////////////////////
                    case 4:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    c.setText(String.valueOf(value*1.25));
                                    f.setText(String.valueOf(value*2.25+32));
                                    k.setText(String.valueOf(value*1.25+273.15));
                                    r.setText(String.valueOf(value*2.25+32+459.67));
                                    re.setText(String.valueOf(value));

                                }
                                else
                                { c.setText(String.valueOf(0));
                                    f.setText(String.valueOf(0));
                                    k.setText(String.valueOf(0));
                                    r.setText(String.valueOf(0));
                                    re.setText(String.valueOf(0));


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
