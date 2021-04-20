package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FindMaxGenericTest {

    @Test
    public void givenIntegers_FindsMax_returnsTheSame() {
        ArrayList<Integer> integerList = new ArrayList<>();
        int resultInteger;
        
        integerList.add(5);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        
        GenericFindMax genericFindMaxInteger = new GenericFindMax(integerList);
        resultInteger = (int) genericFindMaxInteger.findMaxNonString();
        Assert.assertEquals(5, resultInteger);
    }
    
    @Test
    public void givenDoubles_FindsMax_returnsTheSame() {
        ArrayList<Double> doubleList = new ArrayList<>();
        double resultDouble;
        
        doubleList.add(2.1);
        doubleList.add(1.5);
        doubleList.add(5.6);
        doubleList.add(3.9);
        doubleList.add(4.0);
    
        GenericFindMax genericFindMaxDouble = new GenericFindMax(doubleList);
        resultDouble = (double) genericFindMaxDouble.findMaxNonString();
        Assert.assertEquals(5.6,resultDouble,0.1);
    }
    
    /**
     * if multiple max strings found, then returns all of them.
     */
    @Test
    public void givenStringsList_FindsMax_returnsTheSame() {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> resultStringList;
        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Peach");
        stringList.add("Mango");
        stringList.add("Papaya");
        stringList.add("Grape");
    
        GenericFindMax genericFindMaxString= new GenericFindMax(stringList);
        resultStringList = genericFindMaxString.findMaxString();
        Assert.assertEquals("Banana",resultStringList.get(1));
        Assert.assertEquals("Papaya",resultStringList.get(0));
    }
}
