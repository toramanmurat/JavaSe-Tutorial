package _10.veriable.declaration;

public class ArrayDeclaration {

	int number;

	int[] numbers;
	// tipi int degildir , elemanlari int tipindedir. tipi int[]

	int[][] matrix;
	// tipi int[][] , elemanlari int[]

	// conventiona standarda uygun olan degisken isminden once koseli parantezleri
	// kullanmaktir.
	int[][] convention;
	int badConvention[][];

}

//bir array ayni tipte degiskenleri tutan bir yapidir.
//bir array primitive elemanlar ya da objee type elemanlar tutabilir. Dizinin kendidi objedir.
//dolayisiyla heapte yasarlar.