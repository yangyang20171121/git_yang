package cn.ccnu.xunfei;
import java.util.Scanner;
public class FH_Bubble1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String [] str=sc.nextLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int t=Integer.parseInt(str[1]);
		int[] flag=new int[n];
		int[] flag1=new int[n];
		for(int i=0;i<n;i++){
			flag[i]=sc.nextInt();			
		}
		flag1=flag;

		for(int i=0;i<t;i++){
			
			for(int j=0;j<n;j++){
				
				int k=j;
				if(k==0){
					if(flag[k+1]==1)
						flag1[k]=getFlag(flag[k]);
				}else if(k==n-1){
					if(flag[k-1]==1)
						flag1[k]=getFlag(flag[k]);
				}else {
					if((flag[k-1]==1) || (flag[k+1]==1))
						flag1[k]=getFlag(flag[k]);
				}
			}
			flag=flag1;
			
		}
		for(int i=0;i<n;i++){
			System.out.print(flag[i]+" ");
		}
	}
	public static int getFlag(int flag){
		if(flag==1)
			return 0;
		else
			return 1;
	}

}
