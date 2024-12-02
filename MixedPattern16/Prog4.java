import java.util.Scanner;
class pattr4{
	public static void main(String []args){
		System.out.println("Enter the number of rows:");
		Scanner sc =new Scanner(System.in);
		int row =sc.nextInt();
		 int value =row;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(value*j+" ");

			
			}
			value--;
			
			System.out.println();
		}
	}
}


