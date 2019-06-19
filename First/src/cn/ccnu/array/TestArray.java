package cn.ccnu.array;

public class TestArray {
	public static void main(String[] args){
		char[] copyFrom={'a','b','c','d','e','f','g','h','i'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		System.out.println(copyTo);//Object src, int srcPos,Object dest, int destPos, int length  
	}

}
