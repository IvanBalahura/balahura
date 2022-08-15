package lesson2;//Create two arrays of 10 integers.
// Find the square root of each element in the first array and put the result of it to the second array. Print second array to the console.

public class Task4 {
    public static void main(String[] args){
        double  [] x = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double [] y = new double[10];
        y[0]= Math.sqrt(x[0]) ;
        y[1]= Math.sqrt(x[1]) ;
        y[2]= Math.sqrt(x[2]) ;
        y[3]= Math.sqrt(x[3]) ;
        y[4]= Math.sqrt(x[4]) ;
        y[5]= Math.sqrt(x[5]) ;
        y[6]= Math.sqrt(x[6]) ;
        y[7]= Math.sqrt(x[7]) ;
        y[8]= Math.sqrt(x[8]) ;
        y[9]= Math.sqrt(x[9]) ;


        System.out.print("Вывод элементов массива y: ");
        for(double element : y) {
            System.out.print(element + ", ");

        }        }
}




