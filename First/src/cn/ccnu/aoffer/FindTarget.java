package cn.ccnu.aoffer;

import java.util.Scanner;

public class FindTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();
		}
		int target = sc.nextInt();

		// for(int i=0;i<n;i++){
		// for(int j=0;j<m;j++)
		// System.out.print(a[i][j]+" ");
		// System.out.println();
		// }
		// System.out.println(target);
		int low = 0, col = m - 1;
		while (low < n && col >= 0) {
			if (target < a[low][col]) {
				col--;
			} else if (target > a[low][col]) {
				low++;
			} else {
				System.out.println("a["+low+"]["+col+"]-->"+a[low][col]);
				return;
			}

		}
		System.out.println("Not find");
		

	}

}
