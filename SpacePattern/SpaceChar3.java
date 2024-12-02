import java.io.*;
class CharPat3{
	public static void main(String []args)throws IOException{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(Br.readLine());
		int ch=64+row;
		for(int i=1;i<=row;i++){
			for(int space=1;space<=row-i;space++){
				System.out.print("  ");
			
			}
			
			for(int j=1;j<=i;j++){
				System.out.print((char)ch+++" ");
			
			}
		 ch=64+row-i;
			System.out.println();
		}
	}
}
/* - - c
 * -c b
 * c b a
*/

