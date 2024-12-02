import java.io.*;
class NumPat2{
        public static void main(String []args)throws IOException{
                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
            	System.out.println("Enter the number of rows:");
	    	int row=Integer.parseInt(Br.readLine());
                 int num;
                for(int i=1;i<=row;i++){
                        for(int space=1;space<=row-i;space++){
                                System.out.print("  ");
                        }
			num=row;
                        for(int j=1;j<=i;j++){
                                System.out.print( num+" ");
				num--;

                        }
                        
                        System.out.println();
                }

        }
}
