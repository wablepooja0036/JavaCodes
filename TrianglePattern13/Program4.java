/*4. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
F E D
C B
A
Rows = 4
J I H G
F E D
C B
A */
import java.util.Scanner;
class TrianglePat4{
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Rows:");
        int row =sc.nextInt();
        int ch = 65+row;
        for (int i=1;i<=row;i++){

                for(int j =row;j>=i;j--){

                        System.out.print((char)ch-- +" ");
                        

                }
                System.out.println();

        }


        }
}
