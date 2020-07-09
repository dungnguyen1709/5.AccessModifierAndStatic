package static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(8895,"Huy");
        Student s2 = new Student(1709,"Dung");
        Student s3 = new Student(1911,"Trung");

        s1.display();
        s2.display();
        s3.display();
    }
}
