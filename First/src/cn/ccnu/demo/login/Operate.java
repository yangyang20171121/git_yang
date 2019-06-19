package cn.ccnu.demo.login;

public class Operate {
	private String info[];
	
	public Operate(String info[]){
		this.info=info;
	}
	public String login(){
		Check check=new Check();
		this.isExit();
		String name=this.info[0];
		String password=this.info[1];
		String str=null;
		if(check.validate(name, password)){
			str=name+"欢迎";
		}else{
			str="错误的用户名和密码!";
		}
		return str;
	}
	public void isExit(){
		if(this.info.length!=2){
			System.out.println("输入的参数不正确，系统退出！");
			System.out.println("格式：用户名 密码");
			System.exit(1);
		}
	}
}
