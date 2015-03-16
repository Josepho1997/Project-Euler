package joneill.euler;
/***
 * @author josep_000
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the 
 * product of two 2-digit numbers is 9009 = 91 × 99
 * Find the largest palindrome made from the product of two 3-digit numbers..
 *
 ***/

public class Euler4 {
	private static int firstDigit;
	private static int lastDigit;
	private static int currPalindrome;
	private static int palindrome;
	
	public static void main(String args[]) {
		getAnswer();
		System.out.println(String.valueOf(palindrome));
	}
	
	private static void getAnswer() {
		for(int i = 999; i >= 100; i--) {
			for(int j = 999; j >= 100; j--) {
				firstDigit = getDigits(getDigits(i, 100) * getDigits(j, 100), 9);
				lastDigit = ((i % 10) * (j % 10)) % 10;
				if(firstDigit == lastDigit) {
					int product = i * j;
					if(product == reverseInt(product)) {
						currPalindrome = product;
						if(currPalindrome > palindrome) {
							palindrome = currPalindrome;
						}
					}
				}
			}
		}
	}
	
	public static int getDigits(int number, int maxAbs) {
		  while (number < -maxAbs || maxAbs < number) number /= 10;
		  return Math.abs(number);
	}
	
	public static int reverseInt(int numInput) {
	    int reversedNum = 0;
	    int input = numInput;

	    while (input != 0) {
	        reversedNum = reversedNum * 10 + input % 10;
	        input /= 10;
	    }
	    
	    return reversedNum;
	}
}
