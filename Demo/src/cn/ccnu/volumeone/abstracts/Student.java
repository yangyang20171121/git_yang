package cn.ccnu.volumeone.abstracts;

public class Student extends Person {
	private String major;

	public Student(String name,String major) {
		super(name);
		this.major=major;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a student majoring in "+major;
	}

}
