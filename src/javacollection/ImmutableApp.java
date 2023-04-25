package javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("EKo");
        mutable.add("Kurniawan");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Eko", "Kurniawan", "Khannedy");
        System.out.println(elements);
    }
}
