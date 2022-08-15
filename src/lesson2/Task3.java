package lesson2;//Create an array of 10 integers. Fill this array using for-loop with random numbers.
// Print all the elements of this array to the console. Each element from the new line.

public class Task3 {
    public static void main(String args[]){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 101) - 50);// -50 минимальное допустимое значение, 50  макс допуст занач
            System.out.println(array[i]);
        }
    }
}