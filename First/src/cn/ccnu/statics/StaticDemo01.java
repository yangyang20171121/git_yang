package cn.ccnu.statics;

public class StaticDemo01 {
	
	
	public static void main(String [] args){
		int count=0;
		for(int i=1;i<=1000;i++){
			if(i%5!=0 && i%6!=0 && i%8!=0){
				count++;
			}
		}
		System.out.println(count);
	}

}
