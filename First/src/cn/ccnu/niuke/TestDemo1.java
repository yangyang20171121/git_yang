package cn.ccnu.niuke;

public class TestDemo1 {
	public static String output="";
	public static void foo(int i){
		try{
			if(i==1){
				throw new Exception();
			}
		}catch(Exception e){
			output +="2";
			return ;//没有return ，结果是34234
		}finally{
			output+="3";
		}
		output +="4";
	}
	
	public static void main(String [] args){
		foo(0);
		foo(1);
		System.out.println(output);
	}

}
