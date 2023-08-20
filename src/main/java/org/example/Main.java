package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.



        doMagic();


    }

    public static double getValueDouble(){
        Scanner scn1 = new Scanner(System.in);
        //double deger = scn1.nextDouble();
        return scn1.nextDouble();
    }
    public static void doMagic(){
        Menu menu = new Menu();
        menu.initMenu();
        double deger;
        double deger2;

        Scanner scn2 = new Scanner(System.in);
        int islem = scn2.nextInt();

        ArrayList<Double> values = new ArrayList<Double>();
        values.add(2.3);
        values.add(4.1);
        values.add(3.0);
        values.add(7.0);

        switch (islem){
            case 1:
                Toplam tplm = new Toplam(values);
                System.out.println(tplm.getTotal());
                break;
            case 2:
                Cikartma ckrtma = new Cikartma(values);
                System.out.println(ckrtma.getTotal());
                break;
            case 3:
                Carpim crp = new Carpim(values);
                System.out.println(crp.getTotal());
                break;
            case 4:
                Bolme bol = new Bolme(values);
                System.out.println(bol.getTotal());
                break;
            default :
                System.out.println("Geçersiz bir işlem seçtiniz");
                break;
        }
    }
}