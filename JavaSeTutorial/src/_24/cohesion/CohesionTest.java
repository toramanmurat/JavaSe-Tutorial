package _24.cohesion;

public class CohesionTest {
	
	public int SumOfTwoNumbers(int a,int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		CohesionTest cohesionTest=new CohesionTest();
		System.out.println(cohesionTest.SumOfTwoNumbers(5, 9));
	}

}

//coupling siniflarin birbiriyle bagimliligi ile ilgilidir.
//cohesion sinifin nasil dizayn edildigi,metotlarin nasil oldugu ile ilgilidir.
