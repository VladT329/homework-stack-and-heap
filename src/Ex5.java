public class Ex5 {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);
        /// Плохо понял. Полагаю, что параметр value внутри метода changeValue -
        /// - это новый отдельный параметр, который виден только внутри метода changeValue???
    }

    public static void changeValue (int value){
        value = 22;
    }
}
