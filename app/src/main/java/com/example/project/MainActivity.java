package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculator_button=findViewById(R.id.calculator_button);
        Button translator_button=findViewById(R.id.translator_button);
        Button converter_button=findViewById(R.id.converter_button);

        calculator_button.setOnClickListener(this);
        translator_button.setOnClickListener(this);
        converter_button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.details,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id= item.getItemId();
        switch (id)
        {
            case R.id.show_about:
                Intent intent = new Intent(this, about.class);
                startActivity(intent);
                break;
            case R.id.show_developers:
                Intent intent2 = new Intent(this, DevelopersInfo.class);
                startActivity(intent2);
                break;

        }

        return  true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculator_button: Intent intent = new Intent(this, Calculator.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                break;
            case R.id.translator_button:
                Intent intent2 = new Intent(this, translator.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                break;
            case R.id.converter_button:
                Intent intent3 = new Intent(this, converter.class);
                startActivity(intent3);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                break;

        }

    }

}
