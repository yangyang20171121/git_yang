package cn.ccnu.array;

public class ArrayDemo08 {
	public static void main(String args[]){
		int x[]={1,2,3,4,4,5,6,32,43,12,24,65};
		int b[]=count(x);
		System.out.println("偶数个数："+b[0]);
		System.out.println("奇数个数："+b[1]);
	}
	public static int[] count(int a[]){
		int b[]={0,0};
//		int even_number=0;
//		int odd_number=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
				b[0]++;
			else
				b[1]++;
		}
		return b;
		
	}

}
