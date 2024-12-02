import java.util.*;

class Prime1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int count =0;
		for (int i = 2; i <= num / 2; i++) { 
			if (num % i == 0) {
				System.out.println(num+ ": Number is Prime ");		
				count ++;
				break;
			       	
			}
		}
			if(count ==0){
				System.out.println(num+": Number is not Prime");
				
			}

		}
	}

