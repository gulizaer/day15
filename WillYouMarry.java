import java.util.Scanner;

public class WillYouMarry {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Will You Marry me?");
         String yesOrno = input.next().toLowerCase();

    while (!(yesOrno.equals("yes") || yesOrno.equals("no"))) {
        System.err.println("Invalid answer, please re-enter:");
        yesOrno= input.next().toLowerCase();
    }

    if (yesOrno.equals("yes")){
        System.out.println("Congrats");

    } else if (yesOrno.equals("no")) {
        System.out.println("Goodbye");}






/*
 Create a class named Marriage proposal and Write a program for the  marriage proposal
  program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and
     repeat it until the user enters either yes or no
 */

}
}
