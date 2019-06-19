package cn.ccnu.thread1;

public class Alive implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
		
	}
	

}
