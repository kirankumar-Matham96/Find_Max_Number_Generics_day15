package comFindMaxGeneric;

public class FindMaxGeneric {
    
    public static Integer findMaxInteger(Integer x, Integer y, Integer z) {
        if(x.compareTo(y) > 0 ){
            if(x.compareTo(z) > 0) {
                return x;
            }
        }
        if(y.compareTo(z) > 0){
            return y;
        }
        return z;
    }
    
    public static Double findMaxFloat(Double x, Double y, Double z) {
        if(x.compareTo(y) > 0 ){
            if(x.compareTo(z) > 0) {
                return x;
            }
        }
        if(y.compareTo(z) > 0){
            return y;
        }
        return z;
    }
    
    public static String findBiggestString(String str1, String str2, String str3) {
        if(str1.compareTo(str2) > 0 ){
            if(str1.compareTo(str3) > 0) {
                return str1;
            }
        }
        if(str2.compareTo(str3) > 0){
            return str2;
        }
        return str3;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to FindMaxNumber Program!");
    }
}
