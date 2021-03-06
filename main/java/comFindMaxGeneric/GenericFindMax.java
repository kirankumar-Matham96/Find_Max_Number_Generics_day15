package comFindMaxGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Generic class that takes any type of data for finding max
 *
 * @param <E>
 */
public class GenericFindMax<E extends Comparable> {
    
    ArrayList<E> genericList;
    Map<String, Integer> stringMap = new HashMap<>();
    
    /**
     * Constructor
     * @param list
     */
    public GenericFindMax(ArrayList<E> list) {
        
        this.genericList = list;
        
        if(this.genericList.get(0).getClass().getSimpleName().equals("String")) {
            for(int i = 0; i < this.genericList.size(); i++) {
                stringMap.put((String) this.genericList.get(i), this.genericList.get(i).toString().length());
            }
            findMaxString();
        } else {
            findMaxNonString();
        }
    }
    
    /**
     * finds largest string/strings in the list and returns it/list (for strings only)
     *
     * @return
     */
    public ArrayList<String> findMaxString() {
        
        Iterator<Map.Entry<String, Integer>> stringMapIterator = stringMap.entrySet().iterator();
        Map.Entry<String, Integer> entry = stringMapIterator.next();
        int max = entry.getValue();
        ArrayList<String> maxStringList = new ArrayList<>();
        
        while(stringMapIterator.hasNext()) {
            Map.Entry<String, Integer> entry1 = stringMapIterator.next();
            if(max <= entry1.getValue()) {
                if(max < entry1.getValue()) {
                    max = entry1.getValue();//change max
                    maxStringList = new ArrayList<>();//new list
                    maxStringList.add(entry1.getKey());//add key = given string
                } else {
                    maxStringList.add(entry1.getKey());//add key = length of similar length string
                }
            }
        }
        return maxStringList;
    }
    
    /**
     * Finds max in the list and returns it (for non string elements only)
     *
     * @param <E> generic
     * @return
     */
    public <E extends Comparable> E findMaxNonString() {
        
        E max = (E) this.genericList.get(0);
        for(int i = 1; i < genericList.size(); i++) {
            if(this.genericList.get(i).compareTo(max) > 0) {
                max = (E) this.genericList.get(i);
            }
        }
        System.out.println(max);
        return max;
    }
}
