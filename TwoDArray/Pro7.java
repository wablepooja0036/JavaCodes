import java.util.Scanner;
class ArayDemo7{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the Array Elemnet");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Elemnt:");
		  for(int i =0;i<arr.length;i++){
                        System.out.println(arr[i]+" ");

                }
	}

}
