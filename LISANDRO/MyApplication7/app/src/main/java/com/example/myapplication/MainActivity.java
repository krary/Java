package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int matematicas=5;
        int quimica=5;
        int ingles=5;
        int promedio=0;

        promedio=(matematicas+quimica+ingles)/2;
        if (promedio>= 6){
            Toast.makeText(this, "aprobado", Toast.LENGTH_LONG).show();
            }
        else if(promedio<=6){
            Toast.makeText(this, "reprobaddo", Toast.LENGTH_LONG).show();
        } 
}}