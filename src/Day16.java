
public class Day16 {

	public static void main(String[] args) {
		// Methods

		System.out.println("cubed: " + cubeNumber(2));

		System.out.println("smallest: " + smallestNumber(5, 7, 9));

		int[] list = { 1, 4, 8, 16 };

		System.out.println("average from array: " + averageArr(list));
	}

	private static double cubeNumber(int a) {
		return Math.pow(a, 3);
	}

	private static int smallestNumber(int x, int y, int z) {
		int smallest;
		
		// Ar iebuvetajam funkcijam !
		//Math.min(x, Math.min(y, z));
		
		if (x < y && x < z) {
			smallest = x;
			return smallest;
		} else if (y < x && y < z) {
			smallest = y;
			return smallest;
		} else {
			smallest = z;
			return smallest;
		}
	}

	private static double averageArr(int list[]) {
		double sum = 0;

		for (int i = 0; i < list.length; i++) {
			sum += list[i];

		}
		double avg = (double) sum / list.length;
		return avg;
	}

}
