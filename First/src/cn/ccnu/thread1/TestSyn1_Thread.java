package cn.ccnu.thread1;

public class TestSyn1_Thread {
	public static void main(String args[]){
		Syn1_Thread st=new Syn1_Thread();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		Thread t3=new Thread(st);
		t1.start();
		t2.start();
		t3.start();
	}

}
