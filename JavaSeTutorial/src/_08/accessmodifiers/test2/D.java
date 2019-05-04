package _08.accessmodifiers.test2;

import _08.accessmodifiers.test.B;

public class D {

	B b = new B();

	// b.defaultLevelInstanceVariable=20;
	// farkli pakette olduklari icin package level instance variable erisim
	// saglanamaz.

	// farkli pakette olduklari icin ayni default level gibi erisim saglanamaz.
	// b.protectedVariable=40;
}
