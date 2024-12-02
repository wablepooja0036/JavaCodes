import java.util.Scanner;

class Square10{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();

                int num = row;
                for(int i = 1; i <= row; i++){
			int ch =row +64;
			num =row;
                        for(int j = 1; j <= row; j++){

                                if(i%2!=0&& j%2==1){
                                        System.out.print(num+" ");
                                }else if(i%2!=0 && j%2!=1){
					  System.out.print((char)ch +" ");
				}else{
                                        System.out.print((char)ch +" ");
                                }
                                num--;
				ch--;
                        }
                        System.out.println();
                }
        }
}
