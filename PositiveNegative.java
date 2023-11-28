import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int positive = 0;
        int negative = 0;

        
        for (int i = 1; i<=5; i++){
            int number = input.nextInt();

            if (number >=0 ){
                positive++;
            } else if (number<0) {
                negative++;

            }
        }
        System.out.println(positive + " Positive ande " + negative + " Negativ");





        /*
        Create a class named PositiveNegative and write a program that asks user to enter
        number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

         */
    }
}
