package main.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("Misha");
		hello("Masha");
		
		
		Square s = new Square(5);
		System.out.println("площадь квадрата со стороной " + s.l + " равна " + area(s));
		
		Rectangle r = new Rectangle(4,5);
		System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}
	
	public static void hello(String somebody) {
		System.out.println("Hello, "+ somebody + "!");
	}
	
	public static double area (Square s) {
		return s.l * s.l;
	}
	
	public static double area (Rectangle r) {
		return r.a * r.b;
	}
	

}
