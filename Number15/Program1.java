import java.util.*;

class Factor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.print("Factors of Number " + num + ":");

        for (int i = 1; i <= num ; i++) { // Start from 1, not 0
            if (num % i == 0) {
                System.out.print(i + " "); // Print the factor
            }
        }
         // Print half of the number separately
    }
}

