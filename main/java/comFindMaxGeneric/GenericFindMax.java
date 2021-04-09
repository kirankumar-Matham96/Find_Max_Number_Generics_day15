package comFindMaxGeneric;

public class GenericFindMax<E extends Comparable> {
    E x, y, z;
    
    public GenericFindMax(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
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
}
