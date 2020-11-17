public class User
{
    String firstName;

    String lastName;

    int age;

    public

    User(){}

    User(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void show()
    {
        System.out.println(age);
    }

    void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    void setAge(int age)
    {
        if (age <= 0)
        { return; }

        this.age = age;
    }

    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    int getAge()
    {
        return age;
    }

    void method()
    {
        System.out.println("User::method");
    }
}
