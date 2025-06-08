package com.Bhagya.HCF;

import java.util.Scanner;

import com.Bhagya.HCF.GCD;
public class App {
    public static void main(String[] args) {
        GCD c = new GCD();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of"+a+" "+"and"+" "+b+" "+"is"+" "+ c.gcd(a,b));
    }
}
