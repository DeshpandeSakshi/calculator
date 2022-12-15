package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfno,etsno;
    Button btnadd,btnsub,btnmul,btndiv;
    TextView result;
    String x,y,z;
    int a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfno=(EditText) findViewById(R.id.etfno);
        etsno=(EditText) findViewById(R.id.etsno);
        btnadd=(Button) findViewById(R.id.btnadd);
        btnsub=(Button) findViewById(R.id.btnsub);
        btnmul=(Button) findViewById(R.id.btnmul);
        btndiv=(Button) findViewById(R.id.btndiv);
        result=(TextView) findViewById(R.id.result);
    }
    public void add(View view) {
        read();
        c = a + b;
        display();
    }
    public void sub(View view) {
        read();
        c = a - b;
        display();
    }
    public void mul(View view) {
        read();
        c = a * b;
        display();
    }
    public void div(View view) {
        read();
        c = a / b;
        display();
    }
    public void read()
    {
        x=etfno.getText().toString();
        y=etsno.getText().toString();
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
    }
    public void display()
    {
        result.setText("the result ="+c);
    }
}