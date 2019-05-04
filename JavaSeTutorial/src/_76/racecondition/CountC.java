package _76.racecondition;

public class CountC {

	public static void main(String[] args) {
		CounterRunnable counterRunnable = new CounterRunnable();

		Thread thread1 = new Thread(counterRunnable);
		Thread thread2 = new Thread(counterRunnable);

		thread1.start();
		thread2.start();

		System.out.println(counterRunnable.value());

	}

}

class CounterRunnable implements Runnable {

	@Override
	public void run() {
		increment();
		decrement();
	}

	int c = 0;

	public void increment() {
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;
		c++;

	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}
