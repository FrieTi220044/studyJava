public class Main {
    public static void main(String[] args) {
        String [] words = {"Die", "Stimmer", "werden", "lauter", "!"};

        for (String word : words) {
            word = "Bla Bla";
            System.out.println(word);
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
