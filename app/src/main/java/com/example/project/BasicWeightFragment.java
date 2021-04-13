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


public class BasicWeightFragment extends Fragment {
EditText inputtextWeight;
TextView micro_gram,mg,g,kg,lb_pound,oz,ozt,grain,tonne,tonUk,tonUs,stoneUk,cwt,carat;
double value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_basic_weight, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.weight_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.weights,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtextWeight=(EditText) view.findViewById(R.id.inputtext);
        micro_gram=(TextView) view.findViewById(R.id.micro_gram);
        mg=(TextView) view.findViewById(R.id.mg);
        g=(TextView) view.findViewById(R.id.gram);
        kg=(TextView) view.findViewById(R.id.kg);
        lb_pound=(TextView) view.findViewById(R.id.lb_pound);
        oz=(TextView) view.findViewById(R.id.oz);
        ozt=(TextView) view.findViewById(R.id.oz_t);
        grain=(TextView) view.findViewById(R.id.grain);
        tonne=(TextView) view.findViewById(R.id.tonne);
        tonUk=(TextView) view.findViewById(R.id.ton_uk);
        tonUs=(TextView) view.findViewById(R.id.ton_us);
        stoneUk=(TextView) view.findViewById(R.id.stone_uk);
        cwt=(TextView) view.findViewById(R.id.cwt);
        carat=(TextView) view.findViewById(R.id.carat);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {   //////////////////////////microgram////////////////////////////////////
                    case 0:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1));
                                    mg.setText(String.valueOf(value/1000));
                                    g.setText(String.valueOf(value/1e+6));
                                    kg.setText(String.valueOf(value/(1e+9)));
                                    lb_pound.setText(String.valueOf(value/4.536e+8));
                                    oz.setText(String.valueOf(value/2.835e+7));
                                    ozt.setText(String.valueOf(value/3.11e+7));
                                    grain.setText(String.valueOf(value/(64798.91)));
                                    tonne.setText(String.valueOf(value/(1e+12)));
                                    tonUk.setText(String.valueOf(value/(1.016e+12)));
                                    tonUs.setText(String.valueOf(value/(9.072e+11)));
                                    stoneUk.setText(String.valueOf(value/(6.35e+9)));
                                    cwt.setText(String.valueOf(value/(5.08e+10)));
                                    carat.setText(String.valueOf(value/(200000)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mg////////////////////////////////////
                    case 1:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1000));
                                    mg.setText(String.valueOf(value*1));
                                    g.setText(String.valueOf(value/1000));
                                    kg.setText(String.valueOf(value/(1e+6)));
                                    lb_pound.setText(String.valueOf(value/453592.37));
                                    oz.setText(String.valueOf(value/28349.523));
                                    ozt.setText(String.valueOf(value/31103.477));
                                    grain.setText(String.valueOf(value/(64.799)));
                                    tonne.setText(String.valueOf(value/(1e+9)));
                                    tonUk.setText(String.valueOf(value/(1.016e+9)));
                                    tonUs.setText(String.valueOf(value/(9.072e+8)));
                                    stoneUk.setText(String.valueOf(value/(6.35e+6)));
                                    cwt.setText(String.valueOf(value/(5.08e+7)));
                                    carat.setText(String.valueOf(value/(200)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////g////////////////////////////////////
                    case 2:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1e+6));
                                    mg.setText(String.valueOf(value*1000));
                                    g.setText(String.valueOf(value*1));
                                    kg.setText(String.valueOf(value/(1000)));
                                    lb_pound.setText(String.valueOf(value/453.592));
                                    oz.setText(String.valueOf(value/28.35));
                                    ozt.setText(String.valueOf(value/31.103));
                                    grain.setText(String.valueOf(value*(15.432)));
                                    tonne.setText(String.valueOf(value/(1e+6)));
                                    tonUk.setText(String.valueOf(value/(1.016e+6)));
                                    tonUs.setText(String.valueOf(value/(907184.74)));
                                    stoneUk.setText(String.valueOf(value/(6350.293)));
                                    cwt.setText(String.valueOf(value/(50802.345)));
                                    carat.setText(String.valueOf(value*(5)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////kg////////////////////////////////////
                    case 3:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1e+9));
                                    mg.setText(String.valueOf(value*1e+6));
                                    g.setText(String.valueOf(value*1000));
                                    kg.setText(String.valueOf(value*(1)));
                                    lb_pound.setText(String.valueOf(value*2.205));
                                    oz.setText(String.valueOf(value*35.274));
                                    ozt.setText(String.valueOf(value*32.151));
                                    grain.setText(String.valueOf(value*(15432.358)));
                                    tonne.setText(String.valueOf(value/(1000)));
                                    tonUk.setText(String.valueOf(value/(1016.047)));
                                    tonUs.setText(String.valueOf(value/(967.185)));
                                    stoneUk.setText(String.valueOf(value/(6.35)));
                                    cwt.setText(String.valueOf(value/(50.802)));
                                    carat.setText(String.valueOf(value*(5000)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////lb_pound////////////////////////////////////
                    case 4:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*4.536e+8));
                                    mg.setText(String.valueOf(value*453592.37));
                                    g.setText(String.valueOf(value*453.592));
                                    kg.setText(String.valueOf(value/(2.205)));
                                    lb_pound.setText(String.valueOf(value/1));
                                    oz.setText(String.valueOf(value*16));
                                    ozt.setText(String.valueOf(value*14.583));
                                    grain.setText(String.valueOf(value*(7000)));
                                    tonne.setText(String.valueOf(value/(2204.623)));
                                    tonUk.setText(String.valueOf(value/(2240)));
                                    tonUs.setText(String.valueOf(value/(2000)));
                                    stoneUk.setText(String.valueOf(value/(14)));
                                    cwt.setText(String.valueOf(value/(112)));
                                    carat.setText(String.valueOf(value*(2267.962)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////oz////////////////////////////////////
                    case 5:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*2.835e+7));
                                    mg.setText(String.valueOf(value*28349.523));
                                    g.setText(String.valueOf(value*28.35));
                                    kg.setText(String.valueOf(value/(35.274)));
                                    lb_pound.setText(String.valueOf(value/16));
                                    oz.setText(String.valueOf(value/1));
                                    ozt.setText(String.valueOf(value/1.097));
                                    grain.setText(String.valueOf(value*(437.5)));
                                    tonne.setText(String.valueOf(value/(35273.962)));
                                    tonUk.setText(String.valueOf(value/(35840)));
                                    tonUs.setText(String.valueOf(value/(32000)));
                                    stoneUk.setText(String.valueOf(value/(224)));
                                    cwt.setText(String.valueOf(value/(1792)));
                                    carat.setText(String.valueOf(value*(141.748)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////ozt////////////////////////////////////
                    case 6:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());

                                    micro_gram.setText(String.valueOf(value*3.11e+7));
                                    mg.setText(String.valueOf(value*31103.477));
                                    g.setText(String.valueOf(value*31.103));
                                    kg.setText(String.valueOf(value/(32.151)));
                                    lb_pound.setText(String.valueOf(value/14.583));
                                    oz.setText(String.valueOf(value*1.097));
                                    ozt.setText(String.valueOf(value/1));
                                    grain.setText(String.valueOf(value*(480)));
                                    tonne.setText(String.valueOf(value/(32150.747)));
                                    tonUk.setText(String.valueOf(value/(32666.667)));
                                    tonUs.setText(String.valueOf(value/(29166.667)));
                                    stoneUk.setText(String.valueOf(value/(204.167)));
                                    cwt.setText(String.valueOf(value/(1633.333)));
                                    carat.setText(String.valueOf(value*(155.517)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////grain////////////////////////////////////
                    case 7:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*64798.91));
                                    mg.setText(String.valueOf(value*64.799));
                                    g.setText(String.valueOf(value/15.432));
                                    kg.setText(String.valueOf(value/(15432.358)));
                                    lb_pound.setText(String.valueOf(value/7000));
                                    oz.setText(String.valueOf(value/437.5));
                                    ozt.setText(String.valueOf(value/480));
                                    grain.setText(String.valueOf(value/(1)));
                                    tonne.setText(String.valueOf(value/(1.543e+7)));
                                    tonUk.setText(String.valueOf(value/(1.568e+7)));
                                    tonUs.setText(String.valueOf(value/(1.4e+7)));
                                    stoneUk.setText(String.valueOf(value/(98000)));
                                    cwt.setText(String.valueOf(value/(784000)));
                                    carat.setText(String.valueOf(value/(3.086)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////tonne////////////////////////////////////
                    case 8:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1e+12));
                                    mg.setText(String.valueOf(value*1e+9));
                                    g.setText(String.valueOf(value*1e+6));
                                    kg.setText(String.valueOf(value*(1000)));
                                    lb_pound.setText(String.valueOf(value*2204.623));
                                    oz.setText(String.valueOf(value*35273.962));
                                    ozt.setText(String.valueOf(value*32150.747));
                                    grain.setText(String.valueOf(value*(1.543e+7)));
                                    tonne.setText(String.valueOf(value*(1)));
                                    tonUk.setText(String.valueOf(value/(1.016)));
                                    tonUs.setText(String.valueOf(value*(1.102)));
                                    stoneUk.setText(String.valueOf(value*(157.473)));
                                    cwt.setText(String.valueOf(value*(19.684)));
                                    carat.setText(String.valueOf(value*(5e+6)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////tonuk////////////////////////////////////
                    case 9:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*1.016e+12));
                                    mg.setText(String.valueOf(value*1.016e+9));
                                    g.setText(String.valueOf(value*1.016e+6));
                                    kg.setText(String.valueOf(value*(1016.047)));
                                    lb_pound.setText(String.valueOf(value*2240));
                                    oz.setText(String.valueOf(value*35840));
                                    ozt.setText(String.valueOf(value*32666.667));
                                    grain.setText(String.valueOf(value*(1.568e+7)));
                                    tonne.setText(String.valueOf(value*(1.016)));
                                    tonUk.setText(String.valueOf(value*(1)));
                                    tonUs.setText(String.valueOf(value*(1.12)));
                                    stoneUk.setText(String.valueOf(value*(160)));
                                    cwt.setText(String.valueOf(value*(20)));
                                    carat.setText(String.valueOf(value*(5.08e+6)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////tonus////////////////////////////////////
                    case 10:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*9.072e+11));
                                    mg.setText(String.valueOf(value*9.072e+8));
                                    g.setText(String.valueOf(value*907184.74));
                                    kg.setText(String.valueOf(value*(907.185)));
                                    lb_pound.setText(String.valueOf(value*2000));
                                    oz.setText(String.valueOf(value*32000));
                                    ozt.setText(String.valueOf(value*29166.667));
                                    grain.setText(String.valueOf(value*(1.4e+7)));
                                    tonne.setText(String.valueOf(value/(1.102)));
                                    tonUk.setText(String.valueOf(value/(1.12)));
                                    tonUs.setText(String.valueOf(value/(1)));
                                    stoneUk.setText(String.valueOf(value*(142.857)));
                                    cwt.setText(String.valueOf(value*(17.857)));
                                    carat.setText(String.valueOf(value*(4.536e+6)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////stoneuk////////////////////////////////////
                    case 11:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*6.35e+9));
                                    mg.setText(String.valueOf(value*6.35e+6));
                                    g.setText(String.valueOf(value*6350.293));
                                    kg.setText(String.valueOf(value*(6.35)));
                                    lb_pound.setText(String.valueOf(value*14));
                                    oz.setText(String.valueOf(value*224));
                                    ozt.setText(String.valueOf(value*204.167));
                                    grain.setText(String.valueOf(value*(98000)));
                                    tonne.setText(String.valueOf(value/(157.473)));
                                    tonUk.setText(String.valueOf(value/(160)));
                                    tonUs.setText(String.valueOf(value/(142.857)));
                                    stoneUk.setText(String.valueOf(value/(1)));
                                    cwt.setText(String.valueOf(value/(8)));
                                    carat.setText(String.valueOf(value*(31751.466)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////cwt////////////////////////////////////
                    case 12:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*5.08e+10));
                                    mg.setText(String.valueOf(value*5.08e+7));
                                    g.setText(String.valueOf(value*50802.345));
                                    kg.setText(String.valueOf(value*(50.802)));
                                    lb_pound.setText(String.valueOf(value*112));
                                    oz.setText(String.valueOf(value*1792));
                                    ozt.setText(String.valueOf(value*1633.333));
                                    grain.setText(String.valueOf(value*(784000)));
                                    tonne.setText(String.valueOf(value/(19.684)));
                                    tonUk.setText(String.valueOf(value/(20)));
                                    tonUs.setText(String.valueOf(value/(17.857)));
                                    stoneUk.setText(String.valueOf(value*(8)));
                                    cwt.setText(String.valueOf(value*(1)));
                                    carat.setText(String.valueOf(value*(254011.727)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
//////////////////////////carat////////////////////////////////////
                    case 13:
                        inputtextWeight.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextWeight.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextWeight.getText().toString());
                                    micro_gram.setText(String.valueOf(value*200000));
                                    mg.setText(String.valueOf(value*200));
                                    g.setText(String.valueOf(value/5));
                                    kg.setText(String.valueOf(value/(5000)));
                                    lb_pound.setText(String.valueOf(value/2267.962));
                                    oz.setText(String.valueOf(value/141.748));
                                    ozt.setText(String.valueOf(value/155.517));
                                    grain.setText(String.valueOf(value*(3.086)));
                                    tonne.setText(String.valueOf(value/(5e+6)));
                                    tonUk.setText(String.valueOf(value/(5.08e+6)));
                                    tonUs.setText(String.valueOf(value/(4.536e+6)));
                                    stoneUk.setText(String.valueOf(value/(31751.466)));
                                    cwt.setText(String.valueOf(value/(254011.727)));
                                    carat.setText(String.valueOf(value/(1)));
                                }
                                else
                                { micro_gram.setText("0");
                                    mg.setText("0");
                                    g.setText("0");
                                    kg.setText("0");
                                    lb_pound.setText("0");
                                    oz.setText("0");
                                    ozt.setText("0");
                                    grain.setText("0");
                                    tonne.setText("0");
                                    tonUk.setText("0");
                                    tonUs.setText("0");
                                    stoneUk.setText("0");
                                    cwt.setText("0");
                                    carat.setText("0");

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
