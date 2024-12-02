/*Rows = 4
20 18 16 14
12 10 8
6 4
2
Rows = 5
30 28 26 24 22
20 18 16 14
12 10 8
6 4
2
*/
import java.util.Scanner;
class TrianglePat3{
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Rows:");
        int row =sc.nextInt();
        int num = row*(row+1);
        for (int i=1;i<=row;i++){

                for(int j =row;j>=i;j--){

                        System.out.print(num+" ");
                        num =num - 2;

                }
                System.out.println();

        }


        }
}
