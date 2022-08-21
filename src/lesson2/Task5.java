package lesson2;//Create a program that calculates the factorial of an integer value n.
public class Task5 {

    public static void main(String[] args ){
        System.out.println(fuctorialN(6) );
    }

    public static int fuctorialN(int n)  {
        if ( n == 1 || n == 0) {
            return 1;
        }
        return n*fuctorialN(n-1);
    }

}