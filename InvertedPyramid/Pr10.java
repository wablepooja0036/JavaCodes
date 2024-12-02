import java.io.*;
class Demo10 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows : ");
                int row = Integer.parseInt(br.readLine());

                for(int i=row;i>=1;i--) {
                        for(int sp=row;sp>i;sp--) {
                                System.out.print("\t");
                        }
                int num =row;
                        for(int j=1;j<=i*2-1;j++) {
                                if(j>=i) {
                                        System.out.print(num +"\t");
                                        num++;
                                }
                                else {
                                        System.out.print(num +"\t");
                                        num--;

                                        }
                                 }
                                System.out.println();
                        }
                }
        }
