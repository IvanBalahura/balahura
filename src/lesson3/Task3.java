package lesson3;
//3. Given two strings. Check if they start with "The".
//
//   Task: word1 = "The End", word2="End The";
public class Task3 {
    public static void main(String[] args) {

        String w1 = "The End";
        String w2 = "End The";
        System.out.println(w1.startsWith("The"));
        System.out.println(w2.startsWith("The"));
    }
}

