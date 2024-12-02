class StaticDemo14{
        int x=10;
        static int y =20;
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In Run ");
	}


        public static void main(String[]args){
                StaticDemo14 obj= new StaticDemo14();

                System.out.println(obj.x);
                System.out.println(y);
		obj.fun();
		obj.run();
        }
}
