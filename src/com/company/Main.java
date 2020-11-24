package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Kilde sedney = new Kilde("Sedney Lee");

        Kilde gustav = new Kilde("Gustav s");


//        Abonnent abonnent = new Abonnent(sedney);
//        Abonnent abonnent1 = new Abonnent(sedney);
//        Abonnent abonnent2 = new Abonnent(gustav);
//        Abonnent abonnent3 = new Abonnent(sedney);
//        Abonnent rene = new Abonnent(gustav);
//
//        sedney.setBesked("man kan ikke være for stiv til sex med pinball maskine");
//
//        System.out.println("nu prøver vi gustav");
//
//        gustav.setBesked("fuld trusserne med brocoli... sir gustav");
//
//
//        Tween tween = new Tween(sedney,"joy");
//
//        sedney.setBesked("jeg har været hjernedød længe");
//
//
//        tween.afmeld();
//
//        sedney.setBesked("jeg har spildt penge på psykolog fordi jeg hjerne død");
//
//        tween.skiftKide(gustav);
//
//        gustav.setBesked("halv pris på første træning, med happy ending");
//
//        sedney.setBesked("månen er ikke lavet grøn ost !!!!");
//

        System.out.println("\n\n\n\n");

        Kilde fie = new Kilde("fie pigen");

        Tween lukas = new Tween(gustav,"Lukas");

        lukas.skiftKide(sedney);

        lukas.skiftKide(fie);

        fie.setBesked("se hvad jeg fik lavet i polen for 100 kr");

        gustav.setBesked("gustav siger :jeg har fået ny kærste");


        sedney.setBesked("Sidny siger :huske mundbind i swingerklubben");



    }
}