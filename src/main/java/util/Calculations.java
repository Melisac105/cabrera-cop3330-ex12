package util;

public class Calculations {

    static public double calcFinalPrice(double principal, double rate, int year) {
        double finalPrice = principal*(1 + ((rate / 100) *year));
        return Math.round(finalPrice * 100) / 100.0;
    }
}
