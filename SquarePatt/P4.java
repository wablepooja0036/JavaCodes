import java.util.Scanner;

class Square4{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no. of rows : ");
                int row = sc.nextInt();
		int ch =64+row;
                int num = row;
                for(int i = 1; i <= row; i++){

                        
                        for(int j = 1; j <= row; j++){

                                if(j==1){
                                        System.out.print((char)ch +" ");
                                        
                                }
                                else{
                                        System.out.print(num +" ");
                                }
				num++;
				ch++;

                        }
                        System.out.println();
                }
        }
}
