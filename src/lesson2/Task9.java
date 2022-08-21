package lesson2;
//9) Create an array of any length and fill it with random integers.
// Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.
public class Task9 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++){
            x[i] =(int) (Math.random() * 50);
        }
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println();
        int[] y = x;
        for (int i = 0; i<x.length; i++) {
            for(int j = 0; j<x.length; j++) {
                int a = y[j];
                int b = y[i];
                if (b < a) {
                    y[j] = b;
                    y[i] = a;
                }
            }
            for (int z = 0; z < y.length; z++) {
                System.out.print(y[z] + " ");
            }
            System.out.println();
            x = y;
        }
        System.out.println();
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }


    }
}