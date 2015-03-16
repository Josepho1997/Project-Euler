package joneill.euler;
/***
 * @author josep_000
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 *
 ***/

public class Euler10 {
	private static long answer;
	private static long startTime;
	private static long endTime;
	
	public static void main(String args[]) {
		startTime = System.nanoTime();
		getAnswer();
		endTime = System.nanoTime();

		System.out.println(String.valueOf(answer) + "\n" + "Time: "
				+ (endTime - startTime) / 1000000000.0f);
		
		System.out.println(Long.toString(answer));
	}
	
	private static void getAnswer() {
		long sum = 2;
		for(int i = 3; i < 2000000; i += 2) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		answer = sum;
	}
	
	private static Boolean isPrime(double number) {
		int max = (int) Math.sqrt(number);
	    for (int i = 3; i <= max; i += 2) {
	        if (number % i == 0) return false;
	    }
	    return true;
	}
}
