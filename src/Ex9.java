public class Ex9 {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        Person.changePerson(person);
        System.out.println("person = " + person);
    }
}
