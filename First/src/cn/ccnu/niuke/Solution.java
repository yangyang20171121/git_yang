package cn.ccnu.niuke;

public class Solution {
	public static int[] BubbleSort(int[] arr){
		boolean flag = true;
		int temp;
		while(flag){
			for(int i=0;i<arr.length-1;i++){
				flag=false;
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
						temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
						flag=true;
				}
			}
		}
	}
		return arr;

}
	public static void main(String[] args){
		int[] arr={1,2,3,2,2,2,5,4,2};
		arr=BubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
