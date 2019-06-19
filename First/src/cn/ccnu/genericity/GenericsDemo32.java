package cn.ccnu.genericity;

public class GenericsDemo32 {
	public static void main(String args[]){
		//将Contact类型设置成泛型类型
		Person<Contact> per=new Person<Contact>(new Contact("北京市","01045521065","100088"));
		System.out.println(per);
		
		//将Introduction类型设置成泛型类型
		Person<Introduction> per1=new Person<Introduction>(new Introduction("洋洋","女",24));
		System.out.print(per1);
	}
}
