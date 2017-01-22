import java.util.*;

/**
 * Created by vig on 1/22/17.
 */
public class SortingForMaps {
    public Map<Integer, String> sortByAlphabetOrder(Map<Integer, String> map ){
        List<Map.Entry<Integer, String>> list =
                new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<Integer, String>>()
        {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareToIgnoreCase( o2.getValue() );
            }
        } );

        Map<Integer, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list)
        {
            resultMap.put(entry.getKey(), entry.getValue());
        }
        return resultMap;
    }

    public Map<Integer, String> sortByAlphabetDisorder(Map<Integer, String> map ){
        List<Map.Entry<Integer, String>> list =
                new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<Integer, String>>()
        {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2)
            {
                return (o2.getValue()).compareToIgnoreCase( o1.getValue() );
            }
        } );

        Map<Integer, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list)
        {
            resultMap.put(entry.getKey(), entry.getValue());
        }
        return resultMap;
    }

    public Map<Integer, String> sortByStringLength(Map<Integer, String> map ){
        List<Map.Entry<Integer, String>> list =
                new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<Integer, String>>()
        {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2)
            {
                return (o1.getValue().length()) - ( o2.getValue().length());
            }
        } );

        Map<Integer, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list)
        {
            resultMap.put(entry.getKey(), entry.getValue());
        }
        return resultMap;
    }
}
