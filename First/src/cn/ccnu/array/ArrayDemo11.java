package cn.ccnu.array;
//查询一个数字是否存在于数组元素中
public class ArrayDemo11 {
	
	public static void main(String args[]){
		int a[]={1,2,3,4,5,9};
		int b=5;
		boolean flag=find(a,b);
		if(flag)
			System.out.println(b+"存在于该数组中");
		else
			System.out.println(b+"不在该数组中");
	}
	public static boolean find(int x[],int a){
		for(int i=0;i<x.length;i++){
			if(a==x[i])
				return true;
		}
		return false;
	}

}
