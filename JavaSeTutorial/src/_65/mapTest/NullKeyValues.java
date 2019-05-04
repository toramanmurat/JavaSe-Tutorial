package _65.mapTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NullKeyValues {

	public static void main(String[] args) {

		Map hashMap = new HashMap();
		hashMap.put(null, null);
//		hashmap null key ve null value izin verir

		Map hashTable = new Hashtable();
		hashTable.put(null, null);
		// java.lang.NullPointerException

		// Hashtable null key ya da null value eklenmesine izin vermez.
		// calisma zamanminda exception atar
	}

}
