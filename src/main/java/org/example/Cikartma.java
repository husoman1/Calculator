package org.example;

import java.util.ArrayList;

public class Cikartma {

    double total = 0;
    public Cikartma(ArrayList<Double> values) {
        for (Double num : values) {

            total = total - num;
        }
    }

    public double getTotal() {
        return total;
    }
}
