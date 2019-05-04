package _17.overloaded;

class Sum{
	
	public int getSum(int a,int b) {
		System.out.println("int int");
		return a+b;
	}
	
	public double getSum(double a,double b) {
		System.out.println("double double");
		return a+b;
	}
	
}

public class OverloadedTest {

	public static void main(String[] args) {
		Sum sum=new Sum();
		
		System.out.println(sum.getSum(10, 5));
		System.out.println(sum.getSum(1.2, 5.4));
		
	}
}
