package lab1;

public class UseRectangle {
	
	public static void main(String args[]){
		
		Rectangle rZero = new Rectangle();
		
		System.out.println(rZero);

		rZero.setHeight(10);
		rZero.setWidth(15);
		
		System.out.println(rZero);

		Rectangle rSquare = new Rectangle(1,2,4);
		System.out.println(rSquare);
		
		Rectangle rRectangle = new Rectangle(1,2,4,5);
		System.out.println(rRectangle);
		
		
	}
}
