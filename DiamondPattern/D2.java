/* row = 4
 *             1
 *         2   3   4
 *     5   6   7   8   9
 * 10  11  12  13  14  15  16
 *     17  18  19  20  21
 *         22  23  24
 *             25       */

import java.io.*;
class program2 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                int num=1;
                int s=0;
                int p=0;

                for(int i=1;i<row*2;i++) {
                        if(i<=row) {
                                s=row-i;
                                p=i*2-1;
                        }
                        else {
                                s=i-row;
                                p-=2;
                        }
                        for(int j=1;j<=s;j++) {
                                System.out.print("\t");
                        }
                        for(int j=1;j<=p;j++) {
                                System.out.print(num++ +"\t");
                        }
                        System.out.println();
                }
        }
}
