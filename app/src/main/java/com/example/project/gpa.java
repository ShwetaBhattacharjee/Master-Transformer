package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class gpa extends AppCompatActivity implements View.OnClickListener{
    double grade_value1,grade_value2,grade_value3,grade_value4,grade_value5,grade_value6,grade_value7,grade_value8,grade_value9,grade_value10;
    double credit_value1,credit_value2,credit_value3,credit_value4,credit_value5,credit_value6,credit_value7,credit_value8,credit_value9,credit_value10;
    double cgpa,sumCredit,sumCreditxGrade;
    EditText credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9,credit10;
    Button reset_button,calculate_button;
    boolean flag=false;
    Spinner grade,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10;

    public void calculate(){
        sumCredit=0;
        sumCreditxGrade=0;
        if(grade_value1!=-1 && !credit1.getText().toString().isEmpty())
        {   flag=true;

            credit_value1=Double.parseDouble(credit1.getText().toString());
            sumCreditxGrade+=grade_value1*credit_value1;
            sumCredit+=credit_value1;
        }
        else if(grade_value1==-1 && !credit1.getText().toString().isEmpty())
        {   flag=true;

            Toast.makeText(gpa.this,"Please select Grade of Subject 1",Toast.LENGTH_SHORT).show();

            return;
        }
        else if(grade_value1!=-1 && credit1.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(gpa.this,"Please Input Credit Hour of Subject 1",Toast.LENGTH_LONG).show();

            return;
        }
        ;
        ///////////////////////////////////////////////////////////////////////////////////////////


        if(grade_value2!=-1 && !credit2.getText().toString().isEmpty())
        {   flag=true;

            credit_value2=Double.parseDouble(credit2.getText().toString());
            sumCreditxGrade+=grade_value2*credit_value2;
            sumCredit+=credit_value2;
        }
        else if(grade_value2==-1 && !credit2.getText().toString().isEmpty())
        {
            flag=true;
            Toast.makeText(gpa.this,"Please select Grade of Subject 2",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value2!=-1 && credit2.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(gpa.this,"Please Input Credit Hour of Subject 2",Toast.LENGTH_SHORT).show();
            return;
        }

        ///////////////////////////////////////////////////////////////////////////////////////////
        if(grade_value3!=-1 && !credit3.getText().toString().isEmpty())
        {flag=true;

            credit_value3=Double.parseDouble(credit3.getText().toString());
            sumCreditxGrade+=grade_value3*credit_value3;
            sumCredit+=credit_value3;
        }
        else if(grade_value3==-1 && !credit3.getText().toString().isEmpty())
        {flag=true;
            Toast.makeText(this,"Please select Grade of Subject 3",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value3!=-1 && credit3.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 3",Toast.LENGTH_SHORT).show();
            return;
        }


        ///////////////////////////////////////////////////////////////////////////////////////////
        if(grade_value4!=-1 && !credit4.getText().toString().isEmpty())
        {   flag=true;

            credit_value4=Double.parseDouble(credit4.getText().toString());
            sumCreditxGrade+=grade_value4*credit_value4;
            sumCredit+=credit_value4;
        }
        else if(grade_value4==-1 && !credit4.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Grade of Subject 4",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value4!=-1 && credit4.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 4",Toast.LENGTH_SHORT).show();
            return;
        }

        //////////////////////////////////////////////////////////////////////////////////////////
        if(grade_value5!=-1 && !credit5.getText().toString().isEmpty())
        {   flag=true;

            credit_value5=Double.parseDouble(credit5.getText().toString());
            sumCreditxGrade+=grade_value5*credit_value5;
            sumCredit+=credit_value5;
        }
        else if(grade_value5==-1 && !credit5.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please select Grade of Subject 5",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value5!=-1 && credit5.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 5",Toast.LENGTH_SHORT).show();
            return;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        if(grade_value6!=-1 && !credit6.getText().toString().isEmpty())
        {   flag=true;

            credit_value6=Double.parseDouble(credit6.getText().toString());
            sumCreditxGrade+=grade_value6*credit_value6;
            sumCredit+=credit_value6;
        }
        else if(grade_value6==-1 && !credit6.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please select Grade of Subject 6",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value6!=-1 && credit6.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 6",Toast.LENGTH_SHORT).show();
            return;
        }

        ///////////////////////////////////////////////////////////////////////////////////////////

        if(grade_value7!=-1 && !credit7.getText().toString().isEmpty())
        {   flag=true;

            credit_value7=Double.parseDouble(credit7.getText().toString());
            sumCreditxGrade+=grade_value7*credit_value7;
            sumCredit+=credit_value7;
        }
        else if(grade_value7==-1 && !credit7.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please select Grade of Subject 7",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value7!=-1 && credit7.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 7",Toast.LENGTH_SHORT).show();
            return;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        if(grade_value8!=-1 && !credit8.getText().toString().isEmpty())
        {flag=true;

            credit_value8=Double.parseDouble(credit8.getText().toString());
            sumCreditxGrade+=grade_value8*credit_value8;
            sumCredit+=credit_value8;
        }
        else if(grade_value8==-1 && !credit8.getText().toString().isEmpty())
        {flag=true;
            Toast.makeText(this,"Please select Grade of Subject 8",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value8!=-1 && credit8.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 8",Toast.LENGTH_SHORT).show();
            return;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////

        if(grade_value9!=-1 && !credit9.getText().toString().isEmpty())
        {flag=true;

            credit_value9=Double.parseDouble(credit9.getText().toString());
            sumCreditxGrade+=grade_value9*credit_value9;
            sumCredit+=credit_value9;
        }
        else if(grade_value9==-1 && !credit9.getText().toString().isEmpty())
        {flag=true;
            Toast.makeText(this,"Please select Grade of Subject 9",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value9!=-1 && credit9.getText().toString().isEmpty())
        {   flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 9",Toast.LENGTH_SHORT).show();
            return;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////

        if(grade_value10!=-1 && !credit10.getText().toString().isEmpty())
        {flag=true;

            credit_value10=Double.parseDouble(credit10.getText().toString());
            sumCreditxGrade+=grade_value10*credit_value10;
            sumCredit+=credit_value10;
        }
        else if(grade_value10==-1 && !credit10.getText().toString().isEmpty())
        {flag=true;
            Toast.makeText(this,"Please select Grade of Subject 10",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(grade_value10!=-1 && credit10.getText().toString().isEmpty())
        {
            flag=true;
            Toast.makeText(this,"Please Input Credit Hour of Subject 10",Toast.LENGTH_SHORT).show();
            return;
        }

        if(!flag) {
            Toast.makeText(this, "No Input Found", Toast.LENGTH_SHORT).show();
            return;
        }
        cgpa=sumCreditxGrade/sumCredit;


        cgpa =Double.parseDouble(new DecimalFormat("#.######").format(cgpa));
        final AlertDialog.Builder resultbuilder=new AlertDialog.Builder(gpa.this);
        final View resultView=getLayoutInflater().inflate(R.layout.gpa_result,null);
        TextView result= resultView.findViewById(R.id.result);
        Button ok_button=resultView.findViewById(R.id.ok_button);
        resultbuilder.setView(resultView);
        result.setText(String.valueOf(cgpa));
        final AlertDialog dialog=resultbuilder.create();
        dialog.show();
        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }
    //////////////////////////////RESET//////////////////////////////
    public void reset(){
        grade.setSelection(0);
        grade2.setSelection(0);
        grade3.setSelection(0);
        grade4.setSelection(0);
        grade5.setSelection(0);
        grade6.setSelection(0);
        grade7.setSelection(0);
        grade8.setSelection(0);
        grade9.setSelection(0);
        grade10.setSelection(0);
        credit1.setText("");
        credit2.setText("");
        credit3.setText("");
        credit4.setText("");
        credit5.setText("");
        credit6.setText("");
        credit7.setText("");
        credit8.setText("");
        credit9.setText("");
        credit10.setText("");
        sumCreditxGrade=0;
        sumCredit=0;
        flag=false;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        reset_button=(Button) findViewById(R.id.reset_button);
        calculate_button=(Button) findViewById(R.id.calculate_button);
        credit1=(EditText) findViewById(R.id.credit1);
        credit2=(EditText) findViewById(R.id.credit2);
        credit3=(EditText) findViewById(R.id.credit3);
        credit4=(EditText) findViewById(R.id.credit4);
        credit5=(EditText) findViewById(R.id.credit5);
        credit6=(EditText) findViewById(R.id.credit6);
        credit7=(EditText) findViewById(R.id.credit7);
        credit8=(EditText) findViewById(R.id.credit8);
        credit9=(EditText) findViewById(R.id.credit9);
        credit10=(EditText) findViewById(R.id.credit10);
        //////////////////////////////////Button////////////////////////////
        calculate_button=findViewById(R.id.calculate_button);
        reset_button=findViewById(R.id.reset_button);
        calculate_button.setOnClickListener(this);
        reset_button.setOnClickListener(this);
        /////////////////////////////////////////1////////////////////////////////////////
       grade=(Spinner) findViewById(R.id.gradeSelect);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade.setAdapter(adapter);

        grade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value1=-1;

                        break;
                    case 1:
                        grade_value1=4.00;
                        break;
                    case 2:
                        grade_value1=3.75;
                        break;
                    case 3:
                        grade_value1=3.50;
                        break;
                    case 4:
                        grade_value1=3.25;
                        break;
                    case 5:
                        grade_value1=3.00;
                        break;
                    case 6:
                        grade_value1=2.75;
                        break;
                    case 7:
                        grade_value1=2.50;
                        break;
                    case 8:
                        grade_value1=2.25;
                        break;
                    case 9:
                        grade_value1=2.00;
                        break;
                    case 10:
                        grade_value1=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        ////////////////////////////////////////2/////////////////////////////////////////


           grade2=(Spinner) findViewById(R.id.gradeSelect2);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade2.setAdapter(adapter2);

        grade2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value2=-1;

                        break;
                    case 1:
                        grade_value2=4.00;

                        break;
                    case 2:
                        grade_value2=3.75;
                        break;
                    case 3:
                        grade_value2=3.50;
                        break;
                    case 4:
                        grade_value2=3.25;
                        break;
                    case 5:
                        grade_value2=3.00;
                        break;
                    case 6:
                        grade_value2=2.75;
                        break;
                    case 7:
                        grade_value2=2.50;
                        break;
                    case 8:
                        grade_value2=2.25;
                        break;
                    case 9:
                        grade_value2=2.00;
                        break;
                    case 10:
                        grade_value2=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        /////////////////////////////////////////3////////////////////////////////////////
         grade3=(Spinner) findViewById(R.id.gradeSelect3);

        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade3.setAdapter(adapter3);

        grade3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value3=-1;

                        break;
                    case 1:
                        grade_value3=4.00;

                        break;
                    case 2:
                        grade_value3=3.75;
                        break;
                    case 3:
                        grade_value3=3.50;
                        break;
                    case 4:
                        grade_value3=3.25;
                        break;
                    case 5:
                        grade_value3=3.00;
                        break;
                    case 6:
                        grade_value3=2.75;
                        break;
                    case 7:
                        grade_value3=2.50;
                        break;
                    case 8:
                        grade_value3=2.25;
                        break;
                    case 9:
                        grade_value3=2.00;
                        break;
                    case 10:
                        grade_value3=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        /////////////////////////////////////////4////////////////////////////////////////

       grade4=(Spinner) findViewById(R.id.gradeSelect4);

        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade4.setAdapter(adapter4);

        grade4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value4=-1;

                        break;
                    case 1:
                        grade_value4=4.00;

                        break;
                    case 2:
                        grade_value4=3.75;
                        break;
                    case 3:
                        grade_value4=3.50;
                        break;
                    case 4:
                        grade_value4=3.25;
                        break;
                    case 5:
                        grade_value4=3.00;
                        break;
                    case 6:
                        grade_value4=2.75;
                        break;
                    case 7:
                        grade_value4=2.50;
                        break;
                    case 8:
                        grade_value4=2.25;
                        break;
                    case 9:
                        grade_value4=2.00;
                        break;
                    case 10:
                        grade_value4=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        //////////////////////////////////////////5///////////////////////////////////////

         grade5=(Spinner) findViewById(R.id.gradeSelect5);

        ArrayAdapter<CharSequence> adapter5=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade5.setAdapter(adapter5);

        grade5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value5=-1;

                        break;
                    case 1:
                        grade_value5=4.00;

                        break;
                    case 2:
                        grade_value5=3.75;
                        break;
                    case 3:
                        grade_value5=3.50;
                        break;
                    case 4:
                        grade_value5=3.25;
                        break;
                    case 5:
                        grade_value5=3.00;
                        break;
                    case 6:
                        grade_value5=2.75;
                        break;
                    case 7:
                        grade_value5=2.50;
                        break;
                    case 8:
                        grade_value5=2.25;
                        break;
                    case 9:
                        grade_value5=2.00;
                        break;
                    case 10:
                        grade_value5=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        ///////////////////////////////////////////6//////////////////////////////////////

        grade6=(Spinner) findViewById(R.id.gradeSelect6);

        ArrayAdapter<CharSequence> adapter6=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade6.setAdapter(adapter6);

        grade6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value6=-1;

                        break;
                    case 1:
                        grade_value6=4.00;

                        break;
                    case 2:
                        grade_value6=3.75;
                        break;
                    case 3:
                        grade_value6=3.50;
                        break;
                    case 4:
                        grade_value6=3.25;
                        break;
                    case 5:
                        grade_value6=3.00;
                        break;
                    case 6:
                        grade_value6=2.75;
                        break;
                    case 7:
                        grade_value6=2.50;
                        break;
                    case 8:
                        grade_value6=2.25;
                        break;
                    case 9:
                        grade_value6=2.00;
                        break;
                    case 10:
                        grade_value6=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        ////////////////////////////////////////////7/////////////////////////////////////

         grade7=(Spinner) findViewById(R.id.gradeSelect7);

        ArrayAdapter<CharSequence> adapter7=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade7.setAdapter(adapter7);

        grade7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value7=-1;

                        break;
                    case 1:
                        grade_value7=4.00;

                        break;
                    case 2:
                        grade_value7=3.75;
                        break;
                    case 3:
                        grade_value7=3.50;
                        break;
                    case 4:
                        grade_value7=3.25;
                        break;
                    case 5:
                        grade_value7=3.00;
                        break;
                    case 6:
                        grade_value7=2.75;
                        break;
                    case 7:
                        grade_value7=2.50;
                        break;
                    case 8:
                        grade_value7=2.25;
                        break;
                    case 9:
                        grade_value7=2.00;
                        break;
                    case 10:
                        grade_value7=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        //////////////////////////////////////8///////////////////////////////////////////
         grade8=(Spinner) findViewById(R.id.gradeSelect8);

        ArrayAdapter<CharSequence> adapter8=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade8.setAdapter(adapter8);

        grade8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value8=-1;

                        break;
                    case 1:
                        grade_value8=4.00;

                        break;
                    case 2:
                        grade_value8=3.75;
                        break;
                    case 3:
                        grade_value8=3.50;
                        break;
                    case 4:
                        grade_value8=3.25;
                        break;
                    case 5:
                        grade_value8=3.00;
                        break;
                    case 6:
                        grade_value8=2.75;
                        break;
                    case 7:
                        grade_value8=2.50;
                        break;
                    case 8:
                        grade_value8=2.25;
                        break;
                    case 9:
                        grade_value8=2.00;
                        break;
                    case 10:
                        grade_value8=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        ///////////////////////////////////////9//////////////////////////////////////////

         grade9=(Spinner) findViewById(R.id.gradeSelect9);

        ArrayAdapter<CharSequence> adapter9=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade9.setAdapter(adapter9);

        grade9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value9=-1;

                        break;
                    case 1:
                        grade_value9=4.00;

                        break;
                    case 2:
                        grade_value9=3.75;
                        break;
                    case 3:
                        grade_value9=3.50;
                        break;
                    case 4:
                        grade_value9=3.25;
                        break;
                    case 5:
                        grade_value9=3.00;
                        break;
                    case 6:
                        grade_value9=2.75;
                        break;
                    case 7:
                        grade_value9=2.50;
                        break;
                    case 8:
                        grade_value9=2.25;
                        break;
                    case 9:
                        grade_value9=2.00;
                        break;
                    case 10:
                        grade_value9=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        /////////////////////////////////////10////////////////////////////////////////////
         grade10=(Spinner) findViewById(R.id.gradeSelect10);

        ArrayAdapter<CharSequence> adapter10=ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade10.setAdapter(adapter10);
        grade10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        grade_value10=-1;

                        break;
                    case 1:
                        grade_value10=4.00;

                        break;
                    case 2:
                        grade_value10=3.75;
                        break;
                    case 3:
                        grade_value10=3.50;
                        break;
                    case 4:
                        grade_value10=3.25;
                        break;
                    case 5:
                        grade_value10=3.00;
                        break;
                    case 6:
                        grade_value10=2.75;
                        break;
                    case 7:
                        grade_value10=2.50;
                        break;
                    case 8:
                        grade_value10=2.25;
                        break;
                    case 9:
                        grade_value10=2.00;
                        break;
                    case 10:
                        grade_value10=0.00;
                        break;


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.grademapping,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id= item.getItemId();
        switch (id)
        {
            case R.id.show_grade_mapping:
                Intent intent = new Intent(this, grademapping.class);
                startActivity(intent);

        }


       return  true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_button:
                calculate();
                break;
            case R.id.reset_button:
                reset();
                break;

        }

    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }

}
