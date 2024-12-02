import java.io.*;

class Tri9{
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number of Rows");
                int rows = Integer.parseInt(br.readLine());
                int num=rows +1;
                char ch ='a';

                for(int i =1; i <= rows; i++) {
			num =rows +1;
                        for(int j = 1; j <= i; j++) {
                                if(j%2==1){
                                        System.out.print(num +" ");
                                }
                                else{
                                        System.out.print(ch + " ");
					
				
		
                        }
			
			num++;
			}
			System.out.println();
		}
	}
}
