import java.util.Scanner;

class Square9{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter no. of rows : ");
                int row = sc.nextInt();

                int num = 2;
                for(int i = 1; i <= row; i++){

                        for(int j = 1; j <= row; j++){

                                if(j%2!=0){
					if(j==1){
                                        System.out.print(num +" ");
                                }
				else if(j ==2 || j==3){
					System.out.print(num*3);
				}else{
					System.out.print(num *6);
				}
				}else{										if(j==1|| j==2){
                                       System.out.print(++num +" ");                                         }
                                       else if(j ==3){
                                        System.out.print(3*3);
                                }else{
                                        System.out.print(num *2);
                                     
                                }
				}
				
			}
                                num++;
                        }
                        System.out.println();
                }
        }

