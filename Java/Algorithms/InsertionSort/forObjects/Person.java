public class Person {
    private  String firstName;
    private  String lastName;
    private  int age;

    public Person(String first, String last, int a)
    {
        firstName = first;
        lastName = last;
        age = a;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void displayPerson()
    {
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }
}