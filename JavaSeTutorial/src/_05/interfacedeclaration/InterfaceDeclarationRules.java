package _05.interfacedeclaration;

public class InterfaceDeclarationRules {

}

//1- bir interface/arabirimin tum metotlari abstractir. yani suslu parentez {} kullanilmaz.

//bir interface'si  uygulayan sinif bu kontrata uymalidir(abstract metotlari override etmelidir.)

//Java8 ozelligi ; interfaceler default anahtar kelimesiyle govdeli metotlara sahip olabiliyor! 
//static metotlara da sahip olabiliyor.

//2-bir interface in degiskenleri aslinda sabittir. public static final ozelligi gosterir.

//3-javada bir sinifbir sinifi kalitabilir. bir sinif birden fazla interface i uygulayabilir.
//4-javada bir arabirim birden fazla arabirimi Kalitabilir fakat bir arabirim bir arabirimi uygulamayaz.

interface A {
}

interface B {
}

interface C extends A, B {
}

class D implements A, B {
}

class E {
}

//Bir sinif sadece bir sinifi kalitabilir.
//class F extends D,E{} 
//
//bir arabirim bir arabirimi uygulayamaz
//interface G implements A{}
