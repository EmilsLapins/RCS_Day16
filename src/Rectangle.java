
public class Rectangle {

		private Integer length;
		private Integer width;
		
		public  Rectangle () {
			length = 5; //default values
			width = 4;  //
		}
		
		public  Rectangle (int length, int width) {
			this.length = length;
			this.width = width;
		}
		
		public boolean isSquare() {
			if (length == width) {
				return true;
			}else {
				return false;
			}
		}
		
		public int area() {
			return length * width;
		}
		
		public int perimeter() {
			return (length + width) * 2; 
		}

		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + ", isSquare=" + isSquare() + ", area="
					+ area() + ", perimeter=" + perimeter() + "]";
		}
		
		
		
		


}
