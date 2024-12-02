class SwitchDemo16 {
    public static void main(String args[]) {
        float num = 2.0f; // Initializing the variable num with the value 2
        System.out.println("Before Switch");

        switch (num) {
            case 1.0:
                System.out.println("One"); // If num is 1, print "One"
                break;
            case 2.0:
                System.out.println("Two"); // If num is 2, print "Two"
                break;
            case 3.0:
                System.out.println("Three"); // If num is 3, print "Three"
                break;
            default:
                System.out.println("In Default State"); // If num doesn't match any case, print "In Default State"
        }

        System.out.println("After Switch");
    }
}
