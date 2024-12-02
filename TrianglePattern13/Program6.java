/* 6. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
1 a 2
1 a
1
Rows = 4
1 a 2 b
1 a 2
1 a
1
*/
import java.util.Scanner;
class TrianglePat6{
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Rows:");
        int row =sc.nextInt();
        int num = 1;
        char ch2 ='a';
        for (int i=1;i<=row;i++){

                for(int j =row;j>=i;j--){
                        if(j%2==0){
                        System.out.print(ch2++ +" ");
                        }else{
                                System.out.print(num++ +" ");

                        }
                        }
                        num =1;
                        ch2='a';

                System.out.println();

        }
	}
}

