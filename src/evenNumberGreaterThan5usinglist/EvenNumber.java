package evenNumberGreaterThan5usinglist;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(15);
        list.add(16);
        list.add(19);
        list.add(18);
        list.add(20);
        System.out.println(list);
        // Even Number > 5 [6,12,16]
        System.out.println(list.stream().filter(y ->(y % 2 ==0 && y > 5)).collect(Collectors.toList()));
    }
}
