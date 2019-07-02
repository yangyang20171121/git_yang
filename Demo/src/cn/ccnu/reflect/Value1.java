package cn.ccnu.reflect;

class Value{
	public int i=15;
}
public class Value1 {
	public static void main(String[] args){
		Value1 v1=new Value1();
		v1.first();
	}
	public void first(){
		int i=5;
		Value v=new Value();
		v.i=25;
		second(v,i);
		System.out.println(v.i);
		
	}
	public void second(Value v,int i){
		i=0;
		v.i=20;
		Value val=new Value();
		v=val;
		System.out.println(v.i+" "+i);
	}

}
