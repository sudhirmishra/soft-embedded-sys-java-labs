package lab1;

public class Rectangle {
	
	private int height;
	private int width;
	private int x,y;
	
	public Rectangle(){
		this(0,0,0,0);
	}
	
	public Rectangle(int newX, int newY, int newHeight, int newWidth){
		x = newX;
		y = newY;
		height = newHeight;
		width = newWidth;
	}
	
	public Rectangle(int newX, int newY, int newHeightWidth){
		this(newX,newY,newHeightWidth,newHeightWidth);
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
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
	
	public void translate(int a, int b){
		this.x += a;
		this.y += b;
	}
		
	public String toString(){
		return "Width : " + width
				+ ", Height : " + height +";" ;
	}
}
