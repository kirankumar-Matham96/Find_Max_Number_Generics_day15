package comFindMaxGeneric;

public class FindMaxGeneric {
    
    public static Integer findMaxInteger(Integer x, Integer y, Integer z) {
        if(x.compareTo(y) == 1 && x.compareTo(z) == 1) {
            return x;
        }
        if(y.compareTo(x) == 1 && y.compareTo(z) == 1) {
            return y;
        }
        if(z.compareTo(x) == 1 && z.compareTo(y) == 1){
            return z;
        }
        return 0;
    }
    
    public static Double findMaxFloat(Double x, Double y, Double z){
        if(x.compareTo(y) == 1 && x.compareTo(z) == 1) {
            return x;
        }
        if(y.compareTo(x) == 1 && y.compareTo(z) == 1) {
            return y;
        }
        if(z.compareTo(x) == 1 && z.compareTo(y) == 1){
            return z;
        }
        return 0.0;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to FindMaxNumber Program!");
    }
}
