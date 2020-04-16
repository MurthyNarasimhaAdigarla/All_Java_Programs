package Basic_Programs;

import java.util.Arrays;

public class RemoveUnwanted {

	public static void main(String[] args) {
		
		//https://www.journaldev.com/18361/java-remove-character-string


		String s= "Murthy001@#$ 321";
		
		String s1 =s.replaceAll("\\s", "");
		System.out.println(s1);
		
		String s2=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
		
	}
		
		 
	}


