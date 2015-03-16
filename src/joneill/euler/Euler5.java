package joneill.euler;
/***
 * @author josep_000
 * 
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 ***/

public class Euler5 {
	private static long answer;
	public static final int TOP_DOMAIN = 20;
	
	public static void main(String args[]) {
		getAnswer();
		System.out.println(String.valueOf(answer));
	}
	
	private static void getAnswer() {
		int counter = 1;
		int currentNum;
		while(counter != -1) {
			currentNum = counter * TOP_DOMAIN;
			if(isDivisibleTree(currentNum, TOP_DOMAIN)) {
				answer = currentNum;
				counter = -1;
				//break;
			} else {
				counter++;
			}
		}
	}
	
	private static boolean isDivisible(int number, int divident) {
		if(number % divident == 0) return true;
		return false;
	}
	
	private static boolean isDivisibleTree(int number, int topDomain) {
		for(int i = 2; i <= topDomain; i++) {
			if(!isDivisible(number, i)) {
				return false;
			}
		}
		return true;
	}
}
