package joneill.euler;

import java.util.ArrayList;
import java.util.List;

/***
 * @author josep_000
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 * 
 ***/

public class Euler6 {
	private static long answer;
	private static List<Integer> sequence = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		getAnswer();
		System.out.println(String.valueOf(answer));
	}
	
	private static void getAnswer() {
		fillSequence(100, 1);
		answer = getSequenceSumSquared(sequence, 100) - getPartialSumOfSquares(100);
	}
	
	//maxNumber is the number of greatest value within the sequence
	private static void fillSequence(int maxNumber, int step) {
		for(int i = 1; i <= maxNumber; i += step) {
			sequence.add(i);
		}
	}
	
	//Square of the sum
	//(n(a1 * an))/2
	private static int getSequenceSumSquared(List<Integer> sequenceList, int partialSumNum) {
		int sum = (partialSumNum * (sequenceList.get(0) + sequenceList.get(partialSumNum - 1)))/2;
		sum *= sum;
		return sum;
	}
	
	//Sum of squares
	//(n(n+1)(2n+1))/6
	private static int getPartialSumOfSquares(int partialSumNum) {
		int sum = (partialSumNum * ((partialSumNum + 1) * (2 * partialSumNum + 1)))/6;
		return sum;
	}
}
