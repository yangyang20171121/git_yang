package cn.ccnu.xuanhuan;
//1!+2!+...+20!
public class Product {
	public static void main(String args[]){
		int sum=0;
		double product;
		for(int i=1;i<=20;i++){
			product=1;
			for(int j=1;j<=i;j++)
				product*=j;
			sum+=product;
		}
		System.out.println("1!+2!+...+20!="+sum);
		}
}
