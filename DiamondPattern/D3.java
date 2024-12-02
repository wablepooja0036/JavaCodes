import java.io.*;
class Diamond3 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());
                int num=1;
                int s=0;
                int p=0;
                for(int i=1;i<row*2;i++) {
                        int num1=row*2-i;
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
                                if(i<=row) {
                                        if(j<i) {
                                                System.out.print(num-- +"\t");
                                        }
                                        else {
                                                System.out.print(num++ +"\t");
                                        }
                                }
                                else {
                                        if(j<row*2-i) {
                                                System.out.print(num1-- +"\t");
                                        }
                                        else {
                                                System.out.print(num1++ +"\t");
                                        }
                                }
                        }
		}
	}
}
