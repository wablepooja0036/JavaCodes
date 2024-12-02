import java.util.Scanner;
class Patt6{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the Number Of Rows");
                int row =sc.nextInt();
                for(int i=1;i<=row;i++){
                        int  ch =96+row;
                        int num=row;
                        for(int j=1;j<=i;j++){
                                if(i%2==1){
                                        System.out.print((char)ch-- +" ");
                                }else{
                                        System.out.print(num-- +" ");
                                }
                        }

                        System.out.println();
                }
        }
}
