package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class splashscreen extends AppCompatActivity {
long Delay=5000;
ProgressBar prg;
int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);
        prg=findViewById(R.id.progressbar);
        Timer RunSplash=new Timer();

        TimerTask ShowSplash=new TimerTask() {
            @Override
            public void run() {

                finish();

                Intent intent=new Intent(splashscreen.this,MainActivity.class);
                startActivity(intent);
            }
        };
        RunSplash.schedule(ShowSplash,Delay);
    }
}
