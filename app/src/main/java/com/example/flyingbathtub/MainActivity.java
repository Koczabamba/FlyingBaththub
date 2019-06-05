package com.example.flyingbathtub;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private void tylko_wynik(){
        ((TextView)findViewById(R.id.previousValue)).setText("");
        ((TextView)findViewById(R.id.activityScreen)).setText("");
        ((TextView)findViewById(R.id.calcScreen)).setText("");
    }

    private void przenies_wartosc(){
        ((TextView)findViewById(R.id.previousValue)).setText(((TextView)findViewById(R.id.calcScreen)).getText());
        ((TextView)findViewById(R.id.calcScreen)).setText("");
    }

    private void wyslij_znak(String znak) {
        ((TextView) findViewById(R.id.activityScreen)).setText(znak);
    }

    private void wyslij_liczbe(String liczba) {
//        aleksandra="2";
        ((TextView) findViewById(R.id.calcScreen)).setText(((TextView)findViewById(R.id.calcScreen)).getText() + liczba);

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
//                ((Button)findViewById(R.id.buttonMultiplication)).setBackgroundColor(Color.parseColor("#ffffff"));
            if(((TextView)findViewById(R.id.calcScreen)).getText()!="") {
                wyslij_znak("*");
                przenies_wartosc();
                }
            }
        });
        Button Plus= findViewById(R.id.buttonPlus);
        Plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                ((Button)findViewById(R.id.buttonPlus)).setBackgroundColor(Color.parseColor("#ffffff"));
            if(((TextView)findViewById(R.id.calcScreen)).getText()!="") {
                wyslij_znak("+");
                przenies_wartosc();
                }
            }
        });
        Button Division= findViewById(R.id.buttonDivision);
        Division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                ((Button)findViewById(R.id.buttonDivision)).setBackgroundColor(Color.parseColor("#ffffff"));
            if(((TextView)findViewById(R.id.calcScreen)).getText()!=""){
                wyslij_znak(":");
                przenies_wartosc();
                }
            }
        });
        Button Minus= findViewById(R.id.buttonMinus);
        Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                ((Button)findViewById(R.id.buttonMinus)).setBackgroundColor(Color.parseColor("#ffffff"));
            if(((TextView)findViewById(R.id.calcScreen)).getText()!=""){
                wyslij_znak("-");
                przenies_wartosc();
                }
            }
        });
        Button Jeden= findViewById(R.id.button1);
        Jeden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("1");
            }
        });
        Button Dwa= findViewById(R.id.button2);
        Dwa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("2");
            }
        });
        Button Trzy= findViewById(R.id.button3);
        Trzy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("3");
            }
        });
        Button Cztery= findViewById(R.id.button4);
        Cztery.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("4");
            }
        });
        Button Piec= findViewById(R.id.button5);
        Piec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("5");
            }
        });
        Button Szesc= findViewById(R.id.button6);
        Szesc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("6");
            }
        });
        Button Siedem= findViewById(R.id.button7);
        Siedem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("7");
            }
        });
        Button Osiem= findViewById(R.id.button8);
        Osiem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("8");
            }
        });
        Button Dziewiec= findViewById(R.id.button9);
        Dziewiec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("9");
            }
        });
        Button Zero= findViewById(R.id.button0);
        Zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                wyslij_liczbe("0");
            }
        });
        Button Przecinek= findViewById(R.id.buttonPoint);
        Przecinek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(((TextView)findViewById(R.id.calcScreen)).getText()!="") {
                   String  sprawdz= (String) ((TextView)findViewById(R.id.calcScreen)).getText();
                   if(sprawdz.contains(".")==false) {
                       wyslij_liczbe(".");
                   }
               }
            }
        });
        Button Rownosc= findViewById(R.id.buttonEqual);
        Rownosc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String pierwsza= (String)((TextView) findViewById(R.id.previousValue)).getText();
                String znak= (String)((TextView) findViewById(R.id.activityScreen)).getText();
                String druga= (String)((TextView) findViewById(R.id.calcScreen)).getText();
                tylko_wynik();
//                ((TextView)findViewById(R.id.calcScreen)).setText("= ");

                 Procesor oblicz = new Procesor(pierwsza, znak, druga);
                                 ((TextView) findViewById(R.id.calcScreen)).setText(oblicz.ladny_wynik());
//                 ((TextView) findViewById(R.id.calcScreen)).setText(String.valueOf(oblicz.wynik()));
            }
        });
        Button Czysc= findViewById(R.id.buttonClear);
        Czysc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if(((TextView) findViewById(R.id.calcScreen)).getText() == ""){
                    ((TextView) findViewById(R.id.activityScreen)).setText("");
                    ((TextView) findViewById(R.id.previousValue)).setText("");
                };
                ((TextView) findViewById(R.id.calcScreen)).setText("");
            }
        });
        TextView Ekran= findViewById(R.id.calcScreen);
        // koniec polimeru
    }
}
