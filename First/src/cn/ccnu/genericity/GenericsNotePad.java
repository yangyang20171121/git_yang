package cn.ccnu.genericity;

public class GenericsNotePad {
	public static void main(String args[]){
		Notepad<String,Integer> n=new Notepad<String,Integer>();
		n.setKey("联想");
		n.setValue(4000);
		System.out.println("名称："+n.getKey());
		System.out.println("value："+n.getValue());
	}

}
