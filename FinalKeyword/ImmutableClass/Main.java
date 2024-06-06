package FinalKeyword.ImmutableClass;

public class Main {
    public static void main(String args[])
    {
        Person person = new Person("John",21);
        System.out.println(person);

        Person updatedPerson = new Person("John",22);
        System.out.println(updatedPerson);
    }
}
