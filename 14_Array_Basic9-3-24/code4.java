import java.util.*;
class code4{
	public static void main(String[] arg){
		int [] arr=new int[]{10,20,30,40,50,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int sum=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
			
		}

		for(int i=0;i<size;i++){
			if(arr[i]%2==1){
			sum=sum+arr[i];
			}
		}
			System.out.println("Sum of odd elements: "+sum);
			

	}
}
