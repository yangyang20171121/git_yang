package cn.ccnu.xunfei;

import java.util.Scanner;
//1.输入一行四个整数n,m,x,k。n代表批改份数，m批改一份获得的钱，
//x表示改错一份扣掉的钱，k表示正确时，复查的钱，当改错一份扣掉x元时可以免去一份正确时的复查费
//2.第二行输入n个整数，由0和1组成，0代表错误，1代表正确
//3.输出小明批改试卷应得的钱
public class HomeWork {
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		String [] input=scanner.nextLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		int x=Integer.parseInt(input[2]);
		int k=Integer.parseInt(input[3]);
		int f=0;//错误的份数
		int t=0;//正确的份数
		int c=0;//钱
		
		String [] num=scanner.nextLine().split(" ");
		for(int i=0;i<num.length;i++){
			if(num[i].equals("0")){
				f++;
			}
			else{
			t++;
			}
		}
		if(f>=t)
		{
			c=f*(m-x)+t*m;
		}
		else{
		c=f*(m-x)+f*m+(t-f)*(m-k);
		}
		System.out.println(c);
		
		
		
	}

}
