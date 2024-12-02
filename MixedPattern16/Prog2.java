import java.util.Scanner;
class Patt2{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Number of rows:");
                int row =sc.nextInt();
               char ch ='C';
	      
                for(int i=0;i<row;i++){
			int num =row+i;
                        for(int j=1;j<=row;j++){
                                System.out.print((char)ch);
				System.out.print(num-- +" ");

                        }
		

                System.out.println();
                }
        }
}
