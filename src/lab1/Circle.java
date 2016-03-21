package lab1;

public class Circle {

	private int x;
	private int y;
	private int radius;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	private static final double PI = 3.14;

	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		radius = r;
	}
	
	public Circle(){
		this(0,0,0);
	}
	public Circle(int x, int y){
		this(x,y,0);
	}

	public void translate(int a, int b){
		this.x += a;
		this.y += b;
	}
	
	public double area(){
		return PI * radius * radius;
	}
	
}
