public class Burrito extends Object {
    private final Spiciness degree;

    private Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito{" +
                "degree=" + degree +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(Spiciness.NOT));
    }
}






