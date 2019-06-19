package cn.ccnu.array;
//求数组元素的和、最大值、最小值
public class ArrayDemo10 {
	public static void main(String args[]){
		int sum=0;
		int a[]={67,89,87,69,90,100,75,90};
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			}
		System.out.println("数组元素之和:"+sum);
		System.out.println("数组元素中的最大值:"+max);
		System.out.println("数组元素中的最小值:"+min);
		
	}
	}


