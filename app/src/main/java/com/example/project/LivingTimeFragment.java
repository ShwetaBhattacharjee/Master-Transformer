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


public class LivingTimeFragment extends Fragment {
EditText inputtexttime;
TextView ms,sec,min,hour,day,week,month,year;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_living_time, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.time_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.times,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtexttime=view.findViewById(R.id.inputtexttime);
        ms=view.findViewById(R.id.ms);
        sec=view.findViewById(R.id.sec);
        min=view.findViewById(R.id.min);
        hour=view.findViewById(R.id.hour);
        day=view.findViewById(R.id.day);
        week=view.findViewById(R.id.week);
        month=view.findViewById(R.id.month);
        year=view.findViewById(R.id.year);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////ms////////////////////////////////////
                    case 0:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value));
                                    sec.setText(String.valueOf(value/1000));
                                    min.setText(String.valueOf(value/60000));
                                    hour.setText(String.valueOf(value/3.6e+6));
                                    day.setText(String.valueOf(value/8.64e+7));
                                    week.setText(String.valueOf(value/6.048e+8));
                                    month.setText(String.valueOf(value/2.628e+9));
                                    year.setText(String.valueOf(value/3.154e+10));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////sec////////////////////////////////////
                    case 1:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*1000));
                                    sec.setText(String.valueOf(value));//
                                    min.setText(String.valueOf(value/60));
                                    hour.setText(String.valueOf(value/3600));
                                    day.setText(String.valueOf(value/86400));
                                    week.setText(String.valueOf(value/604800));
                                    month.setText(String.valueOf(value/2.628e+6));
                                    year.setText(String.valueOf(value/3.154e+7));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////min////////////////////////////////////
                    case 2:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*60000));
                                    sec.setText(String.valueOf(value*60));
                                    min.setText(String.valueOf(value));
                                    hour.setText(String.valueOf(value/60));
                                    day.setText(String.valueOf(value/1440));
                                    week.setText(String.valueOf(value/10080));
                                    month.setText(String.valueOf(value/43800.048));
                                    year.setText(String.valueOf(value/525600));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////hour////////////////////////////////////
                    case 3:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*3.6e+6));
                                    sec.setText(String.valueOf(value*3600));
                                    min.setText(String.valueOf(value*60));
                                    hour.setText(String.valueOf(value));//
                                    day.setText(String.valueOf(value/24));
                                    week.setText(String.valueOf(value/168));
                                    month.setText(String.valueOf(value/730.001));
                                    year.setText(String.valueOf(value/8760));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////day////////////////////////////////////
                    case 4:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*8.64e+7));
                                    sec.setText(String.valueOf(value*86400));
                                    min.setText(String.valueOf(value*1440));
                                    hour.setText(String.valueOf(value*24));
                                    day.setText(String.valueOf(value));//
                                    week.setText(String.valueOf(value/7));
                                    month.setText(String.valueOf(value/30.417));
                                    year.setText(String.valueOf(value/365));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////week////////////////////////////////////
                    case 5:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*6.048e+8));
                                    sec.setText(String.valueOf(value*604800));
                                    min.setText(String.valueOf(value*10080));
                                    hour.setText(String.valueOf(value*168));
                                    day.setText(String.valueOf(value*7));
                                    week.setText(String.valueOf(value));//
                                    month.setText(String.valueOf(value/4.345));
                                    year.setText(String.valueOf(value/52.143));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////month////////////////////////////////////
                    case 6:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*2.628e+9));
                                    sec.setText(String.valueOf(value*2.628e+6));
                                    min.setText(String.valueOf(value*43800.048));
                                    hour.setText(String.valueOf(value*730.001));
                                    day.setText(String.valueOf(value*30.417));
                                    week.setText(String.valueOf(value*4.345));
                                    month.setText(String.valueOf(value));//
                                    year.setText(String.valueOf(value/12));

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break; //////////////////////////year////////////////////////////////////
                    case 7:
                        inputtexttime.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtexttime.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtexttime.getText().toString());
                                    ms.setText(String.valueOf(value*3.154e+10));
                                    sec.setText(String.valueOf(value*3.154e+7));
                                    min.setText(String.valueOf(value*525600));
                                    hour.setText(String.valueOf(value*8760));
                                    day.setText(String.valueOf(value*365));
                                    week.setText(String.valueOf(value*52.143));
                                    month.setText(String.valueOf(value*12));
                                    year.setText(String.valueOf(value));//

                                }
                                else
                                { ms.setText(String.valueOf(0));
                                    sec.setText(String.valueOf(0));
                                    min.setText(String.valueOf(0));
                                    hour.setText(String.valueOf(0));
                                    day.setText(String.valueOf(0));
                                    week.setText(String.valueOf(0));
                                    month.setText(String.valueOf(0));
                                    year.setText(String.valueOf(0));


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
