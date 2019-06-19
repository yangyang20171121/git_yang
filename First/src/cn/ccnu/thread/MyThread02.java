package cn.ccnu.thread;

public class MyThread02 extends Thread {
	private String name;
	public MyThread02(String name){
		this.name=name;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread start:"+this.name+",i="+i);
		}
	}

}
