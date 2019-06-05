package com.example.flyingbathtub;

import android.util.Log;

public class Procesor extends Dekoder {

    public String ladny_wynik(){
        String lw;
        lw=String.valueOf(wynik());
        return lw;
    }

    private double wynik(){
//        Log.d("hello", dzialanie);
//        dzialanie ="+";
//        a=2;
//        b=3;
        if(dzialanie.equals("+")){
            return (a+b);
        };
        if(dzialanie.equals("-")){
            return (a-b);
        };
        if(dzialanie.equals("*")){
            return (a*b);
        };
        if(dzialanie.equals(":")){
            if(b==0)
                return 999999999;
            return (a/b);
        };
    return 17.78;
    };
    public Procesor(String pw, String dz, String dw){
        super(pw, dz, dw);};
}
