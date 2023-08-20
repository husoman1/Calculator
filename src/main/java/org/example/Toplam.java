package org.example;

import java.util.ArrayList;

public class Toplam {

    double total = 0;

    public Toplam(ArrayList<Double> values) {
        for (Double num : values) {

            total = total + num;
        }
    }

    public double getTotal() {
        return total;
    }
}
