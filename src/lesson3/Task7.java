package lesson3;
//7. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
//   Example:
//   Den
//   John
//   Will
//   Kate
//   ...
public class Task7 {
    public static void main(String[] args) {
        String a = "Den, John, Will, Kate, Adam, Robin";
        String[] b = a.split(", ");
        for(String c: b){
            System.out.println(c);

        }
    }
}
