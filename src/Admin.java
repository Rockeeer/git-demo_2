public class Admin extends User
{
    String specialty;

    public

    void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    String getSpecialty()
    {
        return specialty;
    }

    Admin(){}

    Admin(String firstName, String lastName, int age, String specialty)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialty = specialty;
    }

    void method()
    {
        System.out.println("Admin::method");
    }

    void methodAdmin()
    {
        System.out.println("method::Admin");
    }
}