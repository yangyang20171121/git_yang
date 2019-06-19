package cn.ccnu.thread1;

import java.util.Random;

import org.junit.Test;

public class TestDemo {
	
	@Test
	public void ThreadDemo01(){
		MyThread mt1=new MyThread("线程A");
		MyThread mt2=new MyThread("线程B");
		mt1.run();
		mt2.run();//直接调用run()方法，线程并没有正确启动
	}
	
	@Test
	public void ThreadDemo02(){
		//调用从Thread类中继承而来的start()方法
		MyThread mt1=new MyThread("线程A");
		MyThread mt2=new MyThread("线程B");
		mt1.start();
		mt2.start();
	}
	@Test
	public void RunnableDemo01(){
		//实现Runnable接口
		MyThread my1=new MyThread("线程A");
		MyThread my2=new MyThread("线程B");
		//还是要通过Thread来启动线程
		Thread t1=new Thread(my1);
		Thread t2=new Thread(my2);
		t1.start();
		t2.start();
	}
	@Test
	public void ThreadDemo04(){
		//继承Thread类，资源不共享
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Test
	public void testTicket_r(){
		Ticket_r t1=new Ticket_r();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();//启动三个线程
	}
	@Test
	public void testAlive(){
		Alive a=new Alive();
		Thread t=new Thread(a,"线程");
		System.out.println("线程开始执行之前-->"+t.isAlive());
		t.start();
		System.out.println("线程开始执行之后-->"+t.isAlive());
		for(int i=0;i<3;i++){
			System.out.println("main运行-->"+i);
		}
		System.out.println("代码执行之后-->"+t.isAlive());	
	}
	@Test	
	public void Join_ThreadDemo(){
		Join_Thread jt=new Join_Thread();
		Thread t=new Thread(jt,"线程");
		t.start();
		for(int i=0;i<50;i++){
			if(i>10){
				try{
					t.join();
				}catch(Exception e){
					
				}
			}
			System.out.println("Main线程运行-->"+i);
		}
				
	}
	@Test
	public void Yield_ThreadDemo(){
		Yield_Thread yt=new Yield_Thread();
		Thread t1=new Thread(yt,"线程A");
		Thread t2=new Thread(yt,"线程B");
		t1.start();
		t2.start();
	}
	
	@Test//控制台没内容
	public void Syn_ThreadDemo(){
		Syn_Thread st=new Syn_Thread();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		Thread t3=new Thread(st);
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Test//控制台无内容
	public void Syn1_ThreadDemo(){
		Syn1_Thread st1=new Syn1_Thread();
		Thread t1=new Thread(st1);
		Thread t2=new Thread(st1);
		Thread t3=new Thread(st1);
		t1.start();
		t2.start();
		t3.start();
	}
	@Test
	public void random_test(){
		Random r=new Random();
		for(int i=0;i<5;i++){
			System.out.println(r.nextInt(30));
		}
	}
}
