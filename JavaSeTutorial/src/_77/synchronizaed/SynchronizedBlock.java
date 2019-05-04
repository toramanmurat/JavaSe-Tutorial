package _77.synchronizaed;

public class SynchronizedBlock {
	
	public synchronized void test() {
		
		
	}
	
	public void test2() {
		
		synchronized (this) {
//			synchronized bloctur ve buraya sadece bir thread girebilir.
			
		}
	}
	
	public static void test3() {
		
		synchronized (SynchronizedBlock.class) {
			
		}
	}
	

}
