package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText variable1;
    private EditText variable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
variable1=(EditText)findViewById(R.id.BOTON);
variable2=(EditText)findViewById(R.id.BOTON2);
    }
}