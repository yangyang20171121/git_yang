package cn.ccnu.offers;

public class PathSolution {
	public boolean hasPath(char[][] matrix, int rows, int cols, char[] str) {
		boolean[] flag = new boolean[rows * cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (judge(matrix, rows, cols, i, j, str, 0, flag)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean judge(char[][] matrix, int rows, int cols, int row, int col,
			char[] str, int k, boolean[] flag) {
		int i = row * cols + col;
		if (row < 0 || row >= rows || col < 0 || col >= cols
				|| matrix[row][col] != str[k] || flag[i])
			return false;
		if (k == str.length - 1)
			return true;
		flag[i] = true;
		if (judge(matrix, rows, cols, row - 1, col, str, k + 1, flag)
				|| judge(matrix, rows, cols, row + 1, col, str, k + 1, flag)
				|| judge(matrix, rows, cols, row , col-1, str, k + 1, flag)
				|| judge(matrix, rows, cols, row, col+1, str, k + 1, flag)) {
			return true;
		}
		flag[i]=false;

		return false;
	}
}
