package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        for (double i = 2.0; i <= 5.0; i++) {
            System.out.println("10,000 at "+i+"% interest: "+String.format("%.2f", calcInterest(10_000.0, i)));
        }

        System.out.println("--------------------------");

        for (double i = 5.0; i >= 2.0; i--) {
            System.out.println("10,000 at "+i+"% interest: "+String.format("%.2f", calcInterest(10_000.0, i)));
        }

        int number = 50;
        int count = 0;

        for (int i = 10; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count ++;
            }

            if (count == 3) {
                break;
            }
        }
    }

    public static double calcInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n ==1){
            return false;
        }

        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
