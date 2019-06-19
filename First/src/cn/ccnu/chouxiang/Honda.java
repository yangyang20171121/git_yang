package cn.ccnu.chouxiang;

public class Honda extends Bike {

	@Override
	void run() {
		System.out.println("running safely...");		
	}
	public static void main(String args[]){
		Bike b1=new Honda();
		b1.run();
	}

}
