package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxGenericTest {
    @Test
    public void givenThreeIntegers_FindsMaxAtFirstPosition_retunsTheSame() {
        int max = GenericFindMax.findMax(5, 3, 1);
        Assert.assertEquals(5, max);
    }
    
    @Test
    public void givenThreeIntegers_FindsMaxAtSecondPosition_retunsTheSame() {
        int max = GenericFindMax.findMax(3, 5, 1);
        Assert.assertEquals(5, max);
    }
    
    @Test
    public void givenThreeIntegers_FindsMaxAtThirdPosition_retunsTheSame() {
        int max = GenericFindMax.findMax(3, 1, 5);
        Assert.assertEquals(5, max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtFirstPosition_returnsTheSame() {
        Double max = GenericFindMax.findMax(9.2, 5.1, 2.9);
        Assert.assertEquals((Double) 9.2, max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtSecondPosition_returnsTheSame() {
        Double max = GenericFindMax.findMax( 5.1, 9.2,2.9);
        Assert.assertEquals((Double) 9.2, max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtThirdPosition_returnsTheSame() {
        Double max = GenericFindMax.findMax( 5.1, 2.9,9.2);
        Assert.assertEquals((Double) 9.2, max);
    }
    
    @Test
    public void givenThreeStrings_FindMaxAtTheFirstPosition_returnsTheSame() {
        String str = GenericFindMax.findMax("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", str);
    }
    
    @Test
    public void givenThreeStrings_FindMaxAtTheSecondPosition_returnsTheSame() {
        String str = GenericFindMax.findMax("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", str);
    }
    
    @Test
    public void givenThreeStrings_FindThirdPosition_returnsTheSame() {
        String str = GenericFindMax.findMax("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", str);
    }
}
