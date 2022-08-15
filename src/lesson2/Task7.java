package lesson2;
//7) Create an array of 10 integers. Calculate and print the sum of all its elements except the first one and the last one.
public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) continue;//Continue позволяет опустить участок кода и вернуться в начало цикла.
            if (i == array.length - 1) continue;
            x = x + array[i];
        }
        System.out.println(x);
    }

}

