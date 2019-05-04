package _40checkedanduncheckedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlerOrDeclareRule {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("deneme");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		FileNotFoundException bir checked exception'dir. Ya handle ya da declare yapmamiz lazim
		
//		unchekced exception icin hata vermez.(NullPointerException)
	}
}

//check ve unchecked olarak 2 ye ayrilir.
//runtimeexception ve butun errorlar uncheck exception'dur
