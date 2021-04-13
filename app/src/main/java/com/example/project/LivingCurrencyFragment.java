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


public class LivingCurrencyFragment extends Fragment {
    EditText inputtext;
    double value;
    TextView bdt,usd,euro,jy,ps,sf,ad,cd,ir,skw,cy,hkd,sdr,sd,tb,irh,mr,pp,vd,bd,pr,ns,mk,sr,mrf;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_living_currency, container, false);
        Spinner spinner=(Spinner)view.findViewById(R.id.currency_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.currencies,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        inputtext=(EditText) view.findViewById(R.id.inputtext);
        bdt=(TextView) view.findViewById(R.id.BangladeshiTaka);
        usd=(TextView) view.findViewById(R.id.UnitedStatesDollar);
        euro=(TextView) view.findViewById(R.id.Euro);
        jy=(TextView) view.findViewById(R.id.JapaneseYen);
        ps=(TextView) view.findViewById(R.id.PoundSterling);
        sf=(TextView) view.findViewById(R.id.SwissFranc);
        ad=(TextView) view.findViewById(R.id.AustralianDollar);
        cd=(TextView) view.findViewById(R.id.CanadianDollar);
        ir=(TextView) view.findViewById(R.id.IndianRupee);
        skw=(TextView) view.findViewById(R.id.SouthKoreanWon);
        cy=(TextView) view.findViewById(R.id.ChineseYuan);
        tb=(TextView) view.findViewById(R.id.ThaiBaht);
        irh=(TextView) view.findViewById(R.id.IndonesianRupiah);
        mr=(TextView) view.findViewById(R.id.MalaysianRingit);
        pp=(TextView) view.findViewById(R.id.PhilipinePeso);
        vd=(TextView) view.findViewById(R.id.VietnameseDong);
        pr=(TextView) view.findViewById(R.id.PakistaniRupee);
        ns=(TextView) view.findViewById(R.id.NepaleseRupee);
        mk=(TextView) view.findViewById(R.id.MynmarKyat);
        sr=(TextView) view.findViewById(R.id.SrilankanRupee);
        mrf=(TextView) view.findViewById(R.id.MaldivianRufiyaa);
        hkd=(TextView) view.findViewById(R.id.HongKongDollar);
        sdr=(TextView) view.findViewById(R.id.SaudiRiyal);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {   //////////////////////////bdt////////////////////////////////////
                    case 0:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value));
                                    usd.setText(String.valueOf(value*0.012));
                                    euro.setText(String.valueOf(value*0.011));
                                    jy.setText(String.valueOf(value*1.28));
                                    ps.setText(String.valueOf(value*0.0096));
                                    sf.setText(String.valueOf(value*0.012));
                                    ad.setText(String.valueOf(value*0.017));
                                    cd.setText(String.valueOf(value*0.016));
                                    ir.setText(String.valueOf(value*0.84));
                                    skw.setText(String.valueOf(value*14.23));
                                    cy.setText(String.valueOf(value*0.084));
                                    hkd.setText(String.valueOf(value*0.093));
                                    sdr.setText(String.valueOf(value*0.044));
                                    tb.setText(String.valueOf(value*0.36));
                                    irh.setText(String.valueOf(value*167.95));
                                    mr.setText(String.valueOf(value*0.050));
                                    pp.setText(String.valueOf(value*0.61));
                                    vd.setText(String.valueOf(value*274.59));
                                    pr.setText(String.valueOf(value*1.86));
                                    ns.setText(String.valueOf(value*1.34));
                                    mk.setText(String.valueOf(value*18.13));
                                    sr.setText(String.valueOf(value*2.15));
                                    mrf.setText(String.valueOf(value*0.18));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////usd////////////////////////////////////
                    case 1:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*84.55));
                                    usd.setText(String.valueOf(value));
                                    euro.setText(String.valueOf(value*0.91));
                                    jy.setText(String.valueOf(value*107.96));
                                    ps.setText(String.valueOf(value*0.81));
                                    sf.setText(String.valueOf(value*0.99));
                                    ad.setText(String.valueOf(value*1.48));
                                    cd.setText(String.valueOf(value*1.32));
                                    ir.setText(String.valueOf(value*70.67));
                                    skw.setText(String.valueOf(value*1202.96));
                                    cy.setText(String.valueOf(value*7.12));
                                    hkd.setText(String.valueOf(value*7.84));
                                    sdr.setText(String.valueOf(value*3.75));
                                    tb.setText(String.valueOf(value*30.64));
                                    irh.setText(String.valueOf(value*14194.80));
                                    mr.setText(String.valueOf(value*4.19));
                                    pp.setText(String.valueOf(value*51.89));
                                    vd.setText(String.valueOf(value*23208.50));
                                    pr.setText(String.valueOf(value*156.85));
                                    ns.setText(String.valueOf(value*112.94));
                                    mk.setText(String.valueOf(value*1532));
                                    sr.setText(String.valueOf(value*181.90));
                                    mrf.setText(String.valueOf(value*15.41));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;
                    //////////////////////////euro////////////////////////////////////
                    case 2:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*92.51));
                                    usd.setText(String.valueOf(value*1.09));
                                    euro.setText(String.valueOf(value));//
                                    jy.setText(String.valueOf(value*118.12));
                                    ps.setText(String.valueOf(value*0.89));
                                    sf.setText(String.valueOf(value*1.08));
                                    ad.setText(String.valueOf(value*1.62));
                                    cd.setText(String.valueOf(value*1.45));
                                    ir.setText(String.valueOf(value*77.33));
                                    skw.setText(String.valueOf(value*1316.16));
                                    cy.setText(String.valueOf(value*7.79));
                                    hkd.setText(String.valueOf(value*8.58));
                                    sdr.setText(String.valueOf(value*4.10));
                                    tb.setText(String.valueOf(value*33.53));
                                    irh.setText(String.valueOf(value*15530.57));
                                    mr.setText(String.valueOf(value*4.59));
                                    pp.setText(String.valueOf(value*56.77));
                                    vd.setText(String.valueOf(value*25392.49));
                                    pr.setText(String.valueOf(value*171.61));
                                    ns.setText(String.valueOf(value*123.56));
                                    mk.setText(String.valueOf(value*1676.17));
                                    sr.setText(String.valueOf(value*199.02));
                                    mrf.setText(String.valueOf(value*16.86));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));


                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////jy////////////////////////////////////
                    case 3:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.78));
                                    usd.setText(String.valueOf(value*0.0092));
                                    euro.setText(String.valueOf(value*0.0085));
                                    jy.setText(String.valueOf(value));
                                    ps.setText(String.valueOf(value*0.0076));
                                    sf.setText(String.valueOf(value*0.0093));
                                    ad.setText(String.valueOf(value*0.014));
                                    cd.setText(String.valueOf(value*0.012));
                                    ir.setText(String.valueOf(value*0.66));
                                    skw.setText(String.valueOf(value*11.22));
                                    cy.setText(String.valueOf(value*0.067));
                                    tb.setText(String.valueOf(value*0.28));
                                    irh.setText(String.valueOf(value*132.18));
                                    mr.setText(String.valueOf(value*0.039));
                                    pp.setText(String.valueOf(value*0.48));
                                    vd.setText(String.valueOf(value*215.46));
                                    pr.setText(String.valueOf(value*1.46));
                                    ns.setText(String.valueOf(value*1.06));
                                    mk.setText(String.valueOf(value*14.23));
                                    sr.setText(String.valueOf(value*1.68));
                                    mrf.setText(String.valueOf(value*0.14));
                                    hkd.setText(String.valueOf(value*0.073));
                                    sdr.setText(String.valueOf(value*0.035));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////PS////////////////////////////////////
                    case 4:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*103.52));
                                    usd.setText(String.valueOf(value*1.23));
                                    euro.setText(String.valueOf(value*1.12));
                                    jy.setText(String.valueOf(value*131.96));
                                    ps.setText(String.valueOf(value));
                                    sf.setText(String.valueOf(value*1.23));
                                    ad.setText(String.valueOf(value*1.83));
                                    cd.setText(String.valueOf(value*1.63));
                                    ir.setText(String.valueOf(value*87.50));
                                    skw.setText(String.valueOf(value*1481.25));
                                    cy.setText(String.valueOf(value*8.78));
                                    tb.setText(String.valueOf(value*37.60));
                                    irh.setText(String.valueOf(value*17448.94));
                                    mr.setText(String.valueOf(value*5.15));
                                    pp.setText(String.valueOf(value*63.87));
                                    vd.setText(String.valueOf(value*28430.74));
                                    pr.setText(String.valueOf(value*192.33));
                                    ns.setText(String.valueOf(value*139.43));
                                    mk.setText(String.valueOf(value*1877.96));
                                    sr.setText(String.valueOf(value*223.09));
                                    mrf.setText(String.valueOf(value*18.92));
                                    hkd.setText(String.valueOf(value*9.63));
                                    sdr.setText(String.valueOf(value*4.61));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////SF////////////////////////////////////
                    case 5:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*84.81));
                                    usd.setText(String.valueOf(value*1.01));
                                    euro.setText(String.valueOf(value*0.92));
                                    jy.setText(String.valueOf(value*107.37));
                                    ps.setText(String.valueOf(value*0.82));
                                    sf.setText(String.valueOf(value));
                                    ad.setText(String.valueOf(value*1.49));
                                    cd.setText(String.valueOf(value*1.34));
                                    ir.setText(String.valueOf(value*71.27));
                                    skw.setText(String.valueOf(value*1200.38));
                                    cy.setText(String.valueOf(value*7.14));
                                    tb.setText(String.valueOf(value*30.62));
                                    irh.setText(String.valueOf(value*14219.01));
                                    mr.setText(String.valueOf(value*4.21));
                                    pp.setText(String.valueOf(value*51.96));
                                    vd.setText(String.valueOf(value*23334.67));
                                    pr.setText(String.valueOf(value*156.80));
                                    ns.setText(String.valueOf(value*113.93));
                                    mk.setText(String.valueOf(value*1541.65));
                                    sr.setText(String.valueOf(value*182.52));
                                    mrf.setText(String.valueOf(value*15.53));
                                    hkd.setText(String.valueOf(value*7.89));
                                    sdr.setText(String.valueOf(value*3.77));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////AD////////////////////////////////////
                    case 6:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*57.27));
                                    usd.setText(String.valueOf(value*0.012));
                                    euro.setText(String.valueOf(value*0.011));
                                    jy.setText(String.valueOf(value*1.26));
                                    ps.setText(String.valueOf(value*0.55));
                                    sf.setText(String.valueOf(value*0.0112));
                                    ad.setText(String.valueOf(value));
                                    cd.setText(String.valueOf(value*0.016));
                                    ir.setText(String.valueOf(value*0.84));
                                    skw.setText(String.valueOf(value*14.12));
                                    cy.setText(String.valueOf(value*0.085));
                                    tb.setText(String.valueOf(value*0.36));
                                    irh.setText(String.valueOf(value*167.23));
                                    mr.setText(String.valueOf(value*0.049));
                                    pp.setText(String.valueOf(value*0.61));
                                    vd.setText(String.valueOf(value*274.44));
                                    pr.setText(String.valueOf(value*1.84));
                                    ns.setText(String.valueOf(value*1.34));
                                    mk.setText(String.valueOf(value*18.14));
                                    sr.setText(String.valueOf(value*2.15));
                                    mrf.setText(String.valueOf(value*0.18));
                                    hkd.setText(String.valueOf(value*0.093));
                                    sdr.setText(String.valueOf(value*0.044));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////CD////////////////////////////////////
                    case 7:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*63.57));
                                    usd.setText(String.valueOf(value*0.75));
                                    euro.setText(String.valueOf(value*0.68));
                                    jy.setText(String.valueOf(value*80.34));
                                    ps.setText(String.valueOf(value*0.61));
                                    sf.setText(String.valueOf(value*0.75));
                                    ad.setText(String.valueOf(value*1.11));
                                    cd.setText(String.valueOf(value));
                                    ir.setText(String.valueOf(value*53.20));
                                    skw.setText(String.valueOf(value*895.64));
                                    cy.setText(String.valueOf(value*5.34));
                                    tb.setText(String.valueOf(value*22.86));
                                    irh.setText(String.valueOf(value*10617.32));
                                    mr.setText(String.valueOf(value*3.14));
                                    pp.setText(String.valueOf(value*38.82));
                                    vd.setText(String.valueOf(value*17442.26));
                                    pr.setText(String.valueOf(value*118.02));
                                    ns.setText(String.valueOf(value*85.18));
                                    mk.setText(String.valueOf(value*1152.51));
                                    sr.setText(String.valueOf(value*136.45));
                                    mrf.setText(String.valueOf(value*11.61));
                                    hkd.setText(String.valueOf(value*5.89));
                                    sdr.setText(String.valueOf(value*2.82));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////IR////////////////////////////////////
                    case 8:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*1.19));
                                    usd.setText(String.valueOf(value*0.014));
                                    euro.setText(String.valueOf(value*0.013));
                                    jy.setText(String.valueOf(value*1.51));
                                    ps.setText(String.valueOf(value*0.011));
                                    sf.setText(String.valueOf(value*0.014));
                                    ad.setText(String.valueOf(value*0.021));
                                    cd.setText(String.valueOf(value*0.019));
                                    ir.setText(String.valueOf(value));
                                    skw.setText(String.valueOf(value*16.83));
                                    cy.setText(String.valueOf(value*0.10));
                                    tb.setText(String.valueOf(value*0.43));
                                    irh.setText(String.valueOf(value*199.57));
                                    mr.setText(String.valueOf(value*0.059));
                                    pp.setText(String.valueOf(value*0.73));
                                    vd.setText(String.valueOf(value*327.69));
                                    pr.setText(String.valueOf(value*2.20));
                                    ns.setText(String.valueOf(value*1.60));
                                    mk.setText(String.valueOf(value*21.66));
                                    sr.setText(String.valueOf(value*2.56));
                                    mrf.setText(String.valueOf(value*0.22));
                                    hkd.setText(String.valueOf(value*0.11));
                                    sdr.setText(String.valueOf(value*0.053));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////SKW////////////////////////////////////
                    case 9:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.071));
                                    usd.setText(String.valueOf(value*0.0084));
                                    euro.setText(String.valueOf(value*0.00076));
                                    jy.setText(String.valueOf(value*0.090));
                                    ps.setText(String.valueOf(value*0.00068));
                                    sf.setText(String.valueOf(value*0.00083));
                                    ad.setText(String.valueOf(value*0.0012));
                                    cd.setText(String.valueOf(value*0.0011));
                                    ir.setText(String.valueOf(value*0.059));
                                    skw.setText(String.valueOf(value));
                                    cy.setText(String.valueOf(value*0.0060));
                                    tb.setText(String.valueOf(value*0.026));
                                    irh.setText(String.valueOf(value*11.87));
                                    mr.setText(String.valueOf(value*0.0035));
                                    pp.setText(String.valueOf(value*0.043));
                                    vd.setText(String.valueOf(value*19.47));
                                    pr.setText(String.valueOf(value*0.13));
                                    ns.setText(String.valueOf(value*0.095));
                                    mk.setText(String.valueOf(value*1.29));
                                    sr.setText(String.valueOf(value*0.15));
                                    mrf.setText(String.valueOf(value*0.013));
                                    hkd.setText(String.valueOf(value*0.0066));
                                    sdr.setText(String.valueOf(value*0.0031));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////CY////////////////////////////////////
                    case 10:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*11.84));
                                    usd.setText(String.valueOf(value*0.14));
                                    euro.setText(String.valueOf(value*0.13));
                                    jy.setText(String.valueOf(value*14.96));
                                    ps.setText(String.valueOf(value*0.11));
                                    sf.setText(String.valueOf(value*0.14));
                                    ad.setText(String.valueOf(value*0.21));
                                    cd.setText(String.valueOf(value*0.19));
                                    ir.setText(String.valueOf(value*9.91));
                                    skw.setText(String.valueOf(value*167.65));
                                    cy.setText(String.valueOf(value));
                                    tb.setText(String.valueOf(value*4.28));
                                    irh.setText(String.valueOf(value*1979.45));
                                    mr.setText(String.valueOf(value*0.59));
                                    pp.setText(String.valueOf(value*7.27));
                                    vd.setText(String.valueOf(value*3264.89));
                                    pr.setText(String.valueOf(value*22.09));
                                    ns.setText(String.valueOf(value*15.94));
                                    mk.setText(String.valueOf(value*215.73));
                                    sr.setText(String.valueOf(value*25.54));
                                    mrf.setText(String.valueOf(value*2.17));
                                    hkd.setText(String.valueOf(value*1.10));
                                    sdr.setText(String.valueOf(value*0.53));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////TB////////////////////////////////////
                    case 11:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*2.78));
                                    usd.setText(String.valueOf(value*0.17));
                                    euro.setText(String.valueOf(value*0.030));
                                    jy.setText(String.valueOf(value*3.52));
                                    ps.setText(String.valueOf(value*0.027));
                                    sf.setText(String.valueOf(value*0.033));
                                    ad.setText(String.valueOf(value*0.049));
                                    cd.setText(String.valueOf(value*0.044));
                                    ir.setText(String.valueOf(value*2.33));
                                    skw.setText(String.valueOf(value*39.19));
                                    cy.setText(String.valueOf(value*0.23));
                                    tb.setText(String.valueOf(value));
                                    irh.setText(String.valueOf(value*464.61));
                                    mr.setText(String.valueOf(value*0.14));
                                    pp.setText(String.valueOf(value*1.70));
                                    vd.setText(String.valueOf(value*763.27));
                                    pr.setText(String.valueOf(value*5.16));
                                    ns.setText(String.valueOf(value*3.73));
                                    mk.setText(String.valueOf(value*50.43));
                                    sr.setText(String.valueOf(value*5.97));
                                    mrf.setText(String.valueOf(value*0.51));
                                    hkd.setText(String.valueOf(value*0.26));
                                    sdr.setText(String.valueOf(value*0.12));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////irh////////////////////////////////////
                    case 12:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0060));
                                    usd.setText(String.valueOf(value*0.000071));
                                    euro.setText(String.valueOf(value*0.000064));
                                    jy.setText(String.valueOf(value*0.0076));
                                    ps.setText(String.valueOf(value*0.000057));
                                    sf.setText(String.valueOf(value*0.000070));
                                    ad.setText(String.valueOf(value*0.00010));
                                    cd.setText(String.valueOf(value*0.000094));
                                    ir.setText(String.valueOf(value*0.0050));
                                    skw.setText(String.valueOf(value*0.084));
                                    cy.setText(String.valueOf(value*0.00051));
                                    tb.setText(String.valueOf(value*0.0022));
                                    irh.setText(String.valueOf(value));
                                    mr.setText(String.valueOf(value*0.00030));
                                    pp.setText(String.valueOf(value*0.0037));
                                    vd.setText(String.valueOf(value*1.64));
                                    pr.setText(String.valueOf(value*0.011));
                                    ns.setText(String.valueOf(value*0.0080));
                                    mk.setText(String.valueOf(value*0.11));
                                    sr.setText(String.valueOf(value*0.013));
                                    mrf.setText(String.valueOf(value*0.0011));
                                    hkd.setText(String.valueOf(value*0.00055));
                                    sdr.setText(String.valueOf(value*0.00027));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////mr////////////////////////////////////
                    case 13:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*20.17));
                                    usd.setText(String.valueOf(value*0.24));
                                    euro.setText(String.valueOf(value*0.22));
                                    jy.setText(String.valueOf(value*25.48));
                                    ps.setText(String.valueOf(value*0.19));
                                    sf.setText(String.valueOf(value*0.24));
                                    ad.setText(String.valueOf(value*0.35));
                                    cd.setText(String.valueOf(value*0.32));
                                    ir.setText(String.valueOf(value*16.95));
                                    skw.setText(String.valueOf(value*285.65));
                                    cy.setText(String.valueOf(value*1.70));
                                    tb.setText(String.valueOf(value*7.26));
                                    irh.setText(String.valueOf(value*3377.20));
                                    mr.setText(String.valueOf(value));
                                    pp.setText(String.valueOf(value*12.37));
                                    vd.setText(String.valueOf(value*5534.88));
                                    pr.setText(String.valueOf(value*37.46));
                                    ns.setText(String.valueOf(value*27.03));
                                    mk.setText(String.valueOf(value*365.78));
                                    sr.setText(String.valueOf(value*43.31));
                                    mrf.setText(String.valueOf(value*3.68));
                                    hkd.setText(String.valueOf(value*1.87));
                                    sdr.setText(String.valueOf(value*0.89));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////pp////////////////////////////////////
                    case 14:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*1.63));
                                    usd.setText(String.valueOf(value*0.019));
                                    euro.setText(String.valueOf(value*0.018));
                                    jy.setText(String.valueOf(value*2.06));
                                    ps.setText(String.valueOf(value*0.016));
                                    sf.setText(String.valueOf(value*0.019));
                                    ad.setText(String.valueOf(value*0.029));
                                    cd.setText(String.valueOf(value*0.026));
                                    ir.setText(String.valueOf(value*1.37));
                                    skw.setText(String.valueOf(value*23.09));
                                    cy.setText(String.valueOf(value*0.14));
                                    tb.setText(String.valueOf(value*0.59));
                                    irh.setText(String.valueOf(value*273.27));
                                    mr.setText(String.valueOf(value*0.081));
                                    pp.setText(String.valueOf(value));
                                    vd.setText(String.valueOf(value*447.34));
                                    pr.setText(String.valueOf(value*3.03));
                                    ns.setText(String.valueOf(value*2.19));
                                    mk.setText(String.valueOf(value*29.57));
                                    sr.setText(String.valueOf(value*3.50));
                                    mrf.setText(String.valueOf(value*0.30));
                                    hkd.setText(String.valueOf(value*0.15));
                                    sdr.setText(String.valueOf(value*0.072));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////vd////////////////////////////////////
                    case 15:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.0036));
                                    usd.setText(String.valueOf(value*0.000043));
                                    euro.setText(String.valueOf(value*0.000039));
                                    jy.setText(String.valueOf(value*0.0046));
                                    ps.setText(String.valueOf(value*0.000035));
                                    sf.setText(String.valueOf(value*0.000043));
                                    ad.setText(String.valueOf(value*0.000064));
                                    cd.setText(String.valueOf(value*0.000057));
                                    ir.setText(String.valueOf(value*0.0031));
                                    skw.setText(String.valueOf(value*0.052));
                                    cy.setText(String.valueOf(value*0.00031));
                                    tb.setText(String.valueOf(value*0.0013));
                                    irh.setText(String.valueOf(value*0.61));
                                    mr.setText(String.valueOf(value*0.00018));
                                    pp.setText(String.valueOf(value*0.0022));
                                    vd.setText(String.valueOf(value));
                                    pr.setText(String.valueOf(value*0.0068));
                                    ns.setText(String.valueOf(value*0.0049));
                                    mk.setText(String.valueOf(value*066));
                                    sr.setText(String.valueOf(value*0.0078));
                                    mrf.setText(String.valueOf(value*0.00067));
                                    hkd.setText(String.valueOf(value*0.00034));
                                    sdr.setText(String.valueOf(value*0.00016));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////pr////////////////////////////////////
                    case 16:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.54));
                                    usd.setText(String.valueOf(value*0.0064));
                                    euro.setText(String.valueOf(value*0.0058));
                                    jy.setText(String.valueOf(value*0.68));
                                    ps.setText(String.valueOf(value*0.0052));
                                    sf.setText(String.valueOf(value*0.0063));
                                    ad.setText(String.valueOf(value*0.0095));
                                    cd.setText(String.valueOf(value*0.0085));
                                    ir.setText(String.valueOf(value*0.45));
                                    skw.setText(String.valueOf(value*7.63));
                                    cy.setText(String.valueOf(value*0.046));
                                    tb.setText(String.valueOf(value*0.19));
                                    irh.setText(String.valueOf(value*90.31));
                                    mr.setText(String.valueOf(value*0.027));
                                    pp.setText(String.valueOf(value*0.33));
                                    vd.setText(String.valueOf(value*147.93));
                                    pr.setText(String.valueOf(value));
                                    ns.setText(String.valueOf(value*0.72));
                                    mk.setText(String.valueOf(value*9.76));
                                    sr.setText(String.valueOf(value*1.16));
                                    mrf.setText(String.valueOf(value*0.098));
                                    hkd.setText(String.valueOf(value*0.050));
                                    sdr.setText(String.valueOf(value*0.024));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////ns////////////////////////////////////
                    case 17:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.75));
                                    usd.setText(String.valueOf(value*0.0088));
                                    euro.setText(String.valueOf(value*0.0080));
                                    jy.setText(String.valueOf(value*0.94));
                                    ps.setText(String.valueOf(value*0.0071));
                                    sf.setText(String.valueOf(value*0.0088));
                                    ad.setText(String.valueOf(value*0.013));
                                    cd.setText(String.valueOf(value*0.012));
                                    ir.setText(String.valueOf(value*0.63));
                                    skw.setText(String.valueOf(value*10.55));
                                    cy.setText(String.valueOf(value*0.063));
                                    tb.setText(String.valueOf(value*0.27));
                                    irh.setText(String.valueOf(value*124.83));
                                    mr.setText(String.valueOf(value*0.037));
                                    pp.setText(String.valueOf(value*0.46));
                                    vd.setText(String.valueOf(value*204.33));
                                    pr.setText(String.valueOf(value*1.38));
                                    ns.setText(String.valueOf(value));
                                    mk.setText(String.valueOf(value*13.49));
                                    sr.setText(String.valueOf(value*1.59));
                                    mrf.setText(String.valueOf(value*0.14));
                                    hkd.setText(String.valueOf(value*0.069));
                                    sdr.setText(String.valueOf(value*0.033));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////mk////////////////////////////////////
                    case 18:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.055));
                                    usd.setText(String.valueOf(value*0.00065));
                                    euro.setText(String.valueOf(value*0.00059));
                                    jy.setText(String.valueOf(value*0.070));
                                    ps.setText(String.valueOf(value*0.00053));
                                    sf.setText(String.valueOf(value*0.00065));
                                    ad.setText(String.valueOf(value*0.00097));
                                    cd.setText(String.valueOf(value*0.00087));
                                    ir.setText(String.valueOf(value*0.046));
                                    skw.setText(String.valueOf(value*0.78));
                                    cy.setText(String.valueOf(value*0.0047));
                                    tb.setText(String.valueOf(value*0.020));
                                    irh.setText(String.valueOf(value*9.25));
                                    mr.setText(String.valueOf(value*0.0027));
                                    pp.setText(String.valueOf(value*0.034));
                                    vd.setText(String.valueOf(value*15.14));
                                    pr.setText(String.valueOf(value*0.10));
                                    ns.setText(String.valueOf(value*0.074));
                                    mk.setText(String.valueOf(value));
                                    sr.setText(String.valueOf(value*0.12));
                                    mrf.setText(String.valueOf(value*0.010));
                                    hkd.setText(String.valueOf(value*0.0051));
                                    sdr.setText(String.valueOf(value*0.0024));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////sr////////////////////////////////////
                    case 19:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*0.47));
                                    usd.setText(String.valueOf(value*0.0055));
                                    euro.setText(String.valueOf(value*0.0050));
                                    jy.setText(String.valueOf(value*0.59));
                                    ps.setText(String.valueOf(value*0.0045));
                                    sf.setText(String.valueOf(value*0.0055));
                                    ad.setText(String.valueOf(value*0.0082));
                                    cd.setText(String.valueOf(value*0.0074));
                                    ir.setText(String.valueOf(value*0.39));
                                    skw.setText(String.valueOf(value*6.63));
                                    cy.setText(String.valueOf(value*0.040));
                                    tb.setText(String.valueOf(value*0.17));
                                    irh.setText(String.valueOf(value*78.43));
                                    mr.setText(String.valueOf(value*0.023));
                                    pp.setText(String.valueOf(value*0.29));
                                    vd.setText(String.valueOf(value*128.32));
                                    pr.setText(String.valueOf(value*0.87));
                                    ns.setText(String.valueOf(value*0.63));
                                    mk.setText(String.valueOf(value*8.47));
                                    sr.setText(String.valueOf(value));
                                    mrf.setText(String.valueOf(value*0.085));
                                    hkd.setText(String.valueOf(value*0.043));
                                    sdr.setText(String.valueOf(value*0.021));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////mrf////////////////////////////////////
                    case 20:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*5.48));
                                    usd.setText(String.valueOf(value*0.065));
                                    euro.setText(String.valueOf(value*0.059));
                                    jy.setText(String.valueOf(value*6.92));
                                    ps.setText(String.valueOf(value*0.053));
                                    sf.setText(String.valueOf(value*0.064));
                                    ad.setText(String.valueOf(value*0.096));
                                    cd.setText(String.valueOf(value*0.086));
                                    ir.setText(String.valueOf(value*4.60));
                                    skw.setText(String.valueOf(value*77.54));
                                    cy.setText(String.valueOf(value*0.46));
                                    tb.setText(String.valueOf(value*1.97));
                                    irh.setText(String.valueOf(value*917.56));
                                    mr.setText(String.valueOf(value*0.27));
                                    pp.setText(String.valueOf(value*3.36));
                                    vd.setText(String.valueOf(value*1501.78));
                                    pr.setText(String.valueOf(value*10.16));
                                    ns.setText(String.valueOf(value*7.35));
                                    mk.setText(String.valueOf(value*99.17));
                                    sr.setText(String.valueOf(value*11.70));
                                    mrf.setText(String.valueOf(value));
                                    hkd.setText(String.valueOf(value*0.51));
                                    sdr.setText(String.valueOf(value*0.24));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////hkd////////////////////////////////////
                    case 21:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*10.79));
                                    usd.setText(String.valueOf(value*0.13));
                                    euro.setText(String.valueOf(value*0.12));
                                    jy.setText(String.valueOf(value*13.62));
                                    ps.setText(String.valueOf(value*0.10));
                                    sf.setText(String.valueOf(value*0.13));
                                    ad.setText(String.valueOf(value*0.19));
                                    cd.setText(String.valueOf(value*0.17));
                                    ir.setText(String.valueOf(value*9.05));
                                    skw.setText(String.valueOf(value*152.66));
                                    cy.setText(String.valueOf(value*0.91));
                                    tb.setText(String.valueOf(value*3.88));
                                    irh.setText(String.valueOf(value*1805.20));
                                    mr.setText(String.valueOf(value*0.53));
                                    pp.setText(String.valueOf(value*6.61));
                                    vd.setText(String.valueOf(value*2956.23));
                                    pr.setText(String.valueOf(value*20));
                                    ns.setText(String.valueOf(value*14.47));
                                    mk.setText(String.valueOf(value*195.21));
                                    sr.setText(String.valueOf(value*23.04));
                                    mrf.setText(String.valueOf(value*1.97));
                                    hkd.setText(String.valueOf(value));
                                    sdr.setText(String.valueOf(value*0.48));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

                                }
                            }
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                            @Override
                            public void afterTextChanged(Editable s) {}
                        });
                        break;  //////////////////////////sdr////////////////////////////////////
                    case 22:
                        inputtext.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if(!inputtext.getText().toString().isEmpty())
                                { value=Double.parseDouble(inputtext.getText().toString());
                                    bdt.setText(String.valueOf(value*22.56));
                                    usd.setText(String.valueOf(value*0.27));
                                    euro.setText(String.valueOf(value*0.24));
                                    jy.setText(String.valueOf(value*28.49));
                                    ps.setText(String.valueOf(value*0.22));
                                    sf.setText(String.valueOf(value*0.27));
                                    ad.setText(String.valueOf(value*0.40));
                                    cd.setText(String.valueOf(value*0.35));
                                    ir.setText(String.valueOf(value*18.93));
                                    skw.setText(String.valueOf(value*319.25));
                                    cy.setText(String.valueOf(value*1.91));
                                    tb.setText(String.valueOf(value*8.12));
                                    irh.setText(String.valueOf(value*3777.26));
                                    mr.setText(String.valueOf(value*1.12));
                                    pp.setText(String.valueOf(value*13.83));
                                    vd.setText(String.valueOf(value*6182.87));
                                    pr.setText(String.valueOf(value*41.83));
                                    ns.setText(String.valueOf(value*30.26));
                                    mk.setText(String.valueOf(value*408.23));
                                    sr.setText(String.valueOf(value*48.18));
                                    mrf.setText(String.valueOf(value*4.12));
                                    hkd.setText(String.valueOf(value*2.09));
                                    sdr.setText(String.valueOf(value));
                                }
                                else
                                { bdt.setText(String.valueOf(0));
                                    usd.setText(String.valueOf(0));
                                    euro.setText(String.valueOf(0));
                                    jy.setText(String.valueOf(0));
                                    ps.setText(String.valueOf(0));
                                    sf.setText(String.valueOf(0));
                                    ad.setText(String.valueOf(0));
                                    cd.setText(String.valueOf(0));
                                    ir.setText(String.valueOf(0));
                                    skw.setText(String.valueOf(0));
                                    cy.setText(String.valueOf(0));
                                    hkd.setText(String.valueOf(0));
                                    sdr.setText(String.valueOf(0));
                                    tb.setText(String.valueOf(0));
                                    irh.setText(String.valueOf(0));
                                    mr.setText(String.valueOf(0));
                                    pp.setText(String.valueOf(0));
                                    vd.setText(String.valueOf(0));
                                    pr.setText(String.valueOf(0));
                                    ns.setText(String.valueOf(0));
                                    mk.setText(String.valueOf(0));
                                    sr.setText(String.valueOf(0));
                                    mrf.setText(String.valueOf(0));

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
