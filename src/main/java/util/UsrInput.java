package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getPrincipal() {
        System.out.print("Enter the principal: ");
        return input.nextDouble();
    }

    static public double getRate() {
        System.out.print("Enter the rate of interest: ");
        return input.nextDouble();
    }

    static public int getNumYears() {
        System.out.print("Enter the number of years: ");
        return input.nextInt();
    }
}
