/* row = 5
 *
 * E D C B A
 *   E D C B
 *     E D C
 *       E D
 *         E
 *
 * row = 4
 *
 * A B C A
 *   D C B
 *     D C
 *       D      */

import java.io.*;
class program9 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows : ");
                int row = Integer.parseInt(br.readLine());

                for(int i=1;i<=row;i++) {
                        for(int space=1;space<i;space++) {
                                System.out.print("  ");
                        }
                        int ch=64+row;
                        for(int j=i;j<=row;j++) {
                                System.out.print((char)ch-- +" ");
                        }
                        System.out.println();
                }
        }
}
