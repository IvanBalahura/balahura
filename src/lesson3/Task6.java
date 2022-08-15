package lesson3;
//iven a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
//   The First Name and Last Name of the user should be in the following format: "Name Surname".
//   Result should be:
//   login = "John Smith"
//   domain = "example.com"
public class Task6 {
    public static void main(String[] args) {

        String email = "john_smith@example.com";
        String x = "\"";
        String login = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println(x + domain + x);
        String loginA = login.substring(0, login.indexOf("_"));
        String logA = loginA.substring(0,1).toUpperCase() + loginA.substring(1);
        String loginB = login.substring(login.indexOf("_")+1);
        String logB = loginB.substring(0,1).toUpperCase() + loginB.substring(1);
        System.out.println( x+ logA + " " + logB + x);


    }
}