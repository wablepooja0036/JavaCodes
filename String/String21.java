class StringDemo21{

        public static void main(String[] args){

                String str1 = "Core2web";               //String literal (SCP)

                System.out.println(System.identityHashCode(str1));

                String str2 = "Core2web";               //String literal (SCP

                System.out.println(System.identityHashCode(str2));

                String str3 = new String("Core2web");   //Object type string or new string (Heap)

                System.out.println(System.identityHashCode(str3));

                String str4 = new String("Core2web");   //Object type string or new string (Heap)

                System.out.println(System.identityHashCode(str4));

        }
}
