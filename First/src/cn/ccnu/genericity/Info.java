package cn.ccnu.genericity;

public class Info<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return this.var.toString();
	}
	

}
