package cn.ccnu.xunfei;

import java.util.Scanner;

//第一行输入一个整数n，表示蚊子的个数1<=n<=100
//第二行三个整数，x0,x1,x2,分别代表矩形蚊帐的长宽高的值x0>=1,y0,z0<=1000
//接下来n行，分行三个数xi,yi,zi表示第i个蚊子的坐标 xi>=-10000,yi,zi<=10000
public class Flying {
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		String num[]=scanner.nextLine().split(" ");
		int n=Integer.parseInt(num[0]);
		String a[]=scanner.nextLine().split(" ");
		int x0=Integer.parseInt(a[0]);
		int y0=Integer.parseInt(a[1]);
		int z0=Integer.parseInt(a[2]);
//		String array[]=new String[n];
		int x[]=new int[n];
		int y[]=new int[n];
		int z[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			String array [] =scanner.nextLine().split(" ");
//			for(int j=0;j<n;j++){
			x[i]=Integer.parseInt(array[0]);
			y[i]=Integer.parseInt(array[1]);
			z[i]=Integer.parseInt(array[2]);
			
			if(x[i]<0 || y[i]<0 || z[i]<0){
					continue;		
			}
			if(x[i]<=x0 && y[i]<=y0 && z[i]<=z0){
				count++;
			}
//			}
		}
		
		System.out.println(count);

			
	}
	
}
