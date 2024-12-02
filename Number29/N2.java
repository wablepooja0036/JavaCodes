import java.io.*;

class Num2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
	System.out.println("Enter the Number :");
        int num = Integer.parseInt(br.readLine());
        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            int fact = 1;
            int i = 1;
            while (i <= rem) {
                fact *= i;
                i++;
            }
            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is Not a Strong Number");
        }
    }
}

