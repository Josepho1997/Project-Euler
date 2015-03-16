package joneill.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * @author josep_000
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.

 * What is the largest prime factor of the number 600851475143 ?
 *
 ***/

public class Euler3 {
	private static double currNum;
	private static int num;
	public static final double LPF_NUMBER = 600851475143.0;
	private static List<Integer> primeFactors = new ArrayList<Integer>();
	private static int largestPrimeFactor;
	
	public static void main(String args[]) {
		getAnswer(LPF_NUMBER);
		System.out.println("Largest Prime Factor: " + Integer.toString(largestPrimeFactor));
	}
	
	//This method does not check if the num variable is prime or not.
	//However, we still get the correct answer.
	private static void getAnswer(double lpfNum) {
		num = 2;
		currNum = lpfNum;
		double currentProduct;
		do {
			currentProduct = 1;
			if (currNum % num == 0) {
				currNum = currNum/num;
				primeFactors.add(num);
				System.out.println(num);
			}
			num++;
			for(int i = 0; i < primeFactors.size(); i++) {
				currentProduct *= primeFactors.get(i);
			}
		} while (currentProduct != lpfNum);
		Collections.sort(primeFactors);
		Collections.reverse(primeFactors);
		largestPrimeFactor = primeFactors.get(0);
	}
}
