package cn.ccnu.xunfei;

public class PascalTriangles {
	public static void main(String[] args) {
		System.out.println("打印的杨辉三角如下：");
		print();
	}

	public static void print() {
		int[][] a = new int[6][6];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
		}
		for (int i = 0; i < a.length; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
