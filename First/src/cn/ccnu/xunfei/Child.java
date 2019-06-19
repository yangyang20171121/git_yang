package cn.ccnu.xunfei;

import java.util.Scanner;

public class Child {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 小朋友人数
		int[] h = new int[n];// 存储每个小朋友需要的巧克力重量的矩阵
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		int m = sc.nextInt();// 巧克力数
		int[] w = new int[m];// 每块巧克力重量sc
		for (int j = 0; j < w.length; j++) {
			w[j] = sc.nextInt();
		}

		sort(h);// 对小朋友需要的巧克力重量从小到大排序
		sort(w);
		int hStart = 0;
		int count = 0;
		for (int i = 0; i < w.length; i++) {
			if (w[i] < h[hStart]) {// 最小的重量小于小朋友需要的最小重量
				continue;
			} else {
				hStart++;// 满足w[j]>=h[i],给小朋友
				count++;
				if (hStart == n) {
					break;
				}
			}
		}
		System.out.println(count);
//		for (int i = 0; i < n; i++) {
//			System.out.print(h[i] + " ");
//		}
//		System.out.println("");
//		for (int i = 0; i < m; i++) {
//			System.out.print(w[i] + " ");
//		}
	}

	public static void sort(int[] num) {
		int len = num.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {
			int k = i;
			for (int j = i + 1; j < len; j++) {
				if (num[j] < num[k])
					k = j;
				if (k != i) {
					temp = num[i];
					num[i] = num[k];
					num[k] = temp;
				}
			}
		}
	}

}
