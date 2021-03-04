package core.helper;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Class is used to keep tarck of number of object created by IOC*/

public class IOCObjectTracer {
	private static AtomicInteger tarck = new AtomicInteger(0);
	
	public static void increment() {
		tarck.incrementAndGet();
	}
	                       
	public static int getCount() {
		return tarck.get();
	}
	
}
