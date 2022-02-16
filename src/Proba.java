import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class ThreadClass{
	private InnerThread inner;
	
	private class InnerThread extends Thread{
		public InnerThread(String name) {
			super(name);
			start();
		}
		
	}
	
	public ThreadClass(String name) {
		inner=new InnerThread(name);
	}


}

public class Proba {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		
		Thread th=new Thread() {
			
			private synchronized void setT() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this+" ");
				}
			}
			public void run() {
				setT();
			};
		};
		
		Thread th1=th; 
		
		th.start();
		th1.start();

		
	}
	
	
}
