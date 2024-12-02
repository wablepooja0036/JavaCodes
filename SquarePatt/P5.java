import java.util.Scanner;

class Square5{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();

                int num = row;
                for(int i = 1; i <= row; i++){

                        char ch = 'C';
                        for(int j = row; j >= 1; j--){
                                if(num%2!=0){
                                        System.out.print(num +" ");
                                       
                                }
                                else{
                                        System.out.print(num*num +" ");
                                }
				num++;

                        }
                        System.out.println();
                }
        }
}
