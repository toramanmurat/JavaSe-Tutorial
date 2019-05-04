package _20.returntype;

public class ReturnType {

	public Integer returnInt() {
		return null;
	}

	public String returnString() {
		return null;
	}

	public int[] returnArray() {
		return null;
	}

	public int returnPrimite() {
//		return null;
		return 0;
	}
	
	public static int returnInt2() {
		float f=0.25f;
		return (int)f;
	}
	
	public static void main(String[] args) {
		System.out.println(returnInt2());
	}
}

//1- Metodumuz icin Reference type donus tipi soz konusu oldugunda null donebilir.
//primitive tipler disindaki butun tipler refererence tiptir.

//2 - primitive tipler icin return null diyemeyiz!
