import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * Created by vig on 1/22/17.
 */
public class StreamSortingForLists {
    public ArrayList<String> sortByLengthStream(ArrayList<String> list) {
        Comparator<String> byLength = (o1, o2) ->
                (o1.length()) - ( o2.length());
        ArrayList<String> list2 = list.stream()
                .sorted(byLength)
                .collect(Collectors.toCollection(ArrayList::new));
        return list2;
    }
    public ArrayList<String> sortByAlphabetOrder(ArrayList<String> list) {

        ArrayList<String> list2 = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(ArrayList::new));
        return list2;
    }public ArrayList<String> sortByAlphabetDisorder(ArrayList<String> list) {

        ArrayList<String> list2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));
        return list2;
    }
}
