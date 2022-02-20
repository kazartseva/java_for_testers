package main.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("Misha");
		hello("Masha");
		
		
		Square s = new Square(5);
		System.out.println("площадь квадрата со стороной " + s.l + " равна " + s.area());
		
		Rectangle r = new Rectangle(4,5);
		System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}
	
	public static void hello(String somebody) {
		System.out.println("Hello, "+ somebody + "!");
	}

}
