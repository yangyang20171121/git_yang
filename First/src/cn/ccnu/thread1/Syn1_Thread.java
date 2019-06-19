package cn.ccnu.thread1;

public class Syn1_Thread implements Runnable {
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			this.sale();
		}
	}
	public synchronized void sale(){
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
