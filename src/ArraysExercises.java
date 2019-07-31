import java.util.Arrays;

public class ArraysExercises {
    private static Person[] addPerson(Person[] people, Person human) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = human;
        return people;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] peeps = new Person[3];
        peeps[0] = new Person("Anthony");
        peeps[1] = new Person("Nicole");
        peeps[2] = new Person("Brandon");
//        Person[] people = {new Person("Anthony"), new Person("Nicole"), new Person("Brandon")};

        Person shiny = new Person("Alex");

//        for (Person person : peeps) {
//            System.out.println(person.getName());
//        }
//        System.out.println("+---+---+---+");
//        System.out.print("| ");

        peeps = addPerson(peeps, shiny);

        for (Person person : peeps) {
            System.out.println(person.getName());
        }
    }

}
