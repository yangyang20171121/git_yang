package cn.ccnu.extend;

public class Student extends Person {
	private String school;
	public Student(){
		System.out.println("子类Student中的构造方法");
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}

}
