//19.Find the average of N positive integers, raising a user defined exception for each negative input.
import java.util.Scanner;
import java.util.InputMismatchException;
public class avg{
    public static void main(String args[]){
    double total = 0, N, userInput;
    Scanner input = new Scanner(System.in);
    while (true){
        System.out.print("Enter the limit to calculate average: ");
        userInput = input.nextDouble();
        if (userInput > 0){
            N = userInput;
            break;
        }
        else
            System.out.println("N must be positive.");
        }
        for (int i = 0; i < N; i++){
            while (true){
                System.out.print("Enter number:");
        try{
            userInput = input.nextDouble();
            total += userInput;
            break;
        }
        catch (InputMismatchException e){
            input.nextLine();
            System.out.println("Input must bea number. Try again");
        }
    }
}
        System.out.println("Average: "+ total / N);
}
}