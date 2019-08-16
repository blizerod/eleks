import java.util.function.BiConsumer;

public class Training {

    public static void main(String[] args) {
        met(WitchMain::print, "asa", "dsd");
    }

    public static void met(BiConsumer<String, String> biConsumer, String t, String u ) {
        biConsumer.accept(t, u);
    }
}
