package lesson3;
//Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
public class Task5 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        if (a.length() < b.length())
            System.out.println(String.join("", a, b, a));
    }
}
