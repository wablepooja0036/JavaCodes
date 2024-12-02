import java.util.Scanner;
class Fibbonicci6{
        public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num =sc.nextInt();
        int firstNum=0;
	int SecondNum =1;
	
        for(int i =1;i<=num;++i){
                System.out.print(firstNum +"\t");
                int next =firstNum+SecondNum;
		firstNum =SecondNum;
		SecondNum=next;

        
        }
        }
}
