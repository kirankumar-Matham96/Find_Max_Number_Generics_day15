package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxGenericTest {
    @Test
    public void givenThreeIntegers_FindsMaxAtFirstPosition_retunsTheSame() {
        FindMaxGeneric findMaxGeneric = new FindMaxGeneric();
        int max = findMaxGeneric.findMaxNumberAtFirstPosition();
        Assert.assertEquals(5,max);
    }
}
