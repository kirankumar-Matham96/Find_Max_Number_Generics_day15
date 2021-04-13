package comFindMaxGeneric;

import java.util.ArrayList;

public class FindMaxGenericSimulator {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to FindMaxNumber Program!");
        
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        new GenericFindMax<>(integerList);
    
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(10.5);
        doubleList.add(4.5);
        doubleList.add(5.5);
        doubleList.add(6.5);
        new GenericFindMax<>(doubleList);
    
        stringList.add("Apple");
        stringList.add("Pineapple");
        stringList.add("Pomegranate");
        stringList.add("Etanargemop");
        stringList.add("Mango");
        stringList.add("Tamarind");
        stringList.add("Banana");
        stringList.add("Dates");
        new GenericFindMax<>(stringList);
    }
}
