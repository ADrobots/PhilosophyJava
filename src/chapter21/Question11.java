package chapter21;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Question11 {
	private int x;
	private int y;
	
	private void method() {
		++x;
		Thread.yield();
		++y;
	}
	
	public Boolean getCoordinates() {
		if(x==y) return true;
		return false;
	}

	public static void main(String[] args) {
		Question11 q11=new Question11();
		
		// TODO Auto-generated method stub
		new Thread("One thread") {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					q11.method();
					System.out.println(Thread.currentThread()+" "+q11.getCoordinates());
				}
				
			}
		}.start();
		
		new Thread("Two thread") {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					q11.method();
					System.out.println(Thread.currentThread()+" "+q11.getCoordinates());
				}
			}
		}.start();

	}
	
	

}


