import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by vig on 1/22/17.
 */
public class StreamSortingForMaps {
    public Map<Integer, String> sortByStringLengthStream(Map<Integer, String> map ){
        Map<Integer, String> resultMap = new LinkedHashMap<>();
        Stream<Map.Entry<Integer, String>> st = map.entrySet().stream();
        Comparator<Map.Entry<Integer, String>> byLength = (o1, o2) ->
                (o1.getValue().length()) - ( o2.getValue().length());
        st.sorted(byLength)
                .forEach(e ->resultMap.put(e.getKey(),e.getValue()));

        return resultMap;
    }

    public Map<Integer, String> sortByAlphabetOrderStream(Map<Integer, String> map ){
        Map<Integer, String> resultMap = new LinkedHashMap<>();
        Stream<Map.Entry<Integer, String>> st = map.entrySet().stream();

        st.sorted(Comparator.comparing(e -> e.getValue()))
                .forEach(e ->resultMap.put(e.getKey(),e.getValue()));

        return resultMap;
    }
    public Map<Integer, String> sortByAlphabetDisorderStream(Map<Integer, String> map ){
        Map<Integer, String> resultMap = new LinkedHashMap<>();
        Stream<Map.Entry<Integer, String>> st = map.entrySet().stream();

        Comparator<Map.Entry<Integer, String>> reverse = (o1, o2) ->
                (o2.getValue()).compareToIgnoreCase( o1.getValue() );
        st.sorted(reverse)
                .forEach(e ->resultMap.put(e.getKey(),e.getValue()));

        return resultMap;
    }
}
