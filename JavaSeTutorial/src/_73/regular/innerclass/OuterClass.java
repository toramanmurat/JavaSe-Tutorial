package _73.regular.innerclass;

public class OuterClass {

//	public,private,protected olabilir
	class RegularInnerClass {
//		private degiskenlerine ve metodlarina erisim saglayabilir
		void testMetod() {
			System.out.println(privateInstanceVeriable);
		}

	}

	private int privateInstanceVeriable = 50;

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();
		RegularInnerClass regularInnerClass = outerClass.new RegularInnerClass();

		OuterClass.RegularInnerClass regularInnerClass2 = new OuterClass().new RegularInnerClass();
	}

//	non-static oldugu icin ulasabiliri
	public void method() {
		RegularInnerClass regularObj = new RegularInnerClass();
		System.out.println(privateInstanceVeriable);
	}
}
