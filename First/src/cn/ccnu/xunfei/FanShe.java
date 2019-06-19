package cn.ccnu.xunfei;

import java.util.Date;

public class FanShe extends Date {
	private static final long serialVersionUID=1L;
	private void test(){
		System.out.println(super.getClass().getName());
	}
	public static void main(String[] args){
		new FanShe().test();
		
	}

}
