package lesson3;
//8 Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456.
public class Task8 {
    public static void main(String[] args) {
        String x = "1234 5678 9012 3456";

        char[] charX = x.toCharArray();
        for (int i =0; i < charX.length-4; i++) {
            if (charX[i] != ' ')
                charX[i] = '*';
        }
        for(int j=0; j < charX.length; j++)
            System.out.print(charX[j]);




    }
}
