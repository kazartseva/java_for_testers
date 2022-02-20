package main.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("Misha");
		hello("Masha");
		
		
		double len = 5;
		System.out.println("площадь квадрата со стороной " + len + " равна " + area(len));
		
		
		double a = 4;
		double b = 5;
		System.out.println("площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
	}
	
	public static void hello(String somebody) {
		System.out.println("Hello, "+ somebody + "!");
	}
	
	public static double area (double l) {
		return l * l;
	}
	
	public static double area (double a, double b) {
		return a * b;
	}

}
