public class Main {

    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("aaa","ccc",30);
        user.method();
        Admin admin = new Admin("name","lastname",20,"specialty");
        admin.method();
        admin.getSpecialty();
        admin.methodAdmin();
        User admin1 = new Admin();
        String b = admin.getFirstName();
        System.out.println(b);

    }

}
