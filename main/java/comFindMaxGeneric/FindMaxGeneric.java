package comFindMaxGeneric;

public class FindMaxGeneric {
    
    public static <E extends Comparable> void testMax(E a, E b, E c, E d){
        GenericFindMax.findMax(a, b, c, d);
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to FindMaxNumber Program!");
        
        FindMaxGeneric.testMax(5, 6, 2, 4);
        FindMaxGeneric.testMax(5.6, 6.2, 2.0, 3.9);
        FindMaxGeneric.testMax("Pomegranate", "Pineapple", "Papaya", "Peach");
    }
}
