package Basic_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class Dups {
	static String str = "Murthyy";

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		for (Character ch : charArray) {

			System.out.println(ch);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
				System.out.println(ch);
			}
		}

		Set<Character> keys = map.keySet();
		for (Character ch : keys) {
			if (map.get(ch) > 1) {
				System.out.println(map.get(ch));
				System.out.println(ch + "  is " + map.get(ch) + " times");

			}

		}

	}

}
