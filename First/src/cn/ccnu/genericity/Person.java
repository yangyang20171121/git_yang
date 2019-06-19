package cn.ccnu.genericity;

public class Person<T extends Info01> {
	private T info;
	public Person(T info){
		this.setInfo(info);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	public String toString(){
		return this.info.toString();
	}
	

}
