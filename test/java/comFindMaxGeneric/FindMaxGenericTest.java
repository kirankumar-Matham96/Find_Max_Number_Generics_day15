package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxGenericTest {
    @Test
    public void givenThreeIntegers_FindsMaxAtFirstPosition_retunsTheSame() {
        int max = FindMaxGeneric.findMaxInteger(5,3,1);
        Assert.assertEquals(5,max);
    }
    
    @Test
    public void givenThreeIntegers_FindsMaxAtSecondPosition_retunsTheSame() {
        int max = FindMaxGeneric.findMaxInteger(3,5,1);
        Assert.assertEquals(5,max);
    }
    
    @Test
    public void givenThreeIntegers_FindsMaxAtThirdPosition_retunsTheSame() {
        int max = FindMaxGeneric.findMaxInteger(3,1,5);
        Assert.assertEquals(5,max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtFirstPosition_returnsTheSame() {
        Double max = FindMaxGeneric.findMaxFloat(9.2,5.1,2.9);
        Assert.assertEquals((Double) 9.2,max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtSecondPosition_returnsTheSame() {
        Double max = FindMaxGeneric.findMaxFloat(9.2,5.1,2.9);
        Assert.assertEquals((Double) 9.2,max);
    }
    
    @Test
    public void givenThreeFloatValues_FindMaxAtThirdPosition_returnsTheSame() {
        Double max = FindMaxGeneric.findMaxFloat(9.2,5.1,2.9);
        Assert.assertEquals((Double) 9.2,max);
    }
    
    @Test
    public void givenThreeStrings_FindBiggestString_returnsTheSame() {
        String str = FindMaxGeneric.findBiggestString("Banana","Apple","Peach");
        Assert.assertEquals("Peach",str);
    }
}
