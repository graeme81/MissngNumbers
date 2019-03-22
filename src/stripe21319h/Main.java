package stripe21319h;

public class Main {

	public static void main(String[] args) {
		
		MissingNum find = new MissingNum();
		
		int[] numArr = {1 ,3, 6, 12, 2, 4};
		int x = find.search(numArr);
		
		System.out.println("The lowest positive number not in the array is: " + x );

	}

}
