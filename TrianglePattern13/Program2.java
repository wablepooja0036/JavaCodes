/* 2. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
2 4 6 8
10 12 14
16 18
20
Rows = 5
2 4 6 8 10
12 14 16 18
20 22 24
26 28
30
*/
import java.util.Scanner;
class TrianglePat2{
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Rows:");
        int row =sc.nextInt();
        int num =2;
        for (int i=1;i<=row;i++){

                for(int j =row;j>=i;j--){

                        System.out.print(num+" ");
                        num =num +2;

                }
                System.out.println();
               
        }


        }
}
