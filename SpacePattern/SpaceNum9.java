import java.io.*;
class NumPat9{
        public static void main(String []args)throws IOException{                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of Rows:");
		int row=Integer.parseInt(Br.readLine());
		
                for(int i=1;i<=row;i++){
                        int ch=64+row;
                          for(int space=1;space<i;space++){
                                System.out.print("  ");
                        }
                        for(int j=row;j>=i;j--){
                                System.out.print((char)ch--+" ");


                        }
                        

                        System.out.println();
                }

        }
}
