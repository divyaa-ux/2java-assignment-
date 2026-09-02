import java.util.Scanner;

public class Q4_Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Prefix increment: " + (++visitors));
        System.out.println("Postfix increment: " + (visitors++));
        System.out.println("After postfix increment: " + visitors);
    }
}
