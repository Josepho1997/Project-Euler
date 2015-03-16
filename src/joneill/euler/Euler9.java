package joneill.euler;

/***
 * @author josep_000
 * 
 *         A Pythagorean triplet is a set of three natural numbers, a < b < c,
 *         for which, a2 + b2 = c2
 * 
 *         For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 *         There exists exactly one Pythagorean triplet for which a + b + c =
 *         1000.
 * 
 *         Find the product abc.
 * 
 ***/

public class Euler9 {
	private static long answer;
	private static final int EQUATION_SUM = 1000;
	private static long startTime;
	private static long endTime;

	public static void main(String args[]) {
		startTime = System.nanoTime();
		getAnswer();
		endTime = System.nanoTime();

		System.out.println(String.valueOf(answer) + "\n" + "Time: "
				+ (endTime - startTime) / 1000000000.0f);
		System.out.println(String.valueOf(answer));
	}

	@SuppressWarnings("unused")
	private static void getAnswer() {
		long aSq, bSq, cSq;
		long sum;
		for (int a = 0; a < EQUATION_SUM; a++) {
			for (int b = 0; b < EQUATION_SUM; b++) {
				for (int c = 0; c < EQUATION_SUM; c++) {
					if (a + b + c == EQUATION_SUM && a < b && b < c) {
						aSq = a * a;
						bSq = b * b;
						cSq = c * c;
						if (aSq + bSq == cSq) {
							sum = a + b + c;
							answer = a * b * c;
							System.out.println(a + " " + b + " " + c);
							return;
						}
					}
				}
			}
		}
	}
}
