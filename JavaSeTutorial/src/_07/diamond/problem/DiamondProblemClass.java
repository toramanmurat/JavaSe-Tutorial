package _07.diamond.problem;

public class DiamondProblemClass implements DiamondInterface, DiamondInterface2 {
	public void diamondProblem() {
		System.out.println("diamond problem fix");
		// override etmezsek derleme hatasi verir.
	}

}
//hem DiamondInterface hem de DiamondInterface2 ayni isimli "default" metoda sahip.
//bu durumda default metodu burada override etmemiz gereklidir.