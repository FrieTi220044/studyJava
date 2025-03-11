public class Cat implements Printable{
    public String name;
    public int age;


    @Override
    public String print(String suffix) {
        return "Meow" + suffix;
    }
}
