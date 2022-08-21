package lesson2;
//6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

//<pre>
//a)  ********
//    ********
//    ********
//    ********
//    ********
//    ********
//    ********
//    ********
//
//b)  ********
//    *      *
//    *      *
//    *      *
//    ********
//
//c)  *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******
//
//d)      *
//       ***
//      *****
//     *******
//    *********
//</pre>
public class Task6 {
    public static void main(String[] args) {
        int x,y;
        for (x = 0; x<8; x++) {
            for (y = 0; y<8; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (x = 0; x<5; x++) {
            for (y = 0; y<8; y++) {
                if (0<x && x<4 && 0<y && y<7) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (x = 0; x<7; x++){
            for (y = 0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (x = 0; x<5; x++) {
            for (y = 4-x; y>0;y--){
                System.out.print(" ");
            }
            for (y = 0; y<1+x*2; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}


