package joneill.euler;


/***
 * @author josep_000
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 ***/

public class Euler7 {
	private static double answer;
	private static int primeNumberCount = 0;
	private static long startTime;
	private static long endTime;
	
	public static void main(String args[]) {
		startTime = System.nanoTime();
		getAnswer();
		endTime = System.nanoTime();
		
		System.out.println(String.valueOf(answer) + "\n" + "Time: " + (endTime - startTime) / 1000000000);
	}
	
	private static void getAnswer() {
		double i = 1;
		while(i != -1) {
			if(isPrime(i)) {
				primeNumberCount++;
				if(primeNumberCount == 10001) {
					answer = i;
					i = -1;
				}
			}
			if(i != -1) {
				i += 2;
			}
		}
	}
	
	private static Boolean isPrime(double number) {
		int max = (int) Math.sqrt(number);
	    for (int i = 3; i <= max; i += 2) {
	        if (number % i == 0) return false;
	    }
	    return true;
	}
}
