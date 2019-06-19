package cn.ccnu.genericity;

public class GenericsDemo01 {
	public static void main(String args[]){
		Point p=new Point();
		//整数
//		p.setX(10);
//		p.setY(20);
		
//		int x=(Integer) p.getX();
//		int y=(Integer)p.getY();
//		System.out.println("整数表示，X坐标为:"+x);
//		System.out.println("整数表示，Y坐标为:"+y);
		//小数表示
//		p.setX(10.5f);
//		p.setY(20.6F);
//		float x=(Float) p.getX();
//		float y=(Float) p.getY();
//		System.out.println("小数表示，X坐标为:"+x);
//		System.out.println("小数表示，Y坐标为:"+y);
		//使用字符串
		p.setX("东经180度");
		p.setY("北纬210度");
		String x=(String) p.getX();
		String y=(String) p.getY();
		System.out.println("字符串表示，X坐标为:"+x);
		System.out.println("字符串表示，Y坐标为:"+y);
	}

}
