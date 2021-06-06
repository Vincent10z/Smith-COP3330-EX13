/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */
import java.lang.Math;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double p, r, t, rr, intrest, total;
        int n;
        System.out.print("Enter the principal amount? ");
        p = input.nextFloat();

        System.out.print("What is the rate? ");
        r = input.nextFloat();


        System.out.print("What is the number of years? ");
        t = input.nextFloat();

        System.out.print("What is the number of times the interest is compounded per year? ");
        n = input.nextInt();

        rr = r/100;

        intrest =  (Math.pow((1 + r/n), (t*n)));
        total = intrest * p;


        System.out.println(+p+ " invested at " +r+ "%, for " +t+ " years compounded "+n+ " times per year is $" +total+ "");




    }

}