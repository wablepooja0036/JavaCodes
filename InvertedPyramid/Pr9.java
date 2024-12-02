import java.util.Scanner;
class Demo9{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the Number of Rows:");

                int row =sc.nextInt();

                for(int i = 1;i<=row;i++){
                        for(int space =1;space<i;space++){
                                System.out.print(" ");
                        }
                        int num =1;
                        for(int j =1;j<=(row-i)*2+1;j++){
				if(j%2==1){
                                System.out.print("1" +" ");
                        }else{
				System.out.print("0"+" ");
			}
			}

                        System.out.println();
                }
        }
}
