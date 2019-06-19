package cn.ccnu.thread;

public class ThreadDemo01 {
	public static void main(String args[]){
		MyThread mt1=new MyThread("线程A");
		MyThread mt2=new MyThread("线程B");
//		mt1.run(); //不能正确的启动进程
//		mt2.run();
		mt1.start();
		mt2.start();
	}

}
