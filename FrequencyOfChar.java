import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();

        System.out.println("Enter a character:");
       char ch = input.next().charAt(0);

       int frequency =0;
       for (int i = 0; i< str.length(); i++){
           if(str.charAt(i) == ch){
               frequency++;
           } else {
               System.err.println("Invalid! Please enter only one letter!");
           }

       }
        System.out.println(frequency);
       input.close();





        /*
        Create a class named FrequencyOfChar and Write a program thatasks user to
        enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */
    }
}
