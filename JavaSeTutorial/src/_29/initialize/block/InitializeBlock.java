package _29.initialize.block;

public class InitializeBlock {
	
	static {
		System.out.println("static initialize block1");
	}
	
	static {
		System.out.println("static initialize block2");
	}
	
	{
		System.out.println("instance initialize block1");
	}
	
	{
		System.out.println("instance initialize block2");
	}
	InitializeBlock(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		InitializeBlock object=new InitializeBlock();
		InitializeBlock object2=new InitializeBlock();
		
	}

}

//static initialize block sinif yuklendiginde 1 kez calisir
//instance initialize block her obje olustugunda calisir