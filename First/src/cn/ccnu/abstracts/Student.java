package cn.ccnu.abstracts;

public class Student extends Person {
	private float score;

	public Student(String name, int age,float score) {
		super(name, age);
		this.score=score;
	}

	@Override
	public String getContent() {
		return "学生信息-->姓名："+super.getName()+
				";年龄："+super.getAge()+";成绩："+this.score;
	}

}
