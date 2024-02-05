import java.util.Scanner;

public class Basic_Loops_Conditions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int i = input.nextInt();
        // if Condition
        if( i == 1) {
            System.out.println("This is the if Condition.");
        } else {
            System.out.println("This is the else Condition.");
        }

        // While loop
        while ( i != 5) {
            System.out.println("The Value of is (Using while loop): " + i);
             i++;
        }

        // for loop
        for (i = 2; i != 6; i++) {
            System.out.println("The Value of i is (Using for loop): " + i);
        }
    }
}
