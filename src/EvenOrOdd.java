import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The given number is Even.");
        } else {
            System.out.println("The given number is Odd.");
        }

        // TypeCasting refers to explicitly changing the datatype of a variable to another datatype.
        // Here, 65.44 is a float, but, converted explicitly into int by using this method =>
        int typecast = (int)(65.44);
        System.out.println(typecast);

        // When performing any mathematical operation, their output datatype will be converted to the one which has bigger datatype between the two .
        // This is called as Type Promotion.
    }
}
