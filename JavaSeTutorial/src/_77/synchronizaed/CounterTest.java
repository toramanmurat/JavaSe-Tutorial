package _77.synchronizaed;

class Counter implements Runnable {

	int c;

	@Override
	public void run() {
		increment();
		decrement();

	}

//	synchronized anahtar kelimesi metod ve blocklar icin kullanilir

//	sadece bir thread bu metoda giris yapabilir.(synchronized) oldugu icin
//	baska bir thread giris yapamaz. diger thread block haline gecer
//	reca condition durumu ortadan kalkar.
	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

}

public class CounterTest {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread thread1 = new Thread(counter);
		Thread thread2 = new Thread(counter);

		thread1.start();
		thread2.start();

	}

}
//her thread farkli objeyi kullanirsa bu durumda synchronized metodlar birbirini bloc'lamaz!

//static synchronized metoda ayni anda sadece bir thread girebiliri !!!
