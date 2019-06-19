package cn.ccnu.aoffer;
import java.util.Scanner;
public class Repetition {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String [] str=sc.nextLine().split(" ");
		
		int[] n=new int[str.length];
		for(int i=0;i<str.length;i++){
			n[i]=Integer.parseInt(str[i]);
		}
		for(int i=0;i<n.length;i++){
			int temp;
			while(n[i]!=i){
				if(n[i]==n[n[i]]){
					System.out.println(n[n[i]]);
					break;
				}
					
				temp=n[i];
				n[i]=n[temp];
				n[temp]=temp;				
			}
			
				
		}
		
	}

}
