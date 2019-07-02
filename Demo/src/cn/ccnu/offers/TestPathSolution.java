package cn.ccnu.offers;
import java.util.Scanner;
/*
 * @author Administrator
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，
 * 但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 *
 */
public class TestPathSolution {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int m=Integer.parseInt(str[0]);//矩阵的行
		int n=Integer.parseInt(str[1]);//矩阵的列
		char[][] matrix=new char[m][n];
		//s母串
		String s = sc.nextLine();
		//Scanner没有直接读取字符的方法,通过以下方式转换
		char[] ch = s.toCharArray(); 
		//母串转化为二维字符数组
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				matrix[i][j]=ch[i*n+j];		
		}//母串也可以不用二维数组存，就用一维字符数组ch存也是可以的，对应的方法中的参数修改
		
		//s1子串
		String s1 = sc.nextLine();
		char[] ch1 = s1.toCharArray(); 
//		for(int i=0;i<ch.length;i++)
//			System.out.println(ch[i]);
//		for(int i=0;i<ch1.length;i++)
//			System.out.println(ch1[i]);
		PathSolution path=new PathSolution();
		boolean flag=path.hasPath(matrix, m, n, ch1);
		System.out.println(flag);
	}

}
