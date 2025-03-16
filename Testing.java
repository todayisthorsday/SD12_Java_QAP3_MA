public class Testing {
    public static void main(String[] args) {
        Person p = new Person("Bob", 46, "M");
        Student s = new Student("Louise", 9, "F", "HS95129", 3.0);
        Teacher t = new Teacher("Ms. LaBonz", 56, "F", "Earth Science", 50000);
        CollegeStudent cs = new CollegeStudent("Marshmallow", 23, "F", "MCB123", 4.0, 3, "Gender Studies");

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }
}