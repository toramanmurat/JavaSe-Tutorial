package _71.generic.metods;

public class GenericMethodTest<A> {

//	method static ise <E> type parametresini tanimlamamiz lazim
	public static <E> void genericMethod(E[] myArray) {
		for (E element : myArray) {
			System.out.print(element + " ");
		}
	}

//	<A> tanimlamamiza gerek yok 
	public void nonStatic(A a) {

	}

	public static void main(String[] args) {
		Integer[] intArray = { 2, 36, 6, 645, 13, 1 };
		Double[] doubleArray = { 2.5, 2.8, 666.66, 5.1, 4.0 };
		String[] stringArray = { "test", "test1", "test12" };

		genericMethod(intArray);
		System.out.println();
		genericMethod(doubleArray);
		System.out.println();
		genericMethod(stringArray);

	}

}
