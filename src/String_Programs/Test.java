package String_Programs;

public class Test {

    public static void main(String[] args) {

        int vVowel = 0;
        int cVowel = 0;


        String str = "This is a really simple sentence";
        String s = str.toLowerCase();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vVowel++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                cVowel++;
            }
        }
        System.out.println(vVowel);
        System.out.println(cVowel);
    }

}
