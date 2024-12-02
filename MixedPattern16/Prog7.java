import java.util.Scanner;
class Prog7{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows:");

                int row =sc.nextInt();
		int value =0;
                for(int i=row;i>=1;i--){
                         
                        for(int j=1;j<=i;j++){
				value=value+2;

                                System.out.print(value+" ");
                             


                        }

                        System.out.println();
                }
        }
}
