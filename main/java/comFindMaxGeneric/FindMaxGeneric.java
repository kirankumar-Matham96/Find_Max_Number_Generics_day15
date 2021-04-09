package comFindMaxGeneric;

public class FindMaxGeneric {
    
    public static <E extends Comparable> E findMax(E x, E y, E z) {
        if(x.compareTo(y) > 0) {
            if(x.compareTo(z) > 0) {
                return x;
            }
        }
        if(y.compareTo(z) > 0) {
            return y;
        }
        return z;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to FindMaxNumber Program!");
        System.out.println(FindMaxGeneric.findMax(5, 3, 1));
        System.out.println(FindMaxGeneric.findMax(5.5, 3.6, 1.4));
        System.out.println(FindMaxGeneric.findMax("Peach", "Banana", "Apple"));
    }
}
