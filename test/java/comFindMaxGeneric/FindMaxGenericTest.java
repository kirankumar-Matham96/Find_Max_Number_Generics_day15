package comFindMaxGeneric;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FindMaxGenericTest {
    
    //generic test method
    @Test
    public void givenThreeIntegers_FindsMaxAtFirstPosition_retunsTheSame() {
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        resultList.add(5);
        GenericFindMax genericFindMax = new GenericFindMax(integerList);
        resultList = (ArrayList<Integer>) genericFindMax.findMaxNonString();
        int result = resultList.get(0);
        Assert.assertEquals(5, result);
    }

//        @Test
//        public void givenThreeIntegers_FindsMaxAtSecondPosition_retunsTheSame() {
//            int max = GenericFindMax.findMax(3, 5, 4, 1);
//            Assert.assertEquals(5, max);
//        }
//
//        @Test
//        public void givenThreeIntegers_FindsMaxAtThirdPosition_retunsTheSame() {
//            int max = GenericFindMax.findMax(3, 1, 5, 4);
//            Assert.assertEquals(5, max);
//        }
//
//        @Test
//        public void givenThreeIntegers_FindsMaxAtFourthPosition_retunsTheSame() {
//            int max = GenericFindMax.findMax(3, 1, 4, 5);
//            Assert.assertEquals(5, max);
//        }
//
//        @Test
//        public void givenThreeFloatValues_FindMaxAtFirstPosition_returnsTheSame() {
//            Double max = GenericFindMax.findMax(9.2, 5.1, 3.5, 2.9);
//            Assert.assertEquals((Double) 9.2, max);
//        }
//
//        @Test
//        public void givenThreeFloatValues_FindMaxAtSecondPosition_returnsTheSame() {
//            Double max = GenericFindMax.findMax(5.1, 9.2, 3.5, 2.9);
//            Assert.assertEquals((Double) 9.2, max);
//        }
//
//        @Test
//        public void givenThreeFloatValues_FindMaxAtThirdPosition_returnsTheSame() {
//            Double max = GenericFindMax.findMax(5.1, 2.9, 9.2, 3.5);
//            Assert.assertEquals((Double) 9.2, max);
//        }
//
//        @Test
//        public void givenThreeFloatValues_FindMaxAtFourthPosition_returnsTheSame() {
//            Double max = GenericFindMax.findMax(5.1, 2.9, 3.5, 9.2);
//            Assert.assertEquals((Double) 9.2, max);
//        }
//
//        @Test
//        public void givenThreeStrings_FindMaxAtTheFirstPosition_returnsTheSame() {
//            String str = GenericFindMax.findMax("Peach", "Apple", "Banana", "Grape");
//            Assert.assertEquals("Peach", str);
//        }
//
//        @Test
//        public void givenThreeStrings_FindMaxAtTheSecondPosition_returnsTheSame() {
//            String str = GenericFindMax.findMax("Apple", "Peach", "Banana", "Grape");
//            Assert.assertEquals("Peach", str);
//        }
//
//        @Test
//        public void givenThreeStrings_FindMaxThirdPosition_returnsTheSame() {
//            String str = GenericFindMax.findMax("Apple", "Banana", "Peach", "Grape");
//            Assert.assertEquals("Peach", str);
//        }
//
//        @Test
//        public void givenThreeStrings_FindMaxFourthPosition_returnsTheSame() {
//            String str = GenericFindMax.findMax("Apple", "Banana", "Grape", "Peach");
//            Assert.assertEquals("Peach", str);
//        }

}
