package cn.ccnu.array;

public class ArrayRefDemo03 {
	public static void main(String args[]){
		int score[]={67,89,87,69,90,100,75,90};
		int age[]={31,30,18,17,8,9,1,39};
		System.out.println("排序并输出score[]数组");
		sort(score);
		print(score);
		
		sort(age);
		print(age);
	}
	public static void sort(int x[]){
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[j]<x[i]){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	}
	public static void print(int temp[]){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");
		}
	}

}
