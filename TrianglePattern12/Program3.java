import java.io.*;

class Tri3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows");
		int rows = Integer.parseInt(br.readLine());
		int ch =64+rows;
		for(int i =1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)ch + " ");
				ch --;
			}
			System.out.println();
			ch =64+rows;
		}
	}
}
