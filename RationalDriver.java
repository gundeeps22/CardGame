/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationaldriver;

/**
 *
 * @author Ethan
 */
import java.util.Scanner;

public class RationalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int den1 = 0;
        int num2 = 0;
        int den2 = 0;
        String calculate = "";

        System.out.print("For the first fraction, what is it's numerator? : ");
        num1 = scan.nextInt();
        System.out.print("For the first fraction, what is it's denominator? : ");
        den1 = scan.nextInt();
        System.out.println("Fraction 1 : " + num1 + "/" + den1);
        System.out.println();
        Rational fraction1 = new Rational(num1, den1);

        System.out.print("For the second fraction, what is it's numerator? : ");
        num2 = scan.nextInt();
        System.out.print("For the second fraction, what is it's denominator? : ");
        den2 = scan.nextInt();
        System.out.println("Fraction 2 : " + num2 + "/" + den2);
        System.out.println();
        Rational fraction2 = new Rational(num2, den2);

        //ADD FRACTIONS//
        System.out.print("Wish to add the two Fractions? (Y/N) : ");
        calculate = scan.nextLine();
        calculate = scan.nextLine();

        if (calculate.toUpperCase().equals("Y")) {
            fraction1.add(fraction2);
            System.out.println(fraction1.add(fraction2));
        }
        //SUBTRACT FRACTIONS//
        System.out.println();
        System.out.print("Wish to subtract the two Fractions? (Y/N) : ");
        calculate = scan.nextLine();

        if (calculate.toUpperCase().equals("Y")) {
            System.out.print("If you want to calculate [Fraction1 - Fraction2], press A. For [Fraction2 - Fraction1], press B: ");
            calculate = scan.nextLine();
            if (calculate.toUpperCase().equals("A")) {
                fraction1.subtract(fraction2);
                System.out.println(fraction1.subtract(fraction2));
            } else {
                fraction2.subtract(fraction1);
                System.out.println(fraction2.subtract(fraction1));
            }

        }
        //DIVIDE FRACTIONS//
        System.out.println();
        System.out.print("Wish to divide the two Fractions? (Y/N) : ");
        calculate = scan.nextLine();

        if (calculate.toUpperCase().equals("Y")) {
            System.out.print("If you want to calculate [Fraction1 / Fraction2], press A. For [Fraction2 / Fraction1], press B: ");
            calculate = scan.nextLine();
            if (calculate.toUpperCase().equals("A")) {
                fraction1.divide(fraction2);
                System.out.println(fraction1.divide(fraction2));
            } else {
                fraction2.divide(fraction1);
                System.out.println(fraction2.divide(fraction1));
            }

        }
        
        System.out.println();
        System.out.print("Wish to multiply the two Fractions? (Y/N) : ");
        calculate = scan.nextLine();
        
        if (calculate.toUpperCase().equals("Y")) {
            fraction1.multiply(fraction2);
            System.out.println(fraction1.multiply(fraction2));
        }
        //compareTo test w/interface
        System.out.println("CompareTo Value: " + fraction1.compareTo(fraction2));
    }

}
