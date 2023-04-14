import java.util.HashSet;
import java.util.Set;

public class UniqueValues {
    public static void uniqueValues() {
        String unique = "Alex9800";
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < unique.length(); i++) {
            char a = unique.charAt(i);
            if (!uniqueChars.contains(a)) {
                uniqueChars.add(a);
                System.out.println(a);
            }
        }
    }
}
