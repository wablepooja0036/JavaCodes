import java.util.Scanner;

class Square7{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();
		char ch = 'A';
                int num = row;
                for(int i = 1; i <= row; i++){
                        for(int j = 1; j <= row; j++){

                                if(num%2!=0){
                                        System.out.print(ch + " ");
                                        
                                }
                                else{
                                        System.out.print(num +" ");
                                }

                       
			num++;
		
			}
			ch++;
                        System.out.println();
                }
        }
}
