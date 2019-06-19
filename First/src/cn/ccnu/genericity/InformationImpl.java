package cn.ccnu.genericity;

public class InformationImpl<T> implements Information<T> {
	private T var;
	public InformationImpl(T var){
		this.setVar(var);
	}
	public void setVar(T var){
		this.var=var;
	}

	@Override
	public T getvar() {
		// TODO Auto-generated method stub
		return var;
	}
	

}
