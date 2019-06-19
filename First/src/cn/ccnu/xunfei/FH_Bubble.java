package cn.ccnu.xunfei;

import java.util.Scanner;

public class FH_Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int t = Integer.parseInt(str[1]);
		int[] a = new int[n];
		boolean[] flag = new boolean[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		flag = getFlag(a, flag);
		for (int i = 0; i < t; i++) {
			
			for (int j = 0; j < n; j++) {
				
				int k = j;
				if (k == 0) {
					if (flag[k + 1])
						a[k] = change(a[k]);
				} else if (k == n - 1) {
					if (flag[k - 1])
						a[k] = change(a[k]);
				} else {
					if (flag[k - 1] || flag[k + 1])
						a[k] = change(a[k]);
				}

			}
			flag = getFlag(a, flag);
			
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int change(int a) {
		if (a == 1)
			return 0;
		else
			return 1;
	}

	public static boolean[] getFlag(int[] a, boolean[] flag) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1)
				flag[i] = true;
			else
				flag[i] = false;
		}
		return flag;
	}

}
