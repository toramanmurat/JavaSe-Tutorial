package _75.anonymous.innerclass;

class Keyboard {

	public void write() {
		System.out.println("keyboard write .");
	}
}

public class Computer {

	Keyboard keyboard = new Keyboard() {

		public void write() {
			System.out.println("inner class write .");
		}

	};

	Keyboard keyboard2 = new Keyboard();

	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.keyboard.write();
		computer.keyboard2.write();
	}

}
