package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class translator extends AppCompatActivity implements View.OnClickListener{

    EditText input_text;
    TextView output_text;
    Button translate_button;
    static String api_key="trnsl.1.1.20190821T132323Z.207843a73c4f4a29.0ec1dbd857542cd7030a1e9a4c5d98b664d4641c";
    static String lang;
    String str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        Spinner language_in=(Spinner) findViewById(R.id.lanuage_select2);

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.languages,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        language_in.setAdapter(adapter2);

        language_in.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:str1="af";
                            break;
                    case 1:str1="sq";
                        break;
                    case 2:str1="am";
                        break;
                    case 3: str1="ar";
                            break;
                    case 4:str1="hy";
                        break;
                    case 5:str1="az";
                        break;
                    case 6:str1="bn";
                        break;
                    case 7:str1="eu";
                        break;
                    case 8:str1="ba";
                        break;
                    case 9:str1="be";
                        break;
                    case 10:str1="bs";
                        break;
                    case 11:str1="bg";
                        break;
                    case 12:str1="my";
                        break;
                    case 13:str1="ca";
                        break;
                    case 14:str1="ceb";
                        break;
                    case 15:str1="zh";
                    break;
                    case 16:str1="hr";
                        break;
                    case 17:str1="cs";
                        break;
                    case 18:str1="da";
                        break;
                    case 19:str1="nl";
                        break;
                    case 20:str1="en";
                        break;
                    case 21:str1="eo";
                        break;
                    case 22:str1="et";
                        break;
                    case 23:str1="fi";
                        break;
                    case 24:str1="fr";
                        break;
                    case 25:str1="gl";
                        break;
                    case 26:str1="ka";
                        break;
                    case 27:str1="de";
                        break;
                    case 28:str1="el";
                        break;
                    case 29:str1="gu";
                        break;
                    case 30:str1="ht";
                        break;
                    case 31:str1="mrj";
                        break;
                    case 32:str1="he";
                        break;
                    case 33:str1="hi";
                        break;
                    case 34:str1="hu";
                        break;
                    case 35:str1="is";
                        break;
                    case 36:str1="id";
                        break;
                    case 37:str1="ga";
                        break;
                    case 38:str1="it";
                        break;
                    case 39:str1="ja";
                        break;
                    case 40:str1="jv";
                        break;
                    case 41:str1="kn";
                        break;
                    case 42:str1="kk";
                        break;
                    case 43:str1="km";
                        break;
                    case 44:str1="ko";
                        break;
                    case 45:str1="ky";
                        break;
                    case 46:str1="lo";
                        break;
                    case 47:str1="la";
                        break;
                    case 48:str1="lv";
                        break;
                    case 49:str1="lt";
                        break;
                    case 50:str1="lb";
                        break;
                    case 51:str1="mk";
                        break;
                    case 52:str1="mg";
                        break;
                    case 53:str1="ms";
                        break;
                    case 54:str1="ml";
                        break;
                    case 55:str1="mt";
                        break;
                    case 56:str1="mi";
                        break;
                    case 57:str1="mr";
                        break;
                    case 58:str1="mn";
                        break;
                    case 59:str1="mhr";
                        break;
                    case 60:str1="ne";
                        break;
                    case 61:str1="no";
                        break;
                    case 62:str1="fa";
                        break;
                    case 63:str1="pl";
                        break;
                    case 64:str1="pt";
                        break;
                    case 65:str1="pap";
                        break;
                    case 66:str1="pa";
                        break;
                    case 67:str1="ro";
                        break;
                    case 68:str1="ru";
                        break;
                    case 69:str1="si";
                        break;
                    case 70:str1="sk";
                        break;
                    case 71:str1="sl";
                        break;
                    case 72:str1="es";
                        break;
                    case 73:str1="gd";
                        break;
                    case 74:str1="sr";
                        break;
                    case 75:str1="su";
                        break;
                    case 76:str1="sw";
                        break;
                    case 77:str1="sv";
                        break;
                    case 78:str1="tg";
                        break;
                    case 79:str1="ta";
                        break;
                    case 80:str1="te";
                        break;
                    case 81:str1="th";
                        break;
                    case 82:str1="tl";
                        break;
                    case 83:str1="tr";
                        break;
                    case 84:str1="tt";
                        break;
                    case 85:str1="uk";
                        break;
                    case 86:str1="ur";
                        break;
                    case 87:str1="uz";
                        break;
                    case 88:str1="udm";
                        break;
                    case 89:str1="vi";
                        break;
                    case 90:str1="cy";
                        break;
                    case 91:str1="xh";
                        break;
                    case 92:str1="yi";
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });


        Spinner language_out=(Spinner) findViewById(R.id.lanuage_select);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.languages,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        language_out.setAdapter(adapter);

        language_out.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:str2="af";
                        break;
                    case 1:str2="sq";
                        break;
                    case 2:str2="am";
                        break;
                    case 3: str2="ar";
                        break;
                    case 4:str2="hy";
                        break;
                    case 5:str2="az";
                        break;
                    case 6:str2="bn";
                        break;
                    case 7:str2="eu";
                        break;
                    case 8:str2="ba";
                        break;
                    case 9:str2="be";
                        break;
                    case 10:str2="bs";
                        break;
                    case 11:str2="bg";
                        break;
                    case 12:str2="my";
                        break;
                    case 13:str2="ca";
                        break;
                    case 14:str2="ceb";
                        break;
                    case 15:str2="zh";
                        break;
                    case 16:str2="hr";
                        break;
                    case 17:str2="cs";
                        break;
                    case 18:str2="da";
                        break;
                    case 19:str2="nl";
                        break;
                    case 20:str2="en";
                        break;
                    case 21:str2="eo";
                        break;
                    case 22:str2="et";
                        break;
                    case 23:str2="fi";
                        break;
                    case 24:str2="fr";
                        break;
                    case 25:str2="gl";
                        break;
                    case 26:str2="ka";
                        break;
                    case 27:str2="de";
                        break;
                    case 28:str2="el";
                        break;
                    case 29:str2="gu";
                        break;
                    case 30:str2="ht";
                        break;
                    case 31:str2="mrj";
                        break;
                    case 32:str2="he";
                        break;
                    case 33:str2="hi";
                        break;
                    case 34:str2="hu";
                        break;
                    case 35:str2="is";
                        break;
                    case 36:str2="id";
                        break;
                    case 37:str2="ga";
                        break;
                    case 38:str2="it";
                        break;
                    case 39:str2="ja";
                        break;
                    case 40:str2="jv";
                        break;
                    case 41:str2="kn";
                        break;
                    case 42:str2="kk";
                        break;
                    case 43:str2="km";
                        break;
                    case 44:str2="ko";
                        break;
                    case 45:str2="ky";
                        break;
                    case 46:str2="lo";
                        break;
                    case 47:str2="la";
                        break;
                    case 48:str2="lv";
                        break;
                    case 49:str2="lt";
                        break;
                    case 50:str2="lb";
                        break;
                    case 51:str2="mk";
                        break;
                    case 52:str2="mg";
                        break;
                    case 53:str2="ms";
                        break;
                    case 54:str2="ml";
                        break;
                    case 55:str2="mt";
                        break;
                    case 56:str2="mi";
                        break;
                    case 57:str2="mr";
                        break;
                    case 58:str2="mn";
                        break;
                    case 59:str2="mhr";
                        break;
                    case 60:str2="ne";
                        break;
                    case 61:str2="no";
                        break;
                    case 62:str2="fa";
                        break;
                    case 63:str2="pl";
                        break;
                    case 64:str2="pt";
                        break;
                    case 65:str2="pap";
                        break;
                    case 66:str2="pa";
                        break;
                    case 67:str2="ro";
                        break;
                    case 68:str2="ru";
                        break;
                    case 69:str2="si";
                        break;
                    case 70:str2="sk";
                        break;
                    case 71:str2="sl";
                        break;
                    case 72:str2="es";
                        break;
                    case 73:str2="gd";
                        break;
                    case 74:str2="sr";
                        break;
                    case 75:str2="su";
                        break;
                    case 76:str2="sw";
                        break;
                    case 77:str2="sv";
                        break;
                    case 78:str2="tg";
                        break;
                    case 79:str2="ta";
                        break;
                    case 80:str2="te";
                        break;
                    case 81:str2="th";
                        break;
                    case 82:str2="tl";
                        break;
                    case 83:str2="tr";
                        break;
                    case 84:str2="tt";
                        break;
                    case 85:str2="uk";
                        break;
                    case 86:str2="ur";
                        break;
                    case 87:str2="uz";
                        break;
                    case 88:str2="udm";
                        break;
                    case 89:str2="vi";
                        break;
                    case 90:str2="cy";
                        break;
                    case 91:str2="xh";
                        break;
                    case 92:str2="yi";
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        input_text=findViewById(R.id.input_text);
        output_text=findViewById(R.id.output_text);
        translate_button=findViewById(R.id.traslate_bt);

        translate_button.setOnClickListener(this);


    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    @Override
    public void onClick(View view) {
        output_text.setText(null);
        final Editable text=input_text.getText();
        lang=str1+"-"+str2;
        final AlertDialog.Builder loadingbuilder=new AlertDialog.Builder(translator.this);
        final View loadingView=getLayoutInflater().inflate(R.layout.loading,null);
        loadingbuilder.setView(loadingView);
        final AlertDialog dialog=loadingbuilder.create();

        if(!input_text.getText().toString().isEmpty()) {
            Thread sendHttpRequestThread = new Thread() {

                @Override
                public void run() {
                    String urlParameters = "key=" + api_key + "&text=" + text + "&lang=" + lang;
                    byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
                    int postDataLength = postData.length;
                    URL url = null;
                    try {
                        url = new URL("https://translate.yandex.net/api/v1.5/tr.json/translate?");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                        Toast.makeText(translator.this, "Error Occured.Try Again", Toast.LENGTH_SHORT).show();


                    }
                    HttpURLConnection conn = null;
                    try {
                        conn = (HttpURLConnection) url.openConnection();
                    } catch (IOException e) {
                        e.printStackTrace();
                        Toast.makeText(translator.this, "Error Occured.Try Again", Toast.LENGTH_SHORT).show();
                    }
                    conn.setDoOutput(true);
                    conn.setInstanceFollowRedirects(false);
                    try {
                        conn.setRequestMethod("POST");
                    } catch (ProtocolException e) {
                        e.printStackTrace();
                        Toast.makeText(translator.this, "Error Occured.Try Again", Toast.LENGTH_SHORT).show();
                    }
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    conn.setRequestProperty("charset", "utf-8");
                    conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
                    conn.setUseCaches(false);
                    try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                        wr.write(postData);
                    } catch (IOException e) {
                        e.printStackTrace();
                        Toast.makeText(translator.this, "Error Occured.Try Again", Toast.LENGTH_SHORT).show();
                    }


                    String s = "";
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        e.printStackTrace();
                        Toast.makeText(translator.this, "Error Occured.Try Again", Toast.LENGTH_SHORT).show();
                    }

                    while (true) {
                        int c = 0;
                        try {
                            c = br.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (c == -1) {
                            break;
                        }

                        s += (char) c;

                    }
                    Gson gson = new Gson();
                    JsonObject json = gson.fromJson(s, JsonObject.class);



                    String output = json.get("text").toString();
                    output = output.substring(2, output.length() - 2);
                    output_text.setText(output);
                    dialog.dismiss();
                }
            };

            sendHttpRequestThread.start();

            if (output_text.getText().toString().isEmpty()) {

                dialog.show();
            }

        }
        else
        {
            Toast.makeText(translator.this,"Please Input Something",Toast.LENGTH_SHORT).show();

        }
    }
}
