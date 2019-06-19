package cn.ccnu.xunfei;

public class Test1 {
	public static void main(String [] args){
		int num=17;
		while(num>0){
			System.out.print(num++%5+"\t");
			num/=5;
		}
	}

}
