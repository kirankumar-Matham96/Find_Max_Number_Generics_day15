package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxGenericTest {
    @Test
    public void givenThreeIntegers_FindsMaxAtFirstPosition_retunsTheSame() {
        FindMaxGeneric findMaxGeneric = new FindMaxGeneric();
        int max = findMaxGeneric.findMaxNumberAtFirstPosition(5,3,1);
        Assert.assertEquals(5,max);
    }
    
    @Test
    public void givenThreeIntegers_FindsMaxAtSecondPosition_retunsTheSame() {
        FindMaxGeneric findMaxGeneric = new FindMaxGeneric();
        int max = findMaxGeneric.findMaxNumberAtFirstPosition(3,5,1);
        Assert.assertEquals(5,max);
    }
}
