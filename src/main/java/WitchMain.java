import java.util.HashMap;
import java.util.Map;

public class WitchMain {
    public static void main(String[] args) {
        for (Witch witch : Witch.values()) {
            System.out.println(witch + ": " + witch.getDescription());

            Map<String,Witch> witchMap = new HashMap<>();
            witchMap.putIfAbsent("1", Witch.NORTH);
            witchMap.putIfAbsent("1", Witch.NORTH);
            System.out.println();
        }
    }
}
