 class AccessModifier {

        private int privateVar = 25;


        double defaultVar = 30.0;


        protected boolean protectedVar = true;


        public String publicVar = "Hello";


        public int getPrivateVar() {
            return privateVar;
        }

        double getDefaultVar() {
            return defaultVar;
        }


        protected boolean getProtectedVar() {
            return protectedVar;
        }


        public String getPublicVar() {
            return publicVar;
        }
    }

    class SubclassDemo extends AccessModifier {

        void displayProtectedVar() {
            boolean value = getProtectedVar();
            System.out.println("ProtectedVar in Subclass: " + value);
        }
    }

    class l32 {
        public static void main(String[] args) {

            AccessModifier demo = new AccessModifier();

            System.out.println("PrivateVar: " + demo.getPrivateVar());
            System.out.println("DefaultVar: " + demo.getDefaultVar());
            System.out.println("ProtectedVar: " + demo.getProtectedVar());
            System.out.println("PublicVar: " + demo.getPublicVar());


            SubclassDemo subDemo = new SubclassDemo();


            subDemo.displayProtectedVar();
        }
    }

