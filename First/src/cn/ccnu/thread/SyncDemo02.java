package cn.ccnu.thread;

public class SyncDemo02 {
	public static void main(String args[]){
		MyThread01 mt=new MyThread01();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
