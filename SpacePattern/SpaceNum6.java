/*
 * 6. WAP in notebook & Dry run first then type
Take number of rows from user:
Rows = 3
3 3 3
2 2
1

Rows = 4
4 4 4 4
3 3 3
2 2
1
*/
import java.io.*;
class NumPat6{
        public static void main(String []args)throws IOException{
                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Number of Rows:");
                int row=Integer.parseInt(Br.readLine());
		int num =row;
                
                  for(int i=1;i<=row;i++){     
                        for(int j=1;j<=row-i+1;j++){
                                System.out.print(num+" ");

                        }
			num --;
                        System.out.println();
                }
	}
       
}
