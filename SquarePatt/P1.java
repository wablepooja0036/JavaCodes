import java.util.Scanner;

class Square1{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();
		int ch ;
                int num = row;
                for(int i = 1; i <= row; i++){

                        ch= 64+row;
                        for(int j = 1; j <= row; j++){

                                if(i%2!=0){
                                        System.out.print((char)ch +" ");
                                        ch--;
                                }
                                else{
                                        System.out.print(num +" ");
                                }

                        }
                        System.out.println();
                }
        }
}

