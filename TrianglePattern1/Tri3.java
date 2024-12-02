import java.util.*;
class TrianglePattern3{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number Of Rows:");
                        int rows =sc.nextInt();
                System.out.println("Enter The Number Of Columns:");
                        int column =sc.nextInt();

                for(int i =rows;i>=1;i--){
                        for(int j=rows;j>=i;j--){
                                System.out.print(j+" ");
                        }
                        System.out.println();
                }
        }
}
