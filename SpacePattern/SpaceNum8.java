import java.io.*;
class NumPat8{
        public static void main(String []args)throws IOException{
                BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(Br.readLine());
		int num=0;
                for(int i=0;i<row;i++){
                          for(int space=1;space<=i;space++){
                                System.out.print(" ");
                        }    
                        for(int j=1;j<=row-i;j++){
                                System.out.print(++num +" ");


                        }
			num =i;
			num++;
			
                       
                        /*for(int space=1;space<=row-i;space++){
                                System.out.print(" ");
				i
                        }*/
                        System.out.println();
                }

        }
}
