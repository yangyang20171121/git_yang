package cn.ccnu.xunfei;

public class TestStatic {
	private static int x=10;
	 private static Integer y = 10;

	    public static void updateX(int value) {
	        value = 3 * value;
	    }

	    public static void updateY(Integer value) {
	        value = 3 * value;
	    }

	    public static void main(String[] args) {
	        updateX(x);
	        updateY(y);
	        System.out.println(x);
	        System.out.println(y);
	        String s1 = "abc";
	        String s2 = "abc";
	        System.out.println(s1 == s2);

	        String s3 = new String("abc");
	        System.out.println(s1 == s3);
	        System.out.println(Test2.a);
	        
	    }
	 

}
