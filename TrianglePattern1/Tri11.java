import java.io.*;
class TrianglePattern11{
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                for(int i=1;i<=row;i++) {

                        int ch=64+i;
                        for(int j=row;j>=i;j--) {
                                if(row%2==0) {
                                        if(ch%2==0) {
                                                System.out.print((char)ch +" ");

                                        }
                                        else {
                                                System.out.print(ch +" ");

                                        }
                                        ch++;
                                 }
                                else {
                                        if(ch%2==1) {
                                                System.out.print((char)ch +" ");

                                        }
                                        else {
                                                System.out.print(ch +" ");

                                        }
                                        ch++;
                                }


                         }
                        System.out.println();
                  }
        }
}
