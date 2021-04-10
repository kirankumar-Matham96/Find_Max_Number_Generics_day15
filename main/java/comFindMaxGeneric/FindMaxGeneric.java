package comFindMaxGeneric;

public class FindMaxGeneric {
    
    public static <E extends Comparable> E testMax(E a,E b,E c, E d){
        return GenericFindMax.findMax(a, b, c, d);
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to FindMaxNumber Program!");
        
        System.out.println(FindMaxGeneric.testMax(5, 6, 2, 4));
        System.out.println(FindMaxGeneric.testMax(5.6, 6.2, 2.0, 3.9));
        System.out.println(FindMaxGeneric.testMax("Pomegranate", "Pineapple", "Papaya", "Peach"));
    }
}
