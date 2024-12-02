/*8. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
4 3 2 1
C B A
2 1
A
Rows = 5
5 4 3 2 1
D C B A
3 2 1
B A
1*/
import java.util.Scanner;
class Demo8{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
             	System.out.println("Enter the number of Rows:");
	     	int row = sc.nextInt();
                int num= row;
                int ch=64+row;
                for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i+1;j++){
                        if(i%2==1){
                                System.out.print(num--+" ");
                                
                        }
                        else{
                                System.out.print((char)ch--+" ");
                                
                        }
                }
                num=row-i;
                ch=64+num;
                System.out.println();
                }
        }

}
