/*9. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
19 17 15 13
11 9 7
5 3
1
Rows = 5
29 27 25 23 21
19 17 15 13
11 9 7
5 3
1
*/
import java.util.Scanner;
class Demo9{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                 System.out.println("enter the number of Rows:");
		int row = sc.nextInt();
                int num= row*(row+1)-1;
               
                for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i+1;j++){
                      
                                System.out.print(num--+" ");
				num--;
                        
                    
                }
                
                System.out.println();
                }
        }

}

