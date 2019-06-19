package cn.ccnu.xunfei;

public class Test3 {
	public static int getValue(){
		try{
			return 0;
		}finally{
			return 1;
		}
	}
	public static void main(String[] args){
		System.out.println("return value of getValue():"+getValue());
	}

}
