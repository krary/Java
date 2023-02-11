package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private EditText text1;
    private EditText text2;
    private TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.text_num1);
        text2=(EditText)findViewById(R.id.text_num5);
        text3 =(EditText)findViewById(R.id.text_num4);
    }
    //REALIZA LA SUMA
   public void SUMA(View vista){
String variable1=text1.getText().toString();
String variable2=text2.getText().toString();
int num1=Integer.parseInt(variable1);
int num2=Integer.parseInt(variable2);
int suma=num1+num2;
String resultado=String.valueOf(suma);
text3.setText(resultado);
    }
}