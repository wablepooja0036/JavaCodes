import java.util.*;
class Fact22{
        public static void main(String []args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the Number:");
                int fact=1;
                int num = sc.nextInt();
                for(int i =1;i<=num;i++){
                        fact =fact*i;
                }
                System.out.println("factorial Number is:"+fact);

        }
}

