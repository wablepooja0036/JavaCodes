import java.util.Scanner;
class Demo8{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Size of Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Array size is :"+arr.length);
		for(int i=0;i<arr.length;i++){
		System.out.println("Enter array element");
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter Array element");
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]);
                }
	}
}

