package all.java.com;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {

		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 Values ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("After Swaping");

		c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);

	}	

}
