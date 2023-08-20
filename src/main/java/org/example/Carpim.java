package org.example;

import java.util.ArrayList;

public class Carpim {
    double deger1;
    double deger2;

    double deger3;
    double total = 1;

    public Carpim(double deger1, double deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;

        deger3 = deger1*deger2;
    }

    public Carpim(ArrayList<Double> values) {
        for (Double num : values) {

            total = total * num;
        }
    }

    public double getDeger3() {
        return deger3;
    }

    public double getTotal() {
        return total;
    }
}
