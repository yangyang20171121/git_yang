package cn.ccnu.volumeone;

public class ParanTest {
	public static void main(String [] args){
		//test1
		//试图将值参数的值提高两倍，但没有成功
		System.out.println("test tripleValue");
		double percent=10;
		System.out.println("before:percent="+percent);
		tripleValue(percent);
		System.out.println("after:percent:"+percent);
		
		//test2
		//员工工资被修改，通过对象引用的拷贝修改所引用的对象状态
		System.out.println("test tripleSalary");
		Employee harry =new Employee("Harry",5000);
		System.out.println("before:salary="+harry.getSalary());
		tripleSalary(harry);
		System.out.println("after:salary="+harry.getSalary());
		
		//test3
		//参数变量x,y交换了，但是变量a,b没有受到影响
		System.out.println("test swap");
		Employee a=new Employee("Alice",7000);
		Employee b=new Employee("Bob",6000);
		System.out.println("before:a="+a.getName());
		System.out.println("before:b=="+b.getName());
		swap(a,b);
		System.out.println("after:a="+a.getName());
		System.out.println("after:b="+b.getName());
	}
	public static void tripleValue(double x){
		x=3*x;
		System.out.println("End of method:x="+x);
	}
	public static void tripleSalary(Employee x){
		x.raiseSalary(200);
		System.out.println("End of method:salary="+x.getSalary());
	}
	public static void swap(Employee x,Employee y){
		Employee temp=x;
		x=y;
		y=temp;
		System.out.println("End of method:x="+x.getName());
		System.out.println("End of method:y="+y.getName());
	}

}
