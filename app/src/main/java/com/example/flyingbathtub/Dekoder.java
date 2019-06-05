package com.example.flyingbathtub;

public abstract class Dekoder {

    protected     String dzialanie;
    protected     double a,b;

    public Dekoder(String pierwsza_wartosc, String znak, String druga_wartosc){
        a = Double.parseDouble(pierwsza_wartosc);
        dzialanie=znak;
        b = Double.parseDouble(druga_wartosc);
    }

    ;
    public Dekoder(){};
}
