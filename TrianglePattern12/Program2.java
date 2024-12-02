import java.io.*;

class Tri2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number of Rows");
        int rows = Integer.parseInt(br.readLine());

        char ch = 'a';
        String str = "$";

        System.out.println("Enter Pattern:");
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch++ + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(str + " ");
                }
            }
            System.out.println();
            ch = 'a'; // Reset ch for the next row
        }
    }
}

