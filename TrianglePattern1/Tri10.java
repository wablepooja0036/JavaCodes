import java.util.*;
class TrianglePattern10{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number Of Rows:");
                        int rows =sc.nextInt();
                System.out.println("Enter The Number Of Columns:");
                        int column =sc.nextInt();
			char ch ='D';
                for(int i =1;i<=rows;i++){
                        for( int j=i;j<=rows;j++){

                                System.out.print(ch-- + " ");
                        }
			ch ='D';
                        System.out.println();
                }
        }
}
