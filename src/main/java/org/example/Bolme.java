package org.example;

import java.util.ArrayList;

public class Bolme {

    double total;
    public Bolme(ArrayList<Double> values) {
        for (Double num : values) {
            if (num == 0 ) {
                throw new IllegalArgumentException("Number 0!!");
            }
            if (values.indexOf(num) == 0) {
                total = num;
            }
            else{
                total = total / num;


            }

        }
    }

    public double getTotal() {
        return total;
    }
}
