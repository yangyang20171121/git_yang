package cn.ccnu.genericity;

public class Introduction implements Info01 {
	private String name;
	private String sex;
	private int age;
	public Introduction(String name,String sex,int age){
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "基本信息："+"\n"+"姓名："+this.name
				+"\n"+"性别:"+this.sex
				+"\n"+"年龄:"+this.age;
	}
	

}
