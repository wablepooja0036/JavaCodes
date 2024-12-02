import java.io.*;
class NumPat7{
        public static void main(String []args)throws IOException{
                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(Br.readLine());
                 
                for(int i=1;i<=row;i++){
			int num=1;
                          for(int space=1;space<i;space++){
                                System.out.print("  ");
                        }
			for(int j=row;j>=i;j--){
                                System.out.print(num++ +" ");


                        }
                        num++;
			
                        System.out.println();
                }

        }
}
