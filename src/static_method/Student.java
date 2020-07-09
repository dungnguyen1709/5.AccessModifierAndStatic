package static_method;

public class Student {
    private int rollo;
    private String name;
    private static String collage = "BBDIT";

    Student(int r, String n) {
        rollo = r;
        name = n;
    }

    static void change() {
        collage = "CODEGYM";
    }

    void display() {
        System.out.println(rollo + " " + name + " " + collage);
    }
}
