/*5. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
A B C
a b
A

Rows = 4
A B C D
a b c
A B
a */
import java.util.Scanner;
class TrianglePat5{
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Rows:");
        int row =sc.nextInt();
        char ch1 ='A';
	char ch2 ='a';
        for (int i=1;i<=row;i++){

                for(int j =row;j>=i;j--){
			if(i%2==0){
                        System.out.print(ch1++ +" ");
			}else{
				System.out.print(ch2++ +" ");

			}
			}
			ch1 = 'A';
			ch2='a';

                System.out.println();

        }


        }
}
