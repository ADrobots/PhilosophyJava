package chapter21;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e) {
			System.out.println("sleep() interrupt");
		}
	}
	
	public static void main(String ... args) {
		Thread threadDeamon=new Thread(new SimpleDeamons());
		threadDeamon.setDaemon(true);
		threadDeamon.start();
		
		System.out.println("All deamons");
		try {
			TimeUnit.MILLISECONDS.sleep(1750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
