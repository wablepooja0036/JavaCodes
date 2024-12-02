import java.util.Scanner;
class Patt1{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Number of rows:");
                int row =sc.nextInt();
                int num =1;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print(num++ + " ");
                        }

                System.out.println();
                }
        }
}
