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

}
