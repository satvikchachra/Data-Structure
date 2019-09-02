package Github;

import java.util.Scanner;

public class maximumCircularSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int brr[] = new int[2 * n];
			for (int i = 0; i < n; i++) {
				brr[i] = arr[i];
			}
			int k = 0;
			for (int i = n; i < 2 * n; i++) {
				brr[i] = arr[k];
				k++;
			}
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = 0;
				for (int j = i; j < n + i; j++) {
					sum += brr[j];
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println(max);
			t--;
		}

	}

}
