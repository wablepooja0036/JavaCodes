/*7. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
4 c 2 a
3 b 1
2 a
1
Rows = 5
5 d 3 b 1
4 c 2 a
3 b 1
2 a
*/
import java.util.Scanner;
class Demo7{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of Rows:");
		int row = sc.nextInt();
		int num= row;
		int ch=96+row;
		for(int i=1;i<=row;i++){
		for(int j=1;j<=row-i+1;j++){
			if(j%2==1){
				System.out.print(num--+" ");
				ch--;
			}
			else{
				System.out.print((char)ch--+" ");
				num--;
			}
		}
		num=row-i;
		ch=96+num;
		System.out.println();
		}
	}
	
}
