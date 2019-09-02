package Github;

import java.util.Scanner;

public class maxSumPathInTwoArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int arr[] = new int[n1];
			int brr[] = new int[n2];
			for (int i = 0; i < n1; i++) {
				arr[i] = scn.nextInt();
			}
			for (int i = 0; i < n2; i++) {
				brr[i] = scn.nextInt();
			}
			int i = 0, j = 0, one = 0, two = 0, sum = 0;
			while (i < n1 && j < n2) {
				if (arr[i] > brr[j]) {
					two += brr[j];
					j++;
				} else if (arr[i] < brr[j]) {
					one += arr[i];
					i++;
				} else {
					int max = Math.max(one, two);
					sum += max + arr[i];
					one = 0;
					two = 0;
					i++;
					j++;
				}
			}

			while (i < n1) {
				one += arr[i];
				i++;
			}
			while (j < n2) {
				two += brr[j];
				j++;
			}
			sum+=Math.max(one, two);
			System.out.println(sum);
			t--;
		}

	}

}
