package cn.ccnu.xunfei;
import java.util.Scanner;
public class QuickSort {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String [] nums=sc.nextLine().split(" ");
		int [] n=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			n[i]=Integer.parseInt(nums[i]);
		}
		//int [] n={48,62,35,77,55,14,35,98};
		kSort(n,0,n.length-1);
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
	}
	public static void kSort(int [] a,int low,int high){
		if(low<high){
			int m=sort(a,low,high);
			kSort(a,low,m-1);
			kSort(a,m+1,high);
		}
	}
	public static int sort(int [] a,int low ,int high){
		int temp=a[low];
		while(low<high){
			while(low<high && a[high]>=temp)
				high--;
			if(low<high){
			a[low]=a[high];
			low++;
			}
			while(low<high && a[low]<temp)
				low++;
			if(low <high){
			a[high]=a[low];
			high--;
			}
		}
		a[low]=temp;
		return low;
	}
}
