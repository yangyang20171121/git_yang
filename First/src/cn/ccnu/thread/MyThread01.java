package cn.ccnu.thread;

public class MyThread01 implements Runnable {
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			synchronized(this){
				if(ticket>0){
					try{
						Thread.sleep(300);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				System.out.println("卖票:ticket="+ticket--);
				}
			}
		}
	}
}
