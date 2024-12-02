import java.io.*;

class Tri10{
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number of Rows");
                int rows = Integer.parseInt(br.readLine());
                int num=1;
                char ch ='a';

                for(int i =1; i <= rows; i++) {

                        for(int j = 1; j <= i; j++) {
                                if(i%2==1){
                                        System.out.print(num +" ");
					
                                }
                                else{
                                        System.out.print(ch + " ");
				

                        }
			num++;
			ch++;
			}
			System.out.println();
		}
	}
}
