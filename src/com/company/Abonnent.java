package com.company;

import java.util.ArrayList;
import java.util.List;

public class Abonnent {

    Kilde kilde;



    String sidsteNyt = "det er ikke sket noget";



    public void skiftKide(Kilde kilde) {
        this.kilde = kilde;
        tilmeld();

    }

    public Abonnent(Kilde kilde) {
        this.kilde = kilde;
        tilmeld();
    }


    public void tilmeld() {

        kilde.registrer(this);

    }

    public void afmeld() {

        kilde.afRegistrer(this);
    }

    public void hentÆndring(Kilde kilde) {


        sidsteNyt = kilde.getBesked();
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Abonnent{" +
                "kilde=" + kilde.getId() +
                ", sidsteNyt='" + sidsteNyt + '\'' +
                '}';
    }
}