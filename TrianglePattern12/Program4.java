import java.io.*;

class Tri4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number of Rows");
        int rows = Integer.parseInt(br.readLine());
       
         
        for(int i =1; i <= rows; i++) {
	int ch =96+rows;
        int ch1 =64+rows;
            if(i % 2 == 1) {
                for(int j = 1; j <= rows; j++) {
                    System.out.print((char)ch + " ");
		    ch--;
                }
            } else {
                for(int j = 1; j <= rows; j++) {
                    System.out.print((char)ch1 + " ");
		    ch1--;
                }
            }
            System.out.println();
            // Reset characters for the next row
            
        }
    }
}

