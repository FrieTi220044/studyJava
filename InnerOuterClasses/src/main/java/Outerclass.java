public class Outerclass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey there!");

        class LocalInnerClass {
            String localInnerClassVar = "Heres's Timo";

            public void printLocalInnerVar() {
                System.out.println(localInnerClassVar);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerVar();
    }


    public static class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("Whats up from the Inner Class!");
        }
    }
}



