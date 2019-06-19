package cn.ccnu.thread1;

public class Test {
	public static void main(String args[]){
		Thread t = new Thread() {
	        public void run() {
	            pong();
	        }
	    };
	    t.run();
	    System.out.print("ping");
	}
	static void pong(){
		System.out.println("pong");
	}

}
