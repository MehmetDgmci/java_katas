package SquareSum;

public class Solution {
	public static int squareSum(int[] number) {
		int sum = 0;
		for (int n : number) {
			sum += n * n;
		}
		return sum;
	}
}
