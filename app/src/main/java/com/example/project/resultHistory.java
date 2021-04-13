package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class resultHistory extends AppCompatActivity {
TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15;
String str="";
  DatabaseHelper database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_history);
        textView1=findViewById(R.id.textview1);
        textView2=findViewById(R.id.textview2);
        textView3=findViewById(R.id.textview3);
        textView4=findViewById(R.id.textview4);
        textView5=findViewById(R.id.textview5);
        textView6=findViewById(R.id.textview6);
        textView7=findViewById(R.id.textview7);
        textView8=findViewById(R.id.textview8);
        textView9=findViewById(R.id.textview9);
        textView10=findViewById(R.id.textview10);
        textView11=findViewById(R.id.textview11);
        textView12=findViewById(R.id.textview12);
        textView13=findViewById(R.id.textview13);
        textView14=findViewById(R.id.textview14);
        textView15=findViewById(R.id.textview15);
        database=new DatabaseHelper(this);
        Cursor cursor= database.displayAllData();
        if(cursor.getCount()==0)
            Toast.makeText(this,"Empty",Toast.LENGTH_LONG).show();
        else
        {   int i=1;
            while(i<=cursor.getCount()) {

                ////////////////////////////////////////////
                if(i==1)
                {   cursor.moveToLast();
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView1.setText(str);
                }
                ///////////////////////////////////////////
                if(i==2) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView2.setText(str);
                }
                ///////////////////////////////////////////
                if(i==3) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView3.setText(str);
                }
                ///////////////////////////////////////////
                if(i==4) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView4.setText(str);
                }
                ///////////////////////////////////////////
                if(i==5) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView5.setText(str);
                }
                ///////////////////////////////////////////
                if(i==6) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView6.setText(str);
                }
                ///////////////////////////////////////////
                if(i==7) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView7.setText(str);
                }
                ///////////////////////////////////////////
                if(i==8) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView8.setText(str);
                }
                ///////////////////////////////////////////
                if(i==9) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView9.setText(str);
                }
                ///////////////////////////////////////////
                if(i==10) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView10.setText(str);
                }
                ///////////////////////////////////////////
                if(i==11) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView11.setText(str);
                }
                ///////////////////////////////////////////
                if(i==12) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView12.setText(str);
                }
                ///////////////////////////////////////////
                if(i==13) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView13.setText(str);
                }
                ///////////////////////////////////////////
                if(i==14) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView14.setText(str);
                }
                ///////////////////////////////////////////
                if(i==15) {
                    cursor.moveToPrevious();
                    str = "";
                    str += cursor.getString(1);
                    str += "=";
                    str += cursor.getString(2);
                    textView15.setText(str);
                }
                i++;
                if(i>15)
                    break;
            }


        }






    }
}
