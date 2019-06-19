package cn.ccnu.xunfei;
import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    String[] str=sc.nextLine().split(" ");
    int n=Integer.parseInt(str[0]);
    int s=Integer.parseInt(str[1]);
    int[] f=new int[n];
    String[] num=sc.nextLine().split(" ");
    for(int i=0;i<num.length;i++){
        f[i]=Integer.parseInt(num[i]);
    }
    for(int i=0;i<n;i++){
    	System.out.print(f[i]+" ");
    }
    Arrays.sort(f);
    for(int i=0;i<n;i++){
    	System.out.print(f[i]+" ");
    }
    

}
}
