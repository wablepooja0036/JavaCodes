import java.util.Scanner;
class Prog8{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows:");
		int value=0;
                int row =sc.nextInt();
                int ch =row+96;
                for(int i=row;i>=1;i--){

                        for(int j=1;j<=i;j++){
                                value=value+2;

                                System.out.print(value+" ");



                        }

                        System.out.println();
                }
        }
}
