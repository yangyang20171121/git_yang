package cn.ccnu.xunfei;

import java.util.Scanner;

public class Bread {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 面包种类数
		sc.nextLine();
		String[] str = sc.nextLine().split(" ");
		int[] a = new int[n];// 面包价格数组
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		int m = sc.nextInt();// 购买的数量
		int[][] array = new int[m][2];// 种类/个数矩阵
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();

			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<2;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
			for (int j = 0; j < m; j++) {
				for (int i = 0; i < n; i++) {
				if (array[j][0] == (i+1)) {
					result += a[i] * array[j][1];
					
				}
			}

		}
		System.out.println(result);
	}

}
