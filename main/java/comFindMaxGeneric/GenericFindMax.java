package comFindMaxGeneric;

public class GenericFindMax<E extends Comparable> {
    E a,b,c,d;
    
    public static <E extends Comparable> E findMax(E a, E b, E c, E d) {

        E max = a;
    
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        if(d.compareTo(max) > 0){
            max = d;
        }
        printMax(max);
        return max;
    }
    
    private static <E extends Comparable> void printMax(E max) {
        System.out.println(max);
    }
}
