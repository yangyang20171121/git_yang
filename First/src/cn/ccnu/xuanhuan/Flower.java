package cn.ccnu.xuanhuan;

public class Flower {
	public static void main(String args[]){
		int x,y,z;
		int count=0;
		for(int i=100;i<=999;i++){
			x=i/100;
			y=i/10%10;
			z=i%10;
			if(x*x*x+y*y*y+z*z*z==i){
				count++;
				System.out.println("水仙花数_"+count+":"+i);
			}
		}
	}

}
