import java.io.*;

class Tri6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows");
		int rows = Integer.parseInt(br.readLine());

		char ch ='A';

		for(int i =1; i <= rows; i++) {
			int num=1;
			for(int j = 1; j <= i; j++) {
				if(i%2==1){
					System.out.print(num++ +" ");
				}
				else{
					System.out.print(ch + " ");
				}
				ch++;

			}
			System.out.println();
		}
	}
}
