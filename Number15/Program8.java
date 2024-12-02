import java.util.Scanner;

 class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");

        int num = sc.nextInt();
        int number =num;

	int rem = 0;

        while (num > 0) {
            rem = rem * 10 + num % 10;
            num = num / 10;
        }
        
	
	if(number==rem){
		System.out.println("Number is Palindrome");
	}else{
		System.out.println("Number is not Palindrome");
	}
      
    }
}

