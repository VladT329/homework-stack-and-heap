import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
       Integer[] value = new Integer[]{3,4};
       changeValue(value);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
        ///опять ничего
    }
    public static void changeValue (Integer[] value) {
        value = new Integer[]{99};
    }
}
