public class Person2 {
        String name;
        String surname;

        public Person2(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void person(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public static void changePerson(Person2 person2){
            person2 = new Person2("Ilya","Lagutenko");
            person2.setSurname("Lagutenko");
        }

        @Override
        public String toString() {
            return "Person2{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
