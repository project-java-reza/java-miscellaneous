package enigma.camp.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Rizqi");
        mutable.add("Reza");
        mutable.add("Ardiansyah");
        List<String> immutable = Collections.unmodifiableList(mutable); // sudah tidak bisa diubah

        List<String> elements = List.of("Rizqi", "Reza", "Ardiansyah"); // immutable dan lebih singkat
    }
}
