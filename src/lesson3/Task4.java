package lesson3;
//4. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.
public class Task4 {
    public static void main(String[] args) {
        String strABCDEFGHIJK = "ABCDEFGHIJKI";
        String result = strABCDEFGHIJK.toLowerCase().replaceAll("[aeio]", "");
        System.out.println(result);
    }
}
