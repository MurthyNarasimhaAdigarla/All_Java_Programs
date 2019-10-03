package all.snippets.com;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range of numbers");
		no=s.nextInt();
		for(i=1; i<=no; i++)
		{
		if((i % (3*5)) == 0)
		{
		System.out.println("FizzBuzz");
		}
		else if ((i % 5) == 0)
		{
		System.out.println("Buzz");
		}
		else if ((i % 3) == 0)
		{
		System.out.println("Fizz");
		}
		else
		{
		System.out.println(i);
		}
		}
		}
		}