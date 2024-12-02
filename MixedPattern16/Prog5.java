import java.util.Scanner;
class Prog5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows:");

		int row =sc.nextInt();
		for(int i=1;i<=row;i++){
			 int value =1;
			for(int j=1;j<=i;j++){

				System.out.print(i*value+" ");
				value++;


			}
		
			System.out.println();
		}
	}
}

