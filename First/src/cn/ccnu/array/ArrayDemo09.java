package cn.ccnu.array;
//去掉数组元素 中的零元素，存入新的数组并输出
public class ArrayDemo09 {
	public static void main(String args[]){
		int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int b[]=newArr(a);
		for(int i:b){
			System.out.print(i+"、");
		}
	}
	public static int[] newArr(int x[]){
		int b[];
		int j=0,q=0;
		for(int i=0;i<x.length;i++){
			if(x[i]!=0){
				j++;
			}				
		}
		b=new int [j];
		for(int i=0;i<x.length;i++){
			if(x[i]!=0){
				b[q]=x[i];
				q++;
			}
		}
		return b;
	}

}
