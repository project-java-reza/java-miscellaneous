package enigma.camp.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateAndSortCollectionApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(6);
        numbers.add(7);

        Collection<Integer> result = removeAndDuplicateAndSort(numbers);
        for (var number : result) {
            System.out.println(number);
        }
    }

    public static Collection<Integer> removeAndDuplicateAndSort(Collection<Integer> collection) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(collection);
        List<Integer> sortedUniqueNumbers = new ArrayList<>(uniqueNumbers);
        sortedUniqueNumbers.sort(Integer::compareTo);
        return sortedUniqueNumbers;
    }
}
