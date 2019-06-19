package cn.ccnu.thread1;

public class Syn_Thread implements Runnable {
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			synchronized(this){//为同步代码块指定一个同步对象
				if(ticket>0){
					try{
						Thread.sleep(300);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("卖票:ticket"+ ticket--);
				}
			}
		}
	}
}
