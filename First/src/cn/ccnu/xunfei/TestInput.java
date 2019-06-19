package cn.ccnu.xunfei;

import java.util.Scanner;

public class TestInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String[] str=sc.nextLine().split(" ");
		// int x=Integer.parseInt(str[0]);
		// int f=Integer.parseInt(str[1]);
		// int d=Integer.parseInt(str[2]);
		// int p=Integer.parseInt(str[3]);

		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			long result=series(num[i])%32767;
			System.out.println(result);
		}
		
		
	}
	public static long series(long index){
        if(index==1){
            return 1;
        }else if(index==2){
            return 2;
        }else{
            return 2*series(index-1)+series(index-2);
        }
    }

}
