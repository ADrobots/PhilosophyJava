package chapter21;

import java.util.concurrent.ThreadFactory;

public class DeamonThreadFactory implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(r);
		thread.setDaemon(true);
		
		return thread;
	}

}
