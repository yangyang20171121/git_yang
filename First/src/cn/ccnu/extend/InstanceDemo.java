package cn.ccnu.extend;

public class InstanceDemo {
	public static void main(String args[]){
		Student stu=new Student();
		stu.setName("张三");
		stu.setAge(30);
		stu.setSchool("清华大学");
		System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",学校："+stu.getSchool());
	}

}
