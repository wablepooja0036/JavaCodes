import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");

        int num = sc.nextInt();
        int rem = 0;

        while (num > 0) {
            rem = rem * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse Number is:" + rem);

        sc.close();
    }
}

