import java.util.Scanner;
class Demo1{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");

		int row =sc.nextInt();
		for(int i = 1;i<=row;i++){
			for(int space =1;space<i;space++){
				System.out.print(" ");
			}
			for(int j =1;j<=(row-i)*2+1;j++){
				System.out.print("1"+" ");
			}
			System.out.println();
		}
	}
}


