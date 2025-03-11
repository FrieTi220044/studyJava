public class MainClass {
    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.heyThere();

        /* -- This is how you create an object from the Inner class when its not static!!!
        (You have to create an object of the Outerclass to create an object of the Inner Class.)
        Outerclass.InnerClass inner = outer.new InnerClass();
        inner.whatsUp();
        */

        Outerclass.InnerClass inner = new Outerclass.InnerClass();
        inner.whatsUp();
    }
}
