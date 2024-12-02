import java.io.*;
class Mix9{
	public static void main(String []argst)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Number Of Rows:");
		int row=Integer.parseInt(br.readLine());

		for(int i=0;i<row;i++){
			int num=1;
			int ch=63+row;

			for(int j=row;j>i;j--){
				
				if(i%2==1){
					System.out.print((char)ch--+" ");
				}else{
					System.out.print(num++ +" ");
				}
			}
			System.out.println();

		}
	}
}

