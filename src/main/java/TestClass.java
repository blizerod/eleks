public class TestClass {
    public static void main(String[] args) {
        Shrubbery[] shrubberies = Shrubbery.values();
        for (Shrubbery s : shrubberies) {
            System.out.println(s.ordinal());
        }
        String name = Shrubbery.CRAWLING.name();
        System.out.println(name);

    }
}
