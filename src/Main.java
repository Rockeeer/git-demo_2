public class Main {

    public static void main(String[] args) {

        class User
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
        class Admin extends User
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
        class main
        {
            void main(){
                User user = new User();
                User user1 = new User("aaa","ccc",30);
                user.method();
                Admin admin = new Admin("name","lastname",20,"specialty");
                admin.method();
                admin.getSpecialty();
                admin.methodAdmin();
                User admin1 = new Admin();
                String b = admin.getFirstName();


            }
        }

    }

}
