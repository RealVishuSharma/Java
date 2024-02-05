import java.util.Scanner;

public class sum {
    public static void main(String[] args ) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int  first = number.nextInt();
        System.out.println("Enter the Second Number: ");
        int second = number.nextInt();
        int sum = first + second;
        System.out.println("The Sum of both the numbers is : " + sum);

    }
}
