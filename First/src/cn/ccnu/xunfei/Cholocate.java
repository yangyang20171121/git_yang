package cn.ccnu.xunfei;
import java.util.Scanner;
/**
 * 
 * 六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]
对于每个小朋友i，当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，
他才会上去表演节目。老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。
可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
 *第一行：n，表示h数组元素个数
 第二行：n个h数组元素
 第三行：m，表示w数组元素个数
 第四行：m个w数组元素
 输出：上台表演的学生人数
 */
public class Cholocate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h_index=0,count=0;
		int n=sc.nextInt();
		int [] h=new int[n];
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int [] w=new int[m];
		for(int i=0;i<m;i++){
			w[i]=sc.nextInt();
		}
		sort(h);
		sort(w);
		for(int i=0;i<m;i++){
			if(w[i]<h[h_index]){
				continue;
			}else{
				h_index++;
				count++;
				if(h_index==n){
					break;
				}
			}
		}
		System.out.println(count);
		
	}
	public static void sort(int [] a){
		int temp,k;
		for(int i=0;i<a.length-1;i++){
			k=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[k])
					k=j;
			}
			if(k!=i){
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
	}

}
