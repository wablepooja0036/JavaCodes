/*
 * 10. WAP in notebook & Dry run first then type
Take number of rows from user:
rows = 4
65 B 67 D
B 67 D
67 D
D

rows = 3
A 66 C
66 C
C*/

import java.io.*;
class NumPat10{ 
	public static void main(String []args)throws IOException{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Number of Rows:");
		int row=Integer.parseInt(Br.readLine());
                int ch =65; 
		for(int i =1;i<=row;i++){
			for(int j=1;j<=row+1-i;j++){
			if(i%2==0 ){
				if(j%2==1){
					System.out.print(ch++ +" ");
				}else{
					System.out.print((char)ch++ + " ");
				}
			}else{
				 if(j%2==0){
                                        System.out.print(ch++ +" ");
                                }else{
                                        System.out.print((char)ch++ + " ");                                   }    
			}
			}
			ch =65;
			System.out.println();
		}
	}
}
