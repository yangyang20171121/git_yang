package cn.ccnu.thread;

public class MyThread02Demo {
	public static void main(String[] args){
		MyThread02 mt1=new MyThread02("Thread1");
		MyThread02 mt2=new MyThread02("Thread2");
		MyThread02 mt3=new MyThread02("Thread3");
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
