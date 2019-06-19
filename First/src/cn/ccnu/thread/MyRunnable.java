package cn.ccnu.thread;

public class MyRunnable implements Runnable {
	private String name;
	public MyRunnable(String name){
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Thread start:"+this.name+",i="+i);
		}
		
	}

}
