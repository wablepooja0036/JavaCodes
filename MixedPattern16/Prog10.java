class SquareOfOddDigits {
    public static void main(String[] args) {
        
        
        long number = 45685632l;

        long reversedNumber = 0;
        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            
	    number /= 10;
        }
	
        System.out.print("Output: "+reversedNumber);
	System.out.print("Square of odd :");
        while (number != 0) {
            long digit = number % 10;
            if (digit % 2 != 0) {
                long square = digit * digit;
                System.out.print(square + ", ");
            }
            number /= 10;
        }
       
    }
}
