package com.example.kartik.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextView t;
    public String first=" ";
    public  String second=" ";
     public String operator=" ";
     double a,b,c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7 =findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);
        t=findViewById(R.id.t1);

    }


    public void action(View v)

    {
        int id=v.getId();
        if (id== b1.getId())
        {   first="1";
            second=second+first;


            t.setText(second);
        }
        if (id== b2.getId())
        {   first="2";
        second=second+first;
            t.setText(second);
        }
        if (id== b3.getId())
        {
            first="3";
            second=second+first;


            t.setText(second);
        }
        if (id== b5.getId())
        {
            first="4";
            second=second+first;


            t.setText(second);
        }
        if (id== b6.getId())
        {
            first="5";
            second=second+first;


            t.setText(second);
        }
        if (id== b7.getId())
        {
            first="6";
            second=second+first;


            t.setText(second);
        }
        if (id== b9.getId())
        {
            first="7";
            second=second+first;


            t.setText(second);
        }
        if (id== b10.getId())
        {
            first="8";
            second=second+first;


            t.setText(second);
        }
        if (id== b11.getId())
        {
            first="9";
            second=second+first;


            t.setText(second);
        }
        if (id== b14.getId())
        {
            first="0";
            second=second+first;


            t.setText(second);
        }

        if(id==b15.getId())
        {

            a=Float.parseFloat(t.getText().toString());
            first=" ";
            second=" ";
            operator="+";
            t.setText(" ");

        }

        if(id==b13.getId())
        {

            a=Float.parseFloat(t.getText().toString());
            first=" ";
            second=" ";
            operator="-";
            t.setText(" ");


        }
        if(id==b8.getId())
        {

            a=Float.parseFloat(t.getText().toString());
            first=" ";
            second=" ";
            operator="/";
            t.setText(" ");

        }
        if(id==b12.getId())
        {

            a=Float.parseFloat(t.getText().toString());
            first=" ";
            second=" ";
            operator="*";
            t.setText(" ");

        }
        if(id==b4.getId())
        {

            a=Float.parseFloat(t.getText().toString());
            first=" ";
            second=" ";
            t.setText(" ");


        }
        if(id==b16.getId())
        {

            b=Float.parseFloat(t.getText().toString());
            if(operator.equals("+"))
            {
                 c=a+b;
                t.setText(Double.toString(c));
                first=" ";
                second=" ";
                operator=" ";


            }
             else if(operator.equals("-"))
            {
                c=a-b;
                t.setText(Double.toString(c));
                first=" ";
                second=" ";
                operator=" ";

            }
            else if(operator.equals("*"))
            {
                c=a*b;
                t.setText(Double.toString(c));
                first=" ";
                second=" ";
                operator=" ";

            }
            else if(operator.equals("/"))
            {
                c=a/b;
                t.setText(Double.toString(c));
                first=" ";
                second=" ";
                operator=" ";

            }

        }








    }
}
