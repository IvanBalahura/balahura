package lesson2;
//9) Create an array of any length and fill it with random integers.
// Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.
public class Task9 {
    public static void main(String[] args) {


        int arr[];
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 101) - 50);
            int x;
            int y;
            int z;

            for (x = 1; x < arr.length; x++) {
                for (y = arr.length - 1; y >= x; y--) {
                    if (arr[y - 1] > arr[y]) {
                        z = arr[y - 1];
                        arr[y - 1] = arr[y];
                        arr[y] = z;
                    }
                }
            }


                System.out.print(" " + arr[i]);
        }
    }
}