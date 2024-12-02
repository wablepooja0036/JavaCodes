import java.util.Scanner;
class Patt3{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number Of Rows");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++){
			int  ch =64+row;
			int num=1;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print((char)ch-- +" ");
				}else{
					System.out.print(num++ +" ");
				}
			}

			System.out.println();
		}
	}
}

				

