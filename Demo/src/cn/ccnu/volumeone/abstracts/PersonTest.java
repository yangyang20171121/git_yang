package cn.ccnu.volumeone.abstracts;

public class PersonTest {
	public static void main(String[] args){
		Person[] person=new Person[2];
		person[0]=new Employee("Harry Hacker",5000,1989,10,1);
		person[1]=new Student("Maria Morris","computer science");
		for(Person p:person){
			System.out.println(p.getName()+","+p.getDescription());
		}
	}

}
