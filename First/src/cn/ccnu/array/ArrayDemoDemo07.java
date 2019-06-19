package cn.ccnu.array;

public class ArrayDemoDemo07 {
	public static void main(String args[]){
		long sum=0L;
		for(int i=1;i<=20;i++){
		int a=JieCheng(i);
		sum+=a;
		}
		System.out.println(sum);
	}
	public static int JieCheng(int i){
		if(i==1 || i==0)
			return 1;
		else
			return i*JieCheng(i-1);
	}

}
