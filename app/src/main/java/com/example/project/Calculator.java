package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Button gpa_button=findViewById(R.id.gpa_button);
        Button standard_button=findViewById(R.id.standard_button);
        gpa_button.setOnClickListener(this);
        standard_button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gpa_button: Intent intent = new Intent(this, gpa.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_down);
                break;
            case R.id.standard_button:
                Intent intent2 = new Intent(this, standard.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);

                break;

        }

    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
