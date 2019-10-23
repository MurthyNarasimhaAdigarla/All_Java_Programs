package allStars;

public class Stars {

	public static void main(String args[]) {

		int i, j;

		//rows
		for (i = 0; i < 5; i++) {

			//Cols
			for (j = 0; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println(" ");

		}
	}
}