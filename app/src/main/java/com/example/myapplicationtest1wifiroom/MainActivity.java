package com.example.myapplicationtest1wifiroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);


    }

    public String units(String a)
    {
        int length = a.length();
        int asciiVal = 96+length;
        String s = new Character((char) asciiVal).toString();
        return s;
    }
    public String tenth(String a)
    {
        int b=sumno(Integer.parseInt(a));
        return String.valueOf(b);
    }
    public String hundreds(String a)
    {
        int d=sumno(Integer.parseInt(a));
        if(d%2==0)
        {
            d+=1;
        }
        return String.valueOf(d);
    }
    public int sumno(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public void procss1(View view)

    {

        String a= e1.getText().toString();
        String u=units(a);

        String t=tenth(e2.getText().toString());

        String h=hundreds(e2.getText().toString());

        t1.setText(h+t+u);

    }
}

