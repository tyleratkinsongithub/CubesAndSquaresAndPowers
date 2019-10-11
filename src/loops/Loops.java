
package loops;
import java.util.Scanner;

public class Loops {
  
  
    public static void main(String[] args) {
    
        Scanner keyedinput = new Scanner(System.in);

        //declare variables
        String choiceIn = "0";
        boolean exit = false;

        while (!exit) {
            //declare local variables
            int userNum = 0;
            int power = 1;

            ;
            System.out.println("Would you want to...");
            System.out.println("1. Find a square of a number?\n2. Find a cube of a number?\n3. Find any power of a number?\n4. Leave?");

            choiceIn = keyedinput.nextLine();


                switch (choiceIn) {
                    case "1":
                        //prompt use and get input
                        System.out.println("Enter the number you need  squared:");

                        userNum = Integer.parseInt(keyedinput.nextLine());

                        //do the calculation
                        for (int i = 0; i < 2; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " squared is " + power + "!");

                        break;
                    case "2":
                        //prompt use and get input
                        System.out.println("Enter the number you want cubed:");

                        userNum = Integer.parseInt(keyedinput.nextLine());

                        //do the calculation
                        for (int i = 0; i < 3; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " cubed is " + power + "!");
                        break;
                    case "3":
                        int exponent = 0;

                        System.out.println("Enter the number you like to raise to a exponent:");
                        userNum = Integer.parseInt(keyedinput.nextLine());

                        System.out.println("Enter the exponent you would like to raise :");
                        exponent = Integer.parseInt(keyedinput.nextLine());

                        for (int i = 0; i < exponent; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " raised to the expnent " + exponent + " is " + power + "!");
                        break;
                    case "4":
                        System.out.println("");
                        exit = true;
                        break;
                    default:
                        System.out.println("\n\n\n\n\nThat is not a valid input.\n\n\n\n\n\n");
                }
        }
        System.out.println("Exit");
    }

         
    
}
