package lab1;

public class UseCircle {

	public static void main(String[] args){
		
		Circle c1 = new Circle(10,10,10);
		
		Circle c2 = new Circle();
		c2.setRadius(10);
		c2.setX(5);
		c2.setY(5);
		
		Circle c3 = new Circle(4,4);
		
		System.out.println("Area: " 	+ c1.area());
		System.out.println("Area: " + c2.area());
		System.out.println("Area: " + c3.area());

		
	}
}
