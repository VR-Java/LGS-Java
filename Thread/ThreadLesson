package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
//	private int count;
//	
//	private Object lock = new Object();
//	
//	public void increment() {
//		synchronized (lock) {
//			count++;
//		}
//	}
//
//	public int getCount() {
//		return count;
//	}
	
	
	private AtomicInteger i = new AtomicInteger(0);
	
	public void increment() {
			i.incrementAndGet();
	}

	public int getCount() {
		return i.intValue();
	}
	
	
}







package thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread() {
			public void run() {
				
				for (int i = 0; i < 300000; i++) {
					c.increment();
				}
				
			}
		};
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 300000; i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());
	}

}






_____________________________________________________________________________________




package thread2;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		String id = UUID.randomUUID().toString();
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(id);
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return id;
	}

}









package thread2;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable{

	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {
			System.out.println(name + " is working " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}








package thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {

		
		ExecutorService executor = Executors.newFixedThreadPool(2); // quantity of tasks allowed to run in parallel
		
		Future<String> f = executor.submit(new MyCallable());
		executor.submit(new MyCallable());
		executor.submit(new MyRunnable("1"));
		executor.submit(new MyRunnable("2"));
		executor.submit(new MyRunnable("3"));
		executor.shutdown();
		
//		System.out.println(f.get());
	}

}
