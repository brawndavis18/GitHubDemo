package NumberOperator;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find all prime numbers less than it: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers less than " + limit + ":");
        printPrimeNumbers(limit);

        scanner.close();
    }
   
   static void printPrimeNumbers(int limit) {

        for (int i = 2; i < limit; i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");

            }
        }
    }

    static boolean isPrime(int num) {

        if (num < 2) {

            return false;

        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                return false;
            }
        }
        
        return true;
    }

}


