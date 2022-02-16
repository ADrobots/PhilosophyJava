package chapter21;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeamoFromFactory implements Runnable{

	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupt()");
		}
	}
	
	public static void main(String[] args) {
		Executor exec=Executors.newCachedThreadPool(new DeamonThreadFactory());
		for(int i=0; i<10; i++) {
			exec.execute(new DeamoFromFactory());
		}
		
		System.out.println("All deamon thread");
		try {
			TimeUnit.MILLISECONDS.sleep(175);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
