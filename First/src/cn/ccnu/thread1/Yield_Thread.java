package cn.ccnu.thread1;

public class Yield_Thread implements Runnable {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
			if(i==3){
				System.out.println("线程礼让:");
				Thread.currentThread().yield();
			}
		}		
	}

}
