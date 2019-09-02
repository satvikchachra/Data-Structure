package Github;

import java.util.Scanner;

public class alexGoesShopping {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int t = scn.nextInt();
		int c = 0;
		for (int i = 0; i < t; i++) {
			int money = scn.nextInt();
			int quan = scn.nextInt();
			c = 0;
			for (int j = 0; j < n; j++) {
				if (money % arr[j] == 0) {
					c++;
				}
			}
			if (quan <= c) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
