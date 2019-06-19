package cn.ccnu.abstracts;

public class AbstractCaseDemo02 {
	public static void main(String args[]){
		Person per1=null;
		Person per2=null;
		per1=new Student("yangyang",20,99.0f);
		per2=new Worker("xiaowen",25,10000.0f);
		per1.say();
		per2.say();
				
	}

}
