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


public class MiscBloodSugar extends Fragment {
    EditText inputtextbloodsugar;
    double value;
    TextView mg_dl,mmolL,hba1c,mmolMol;;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_misc_blood_sugar, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.blood_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.bloodsugars,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        inputtextbloodsugar=view.findViewById(R.id.inputtextbloodsugar);
        mg_dl=view.findViewById(R.id.mg_dl);
        mmolL=view.findViewById(R.id.mmol_l);
        hba1c=view.findViewById(R.id.hb_a1c);
        mmolMol=view.findViewById(R.id.mmol_mol);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {    //////////////////////////mg_dl////////////////////////////////////
                    case 0:
                        inputtextbloodsugar.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextbloodsugar.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextbloodsugar.getText().toString());
                                    mg_dl.setText(String.valueOf(value));//
                                    mmolL.setText(String.valueOf(value/18));//
                                    hba1c.setText(String.valueOf((value+46.7)/28.7));//
                                    mmolMol.setText(String.valueOf((((value+46.7)/28.7-2.152)/0.09148)));//
                                }
                                else
                                {
                                    mg_dl.setText(String.valueOf(0));
                                    mmolL.setText(String.valueOf(0));
                                    hba1c.setText(String.valueOf(0));
                                    mmolMol.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mmolL////////////////////////////////////
                    case 1:
                        inputtextbloodsugar.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextbloodsugar.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextbloodsugar.getText().toString());
                                    mg_dl.setText(String.valueOf(value*18));//
                                    mmolL.setText(String.valueOf(value));//
                                    hba1c.setText(String.valueOf((value*0.631712)+1.591914));//
                                    mmolMol.setText(String.valueOf(((value*0.631712)-0.560086)/0.09148));//
                                }
                                else
                                {
                                    mg_dl.setText(String.valueOf(0));
                                    mmolL.setText(String.valueOf(0));
                                    hba1c.setText(String.valueOf(0));
                                    mmolMol.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////hba1c////////////////////////////////////
                    case 2:
                        inputtextbloodsugar.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextbloodsugar.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextbloodsugar.getText().toString());
                                    mg_dl.setText(String.valueOf((28.7*value)-46.7));//
                                    mmolL.setText(String.valueOf((value-1.591914)/0.631712));//
                                    hba1c.setText(String.valueOf(value));//
                                    mmolMol.setText(String.valueOf((10.93*value)-23.50));//
                                }
                                else
                                {
                                    mg_dl.setText(String.valueOf(0));
                                    mmolL.setText(String.valueOf(0));
                                    hba1c.setText(String.valueOf(0));
                                    mmolMol.setText(String.valueOf(0));
                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////mmolMol////////////////////////////////////
                    case 3:
                        inputtextbloodsugar.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtextbloodsugar.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtextbloodsugar.getText().toString());
                                    mg_dl.setText(String.valueOf(((((value*0.09148)+2.152)*28.7)-46.7)));//
                                    mmolL.setText(String.valueOf(((value*0.09148)+0.560086)/0.631712));//
                                    hba1c.setText(String.valueOf((0.09148*value)+2.152));//
                                    mmolMol.setText(String.valueOf(value));//
                                }
                                else
                                {
                                    mg_dl.setText(String.valueOf(0));
                                    mmolL.setText(String.valueOf(0));
                                    hba1c.setText(String.valueOf(0));
                                    mmolMol.setText(String.valueOf(0)); }
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
