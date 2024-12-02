/*
 D C B A
 c b a
 B A
 a
 */

import java.util.Scanner;
class Demo10{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the number of Rows:");
	       	int row = sc.nextInt();
              int ch1=96+row;
                int ch=64+row;
       
                for(int i=1;i<=row;i++){
		
                for(int j=1;j<=row-i+1;j++){
                        if(row%2==1){
				if(i%2==1){
                                System.out.print((char)ch1--+" ");

                        	}else{	
				 System.out.print((char)ch--+" ");
				}


			}else{
                                if(i%2==0){
                                System.out.print((char)ch1--+" ");

                                }else{
                                 System.out.print((char)ch--+" ");
                                }

                        }

                }
		ch=64+row-i;
		ch1=96+row-i;

		

	
                System.out.println();

                }
        }

}
