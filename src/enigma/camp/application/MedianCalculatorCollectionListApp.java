package enigma.camp.application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianCalculatorCollectionListApp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5, 6);
        double median = cariMedian(numbers);
        System.out.println("Median: " + median);
    }

    public static double cariMedian(List<Integer> number) {
        if (number.isEmpty()) {
            return 0.0;
        }

        Collections.sort(number);
        int size = number.size();

        if (size % 2 == 0) {
            int mid1 = number.get((size - 1)/2);
            int mid2 = number.get(size / 2);
            return (double) (mid1 + mid2) / 2.0;
        } else {
            return (double) number.get(size / 2);
        }
    }
}
