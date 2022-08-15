package lesson3;
//// 1. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
////If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
////
////For example:
////"AE_1381" -> "AE"
////"A" -> "A"
////"" -> ""

public class Task1 {
    public static void main(String[] args) {
        String x = "AE_1381";
        if (x.length() > 2) {
            System.out.println(x.substring(0, 2));
        } else {
            System.out.println(x);
        }
    }
}

