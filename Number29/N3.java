import java.io.*;
class Num3{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number:");
		int sum =0;
		int num = Integer.parseInt(br.readLine());
		
		for(int i =1;i<num;i++){
			if(num%i==0){
			sum+=i;
			}
		}
			if(sum >= num){
				System.out.println("Number is Deficient");
			}else{
				 System.out.println("Number is not Deficient");
			}
		}

}	



