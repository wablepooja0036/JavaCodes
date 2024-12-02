import java.util.Scanner;
class Diamond1{
	public static void main(String []args){
		Scanner Sc =new Scanner(System.in);

		
		System.out.println("enter the Number of rows:");
		int row =Sc.nextInt();
		int col=-1;

		for(int i =1;i<row*2;i++){
	
			if(i<=row){
			col=col+2;
			for(int sp=1;sp<=row-i;sp++){
				System.out.print(" "+"\t");
			}
			for(int j=1;j<=col;j++){
					System.out.print("*"+"\t");
			}
			}		
			else{
				col-=2;
			for(int sp=1;sp<=i-row;sp++){
				System.out.print(" "+"\t");
			}
			for(int j=1;j<=col;j++){
					System.out.print("*"+"\t");
			}
			}
			System.out.println();
		}
	}
}	

			

