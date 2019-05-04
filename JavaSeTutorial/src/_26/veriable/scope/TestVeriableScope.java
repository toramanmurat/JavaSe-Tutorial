package _26.veriable.scope;

public class TestVeriableScope {
	
	static int count=20;
	String str;
	
	{
		str="test";
	}
	
	TestVeriableScope(){
		count++;
	}
	
	void method() {
		
		int k=10;
		
		for(int i=0;i<5;i++) {
			System.out.println(i + " " + k);
			
			
		}
	}

}

//  static degiskenler en genis scope a sahiptir.
//  
//  instance variable'lar obje olusunca olusurlar 
//  
//  local veriable suslu parantez arasinda yasarlar
//	local degiskenlere baska metottan erisemeyiz
