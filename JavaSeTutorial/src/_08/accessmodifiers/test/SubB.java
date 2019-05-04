package _08.accessmodifiers.test;

public class SubB extends B {
	public static void main(String[] args) {
		SubB subB = new SubB();

		subB.defaultLevelInstanceVariable = 5;
		// subC.privateInstanceVariable=20;
		// private degiskenler kalitimla dahi asagiya miras gecmez.subclasslarda
		// visible/gorunur degildir.
		// derleme hatasi verir.
	}
}
