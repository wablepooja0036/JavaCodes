import java.util.Scanner;
class Num1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
	        int num =sc.nextInt();
		int sum =0;
		for(int i=1;i<num;i++){
			if(num%i==0){
			 sum =sum+i;
			}
		}
		if(sum==num){
			System.out.println(num+": Is Perfect Number");
		}else{
			System.out.println(num+": Is not Perfect Number");
		}
	}
}
			
