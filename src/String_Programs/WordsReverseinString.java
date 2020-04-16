package String_Programs;

public class WordsReverseinString {

    public static void main(String[] args) {

        String s[] = "Murthy is good boy".split("");


        String ans = " ";
        for (int i = s.length- 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println(ans);

    }
}