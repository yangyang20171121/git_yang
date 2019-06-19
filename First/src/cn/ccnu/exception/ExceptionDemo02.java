package cn.ccnu.exception;

public class ExceptionDemo02 {
	public static void main(String args[]){
		int i=10;
		int j=0;
		try{
			int temp=i/j;
			System.out.println("结果"+temp);
			System.out.println("--------------------------------");
		}catch(Exception e){//捕捉异常
			System.out.println("出现了异常:"+e);//出现异常执行异常处理语句
		}
		System.out.println("计算结束");
	}

}
