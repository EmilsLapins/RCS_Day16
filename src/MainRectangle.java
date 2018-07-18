

public class MainRectangle {

	public static void main(String[] args) {
		

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 8);
		Rectangle r3 = new Rectangle(6);
		
		System.out.println("Is r1 square:? " +  r1.isSquare());
		System.out.println("Area of r1: " + r1.area());
		System.out.println("Perimeter of r1: " + r1.perimeter());
		System.out.println(r1.toString());
		System.out.println("-------------");
		
		System.out.println("Is r2 square:? " +  r2.isSquare());
		System.out.println("Area of r2: " + r2.area());
		System.out.println("Perimeter of r2: " + r2.perimeter());
		System.out.println(r2.toString());
		System.out.println("-------------");
		
		System.out.println("Is r3 square:? " +  r3.isSquare());
		System.out.println("Area of r3: " + r3.area());
		System.out.println("Perimeter of r3: " + r3.perimeter());
		System.out.println(r3.toString());

	}

}
