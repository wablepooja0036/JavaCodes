class InputDemo9{
        void methodFun(){

                System.out.println("In fun Function");
        }
        void methodGun(){
                System.out.println("In Gun function");
        }
        void methodRun(){
                System.out.println("In Run Function");
        }
        public static void main(String []args){
                System.out.println("In main Method");
                
		InputDemo9 obj = new InputDemo9();
		obj.methodFun();
                obj.methodGun();
                obj.methodRun();

        }
}
