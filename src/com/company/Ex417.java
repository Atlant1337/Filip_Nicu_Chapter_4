package com.company;
import java.util.Scanner;
public class Ex417 {

    public static void main(String[] args) {
        // write your code here
        float miles;
        float gallons;
        float result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles: ");
        miles = scan.nextFloat();
        System.out.println("Enter gallons: ");
        gallons = scan.nextFloat();
        result = miles/gallons;
        System.out.println("Result: "+ result );

    }
}
