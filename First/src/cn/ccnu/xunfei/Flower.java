package cn.ccnu.xunfei;

import java.util.Scanner;

public class Flower {
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		int a,b,c,flag=0,count=0;
		String [] str = null;
		int [] m;
		int [] n;

		while(scanner.hasNextInt()){
		    str=scanner.nextLine().split(" ");
			count+=1;
			
		}
		m=new int[count];
		n=new int[count];
		for(int i=0;i<count;i++){
			m[i]=Integer.parseInt(str[0]);
			n[i]=Integer.parseInt(str[1]);
			System.out.println(m[i]);
			for(int j=m[i];j<=n[i];j++){
				a=j/100;
				b=j/10%10;
				c=j%10;
				if(a*a*a+b*b*b+c*c*c==i){
					System.out.print(i+"\t");
					flag=1;
				}else{
					continue;
				}			
			}
		}
		

//			for(int i=m;i<=n;i++){
//				a=i/100;
//				b=i/10%10;
//				c=i%10;
//				if(a*a*a+b*b*b+c*c*c==i){
//					System.out.print(i+"\t");
//					flag=1;
//				}
//				else{
//					continue;
//				}				
//			}
			if(flag==0){
				System.out.println("no");
			}

	}

}
