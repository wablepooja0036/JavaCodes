import java.util.Scanner;

class Square8{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();
                int num =row;
                int ch = 64+row;
                for(int i = 1; i <= row; i++){
                        for(int j = 1; j <= row; j++){
				if(i%2==0){

                                	if(j%2==0){
                                   	System.out.print("#" + " ");
					}else{
                                        System.out.print((char)ch +" ");
                               		ch --;
				       	}
				}else{
				       	if(j%2!=0){
                                        System.out.print("#" + " ");
                                        }else{
                                        System.out.print((char)ch +" ");
					ch --;
                                }
				
				
				}
			}

		

                        
                        ch = 64+row;
                        System.out.println();
                }
        }
}

