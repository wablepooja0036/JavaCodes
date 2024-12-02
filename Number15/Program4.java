import java.util.Scanner;

class Composite4{
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number:");
                int num = scanner.nextInt();
                int count =0;
                for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                                System.out.println(num + " :is a composite number.");
                                count ++;
                                break; // Exit the program after identifying the number as composite
                        }}
                if(count ==0){
                                // If the loop completes without finding any factors, the number is not composite
                                System.out.println(num + ": is not a composite number.");
                        }
                }
        }

