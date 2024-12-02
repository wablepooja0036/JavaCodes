import java.io.*;
class NumPat1{
        public static void main(String []args)throws IOException{
                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the number of Rows:");
		int row=Integer.parseInt(Br.readLine());
                for(int i=1;i<=row;i++){
                        for(int space=1;space<=row-i;space++){
                                System.out.print("  ");
                        }
                        int num=1;
                        for(int j=1;j<=i;j++){
                                System.out.print(num++ +" ");

                        }
                        System.out.println();
                }
        
	}
}

