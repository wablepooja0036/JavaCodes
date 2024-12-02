/* row = 3
 *
 * A 66 C
 *   66 C
 *      C
 *
 * row = 4
 *
 * 65 B 67 D
 *    B 67 D
 *      67 D
 *         D      */

import java.io.*;
class program10 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of rows : ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++) {
			int ch=65;
			for(int space=1;space<i;space++) {
				System.out.print("  ");
				ch++;
			}


			if(row%2==0) {
				for(int j=i;j<=row;j++) {

					if(j%2==1) {
						System.out.print(ch++ +" ");

					}
					else {
						System.out.print((char)ch +" ");

					}
				}                                                                                                                                                    System.out.println();
			}

			else {
				for(int j=i;j<=row;j++) {

					if(j%2==0) {
						System.out.print(ch++ +" ");

					}else {                                                                                                                                                              System.out.print((char)ch++ +" ");


					}                                                                                                                                                    }                                                                                                                                                           System.out.println();
			}
		}
	}
}
