package cn.ccnu.thread1;

public class Ticket extends Thread {
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票：ticket="+ticket--);
			}
		}
	}

}
