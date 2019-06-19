package cn.ccnu.thread1;

public class MyThread_runnable {
	private String name;
	public MyThread_runnable(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行,i="+i);
		}
	}

}
