package static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "skyactiv 3" + "\n");
        System.out.println(car1);

        Car car2 = new Car("Mazda 6"," skyactiv 6");
        System.out.println(car2);

    }
}
