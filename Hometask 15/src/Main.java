import java.util.*;

/**
 * Created by vig on 1/21/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lists Sorting:");
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("lorem");
        stringArray.add("ipsum");
        stringArray.add("dolor");
        stringArray.add("sit");
        stringArray.add("amet");
        Collections.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });
        System.out.println(stringArray);
        Collections.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareToIgnoreCase(t1);
            }
        });
        System.out.println(stringArray);
        Collections.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareToIgnoreCase(s);
            }
        });
        System.out.println(stringArray);

        //тут начинаются карты
        System.out.println("----------------------------------------------------------");
        System.out.println("Maps Sorting:");
        Map<Integer,String> stringArrayMap = new HashMap<>();
        stringArrayMap.put(1,"lorem");
        stringArrayMap.put(2,"ipsum");
        stringArrayMap.put(3,"dolor");
        stringArrayMap.put(4,"sit");
        stringArrayMap.put(5,"amet");

        SortingForMaps mapSort = new SortingForMaps();
        System.out.println(mapSort.sortByStringLength(stringArrayMap));
        System.out.println(mapSort.sortByAlphabetOrder(stringArrayMap));
        System.out.println(mapSort.sortByAlphabetDisorder(stringArrayMap));
        //также можно было использовать TreeMap и несколько карт с отдельными компараторами,
        // но в условии была 1 карта, поэтому так.


        //здесь начинаются потоки
        //потоки, листы
        System.out.println("----------------------------------------------------------");
        System.out.println("Sorting streams for lists:");
        StreamSortingForLists streamListSort = new StreamSortingForLists();
        System.out.println(streamListSort.sortByLengthStream(stringArray));
        System.out.println(streamListSort.sortByAlphabetOrder(stringArray));
        System.out.println(streamListSort.sortByAlphabetDisorder(stringArray));


        //потоки,карты
        System.out.println("----------------------------------------------------------");
        System.out.println("Sorting streams for maps:");
        StreamSortingForMaps streamMapSort = new StreamSortingForMaps();
        System.out.println(streamMapSort.sortByStringLengthStream(stringArrayMap));
        System.out.println(streamMapSort.sortByAlphabetOrderStream(stringArrayMap));
        System.out.println(streamMapSort.sortByAlphabetDisorderStream(stringArrayMap));
    }
}
