package cn.ccnu.thread1;

public class Join_Thread implements Runnable {
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}

}
