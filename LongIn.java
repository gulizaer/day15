import java.util.Scanner;

public class LongIn {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your username:");
        String name = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (name.equals("Cydeo") && password.equals("cydeo123")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i<3; i++){
                System.err.println("Incorrect username or password, please re_enter!");
                System.out.println("Enter your username:");
                name = input.next();

                System.out.println("Enter your password:");
                password=input.next();

                if (name.equals("Cydeo") && password.equals("cydeo123")){
                    System.out.println("You are now logged in");
                    break;

                }

            }
            if (!(name.equals("Cydeo") && password.equals("cydeo123"))) {
                System.out.println("Your account now is locked, please contact with the support team!");
            }

        }
        input.close();



        /*
        you are writing a code for the log-in function of the
         Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the
                user to have three attempts to enter correct credentials and if all
                three attempts are failed, then print "Your account is lucked."
         */
    }
}
