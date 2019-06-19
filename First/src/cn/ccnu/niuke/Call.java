package cn.ccnu.niuke;

public class Call {
	String str=new String("hello");
	char[] ch={'a','b'};
	public static void main(String[] args){
		Call call=new Call();
		call.change(call.str, call.ch);
		System.out.print(call.str+" and ");
		System.out.print(call.ch);
	 	
	}
	public void change(String str,char ch[]){
		str="test ok";
		ch[0]='c';
	}

}
