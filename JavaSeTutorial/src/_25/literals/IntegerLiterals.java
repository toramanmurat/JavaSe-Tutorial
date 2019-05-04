package _25.literals;

public class IntegerLiterals {

	public static void main(String[] args) {

		int age = 26; // 10'luk tabanda
		System.out.println(age);

//		octal->8'lik tabanda
//		0 ile baslariz
		int octal = 010;

		System.out.println(octal);

//		hexadecimal icin 0x yada 0X koyariz
		int a = 0xDead;

		System.out.println(a);

//		binary icin basina 0b koyariz

		int binary = 0b1110011;

		System.out.println(binary);

		System.out.println(Long.MAX_VALUE);
		long longVeriable = 10000000000000L;
		System.out.println(longVeriable);
	}
}
