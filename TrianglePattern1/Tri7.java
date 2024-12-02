import java.util.*;
class TrianglePattern7{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number Of Rows:");
                        int rows =sc.nextInt();
                System.out.println("Enter The Number Of Columns:");
                        int column =sc.nextInt();

                for(int i =rows;i>=1;i--){
                        for(int j=1;j<=i;j++){

                                System.out.print(i+ " ");
                        }
                        System.out.println();
                }
        }
}
