package lesson2;//Create two arrays of 10 integers.
// Find the square root of each element in the first array and put the result of it to the second array. Print second array to the console.
public class Task4 {
    public static void main(String[] args) {


        int a[];
        a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int b[];
        b = new int[10];
        for (int j = 0; j < a.length; j++) {
            b[j] = (int) Math.sqrt(a[j]);
            System.out.println(b[j]);
        }
    }
}




