package cn.ccnu.demo.login;

public class Check {
	public boolean validate(String name,String password){
		if(name.equals("yangyang")&&password.equals("ccnu")){
			return true;			
		}else{
			return false;
		}
	}
}
