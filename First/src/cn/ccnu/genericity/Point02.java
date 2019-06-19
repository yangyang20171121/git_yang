package cn.ccnu.genericity;
//构造方法上运用泛型
public class Point02<T> {
	private T var;
	public Point02(T var){
		this.var=var;
	}
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var=var;
	}

}
