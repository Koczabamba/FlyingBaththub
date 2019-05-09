package com.example.flyingbathtub;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private void alojzy(String aleksandra){
//        aleksandra="2";
        ((TextView)findViewById(R.id.calcScreen)).setText(aleksandra);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //polimer
        Button Multi= findViewById(R.id.buttonMultiplication);
        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ((Button)findViewById(R.id.buttonMultiplication)).setBackgroundColor(Color.parseColor("#ffffff"));
//                ((TextView)findViewById(R.id.textView)).setText("orangutan");
                alojzy("*");
            }
        });
        Button Plus= findViewById(R.id.buttonPlus);
        Plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((Button)findViewById(R.id.buttonPlus)).setBackgroundColor(Color.parseColor("#ffffff"));
                ((TextView)findViewById(R.id.calcScreen)).setText("+");
            }
        });
        Button Division= findViewById(R.id.buttonDivision);
        Division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((Button)findViewById(R.id.buttonDivision)).setBackgroundColor(Color.parseColor("#ffffff"));
                ((TextView)findViewById(R.id.calcScreen)).setText(":");
            }
        });
        Button Minus= findViewById(R.id.buttonMinus);
        Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((Button)findViewById(R.id.buttonMinus)).setBackgroundColor(Color.parseColor("#ffffff"));
                ((TextView)findViewById(R.id.calcScreen)).setText("-");
            }
        });
        Button Jeden= findViewById(R.id.button1);
        Jeden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("1");
            }
        });
        Button Dwa= findViewById(R.id.button2);
        Dwa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("2");
            }
        });
        Button Trzy= findViewById(R.id.button3);
        Trzy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("3");
            }
        });
        Button Cztery= findViewById(R.id.button4);
        Cztery.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("4");
            }
        });
        Button Piec= findViewById(R.id.button5);
        Piec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("5");
            }
        });
        Button Szesc= findViewById(R.id.button6);
        Szesc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("6");
            }
        });
        Button Siedem= findViewById(R.id.button7);
        Siedem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("7");
            }
        });
        Button Osiem= findViewById(R.id.button8);
        Osiem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("8");
            }
        });
        Button Dziewiec= findViewById(R.id.button9);
        Dziewiec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("9");
            }
        });
        Button Zero= findViewById(R.id.button0);
        Zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("0");
            }
        });
        Button Przecinek= findViewById(R.id.buttonPoint);
        Przecinek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText(",");
            }
        });
        Button Rownosc= findViewById(R.id.buttonEqual);
        Rownosc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.calcScreen)).setText("=");
            }
        });
        // koniec polimera

    }
}
