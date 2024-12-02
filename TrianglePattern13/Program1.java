/*Take number of rows from user :
Rows = 4
1 2 3 4
2 3 4
3 4
4
Rows = 5
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/
import java.util.Scanner;
class TrianglePat1{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter the number of Rows:");
	int row =sc.nextInt();
	int num =1;
	for (int i=1;i<=row;i++){

		for(int j =row;j>=i;j--){

			System.out.print(num+" ");
			num ++;
			
		}
		System.out.println();
		num =1+i;
	}

	
	}
}


