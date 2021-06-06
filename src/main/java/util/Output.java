package util;

public class Output {

    static public void printOutput(int year, double rate, double finalPrice) {
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f1\n", year, rate, finalPrice);
    }
}
