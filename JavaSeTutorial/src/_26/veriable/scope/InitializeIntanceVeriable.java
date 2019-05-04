package _26.veriable.scope;

public class InitializeIntanceVeriable {

	int i;
	byte b;
	boolean bool;
	char c;
	short s;
	long l;
	float f;
	double d;
	String str;
	Object o;

	public static void main(String[] args) {
		InitializeIntanceVeriable object = new InitializeIntanceVeriable();

		System.out.println(object);

	}

	@Override
	public String toString() {
		return "InitializeIntanceVeriable [i=" + i + ", b=" + b + ", bool=" + bool + ", c=" + c + ", s=" + s + ", l="
				+ l + ", f=" + f + ", d=" + d + ", str=" + str + ", o=" + o + "]";
	}
	
	

	

	
}
