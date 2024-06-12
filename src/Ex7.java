import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        Integer[] value = {3,2};
        changeValue(value);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
    }
    ///опять ничего не поменялось. Что я делаю не так?

    public static void changeValue (Integer[] value){
        value = new Integer[] {1,2};
    }
}
