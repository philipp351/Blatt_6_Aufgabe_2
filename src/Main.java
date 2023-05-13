import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.BYTES);      // Size in Byte
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);       // Size in Bit
        System.out.println(Integer.TYPE + "\n");

        System.out.println(Integer.rotateLeft(100,5));
        System.out.println(Integer.rotateLeft(-100,5));
        System.out.println(Integer.bitCount(100));
        System.out.println(Integer.bitCount(-100));
        System.out.println(Integer.numberOfTrailingZeros(100));
        System.out.println(Integer.numberOfTrailingZeros(-100));
        System.out.println(Integer.reverse(100));
        System.out.println(Integer.reverse(-100) + "\n");


        System.out.println(fak(5));
    }
    // Fakultätsfunktion n!
    public static BigInteger fak (int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = x; i != 1; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}