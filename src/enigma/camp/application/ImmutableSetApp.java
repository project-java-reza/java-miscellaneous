package enigma.camp.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Ummu");

        Set<String> mutable = new HashSet<>();
        mutable.add("Ummu");
        mutable.add("Sa'adah");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Ummu", "Sa'adah");
        set.remove("Ummu"); // UnsupportedOperationException
    }
}
