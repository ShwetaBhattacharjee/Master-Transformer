package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.renderscript.Script;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class standard extends  AppCompatActivity implements View.OnClickListener{

   DatabaseHelper databaseHelper;


   ////////////////////////////////////////////////////////////////////////
    long isInserted;
    TextView inputview,resultview;
    String str="";
    double result;
    Button historybt,one,two,three,four,five,six,seven,eight,nine,zero,plus_minus,dot,equal,divide,multiply,add,sub,clear,delete,firstBrack,secondeBrack,percent;
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }



            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        databaseHelper=new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase=databaseHelper.getWritableDatabase();

//////////////////////////////////////////////////////////////////
        inputview=findViewById(R.id.inputview);
        resultview=findViewById(R.id.resultview);
       one=findViewById(R.id.one);
       two=findViewById(R.id.two);
       three=findViewById(R.id.three);
       four=findViewById(R.id.four);
       five=findViewById(R.id.five);
       six=findViewById(R.id.six);
       seven=findViewById(R.id.seven);
       eight=findViewById(R.id.eight);
       nine=findViewById(R.id.nine);
       zero=findViewById(R.id.zero);
       plus_minus=findViewById(R.id.plus_minus);
       dot=findViewById(R.id.dot);
       equal=findViewById(R.id.equal);
       divide=findViewById(R.id.divide);
       multiply=findViewById(R.id.multiply);
       add=findViewById(R.id.add);
       sub=findViewById(R.id.sub);
       clear=findViewById(R.id.clear);
       delete=findViewById(R.id.delete);
       firstBrack=findViewById(R.id.first_bracket);
       secondeBrack=findViewById(R.id.second_bracket);
       percent=findViewById(R.id.percent);
       historybt=findViewById(R.id.historybt);

       one.setOnClickListener((View.OnClickListener) this);
       two.setOnClickListener((View.OnClickListener) this);
       three.setOnClickListener((View.OnClickListener) this);
       four.setOnClickListener((View.OnClickListener) this);
       five.setOnClickListener((View.OnClickListener) this);
       six.setOnClickListener((View.OnClickListener) this);
       seven.setOnClickListener((View.OnClickListener) this);
       eight.setOnClickListener((View.OnClickListener) this);
       nine.setOnClickListener((View.OnClickListener) this);
       zero.setOnClickListener((View.OnClickListener) this);
       plus_minus.setOnClickListener((View.OnClickListener) this);
       dot.setOnClickListener((View.OnClickListener) this);
       add.setOnClickListener((View.OnClickListener) this);
       sub.setOnClickListener((View.OnClickListener) this);
       multiply.setOnClickListener((View.OnClickListener) this);
       divide.setOnClickListener((View.OnClickListener) this);
       percent.setOnClickListener((View.OnClickListener) this);
       clear.setOnClickListener((View.OnClickListener) this);
       delete.setOnClickListener((View.OnClickListener) this);
       firstBrack.setOnClickListener((View.OnClickListener) this);
       secondeBrack.setOnClickListener((View.OnClickListener) this);
       equal.setOnClickListener((View.OnClickListener) this);
       historybt.setOnClickListener((View.OnClickListener) this);



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                str+="1";
                inputview.setText(str);
                break;
            case R.id.two:
                str+="2";
                inputview.setText(str);
                break;
            case R.id.three:
                str+="3";
                inputview.setText(str);
                break;
            case R.id.four:
                str+="4";
                inputview.setText(str);
                break;
            case R.id.five:
                str+="5";
                inputview.setText(str);
                break;
            case R.id.six:
                str+="6";
                inputview.setText(str);
                break;
            case R.id.seven:
                str+="7";
                inputview.setText(str);
                break;
            case R.id.eight:
                str+="8";
                inputview.setText(str);
                break;
            case R.id.nine:
                str+="9";
                inputview.setText(str);
                break;
            case R.id.zero:
                str+="0";
                inputview.setText(str);
                break;
            case R.id.add:
                str+="+";
                inputview.setText(str);
                break;
            case R.id.sub:
                str+="-";
                inputview.setText(str);
                break;
            case R.id.multiply:
                str+="*";
                inputview.setText(str);
                break;
            case R.id.divide:
                str+="/";
                inputview.setText(str);
                break;
            case R.id.equal:
                if(str!="") {
                    try {
                        standard ob = new standard();
                        result = ob.eval(str);
                        DecimalFormat dec = new DecimalFormat("#0.00");
                        String res=String.valueOf(dec.format(result));
                        if(res.length()<=16) {
                            resultview.setText(res);
                            isInserted=databaseHelper.insertData(str,res);

                        }
                        else
                            Toast.makeText(standard.this,"Result exceeds range",Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(standard.this,"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.clear:
                str="";
                inputview.setText(str);
                resultview.setText("");
                break;
            case R.id.delete:
                str = str.substring(0, str.length()-1);
                inputview.setText(str);
                break;
            case R.id.first_bracket:
                str+="(";
                inputview.setText(str);
                break;
            case R.id.second_bracket:
                str+=")";
                inputview.setText(str);
                break;
            case R.id.percent:
                str+="/100";
                inputview.setText(str);
                break;
            case R.id.dot:
                str+=".";
                inputview.setText(str);
                break;
            case R.id.plus_minus:
                str+="(-";
                inputview.setText(str);
                break;
            case R.id.historybt:
            {    Intent intent = new Intent(this, resultHistory.class);
                startActivity(intent);
                break;


            }

        }

    }

    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_down);
    }


}
