public class TestResizeable {
    public static void main(String[] args) {

        // Circle...
        Circle circle = new Circle(1);
        System.out.println("Before: " + circle);
        circle.resize(50);
        System.out.println("After: " + circle);

        // Rectangle...
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Before: ");
        System.out.println(rectangle);

        rectangle.resize(100);
        System.out.println("After: ");
        System.out.println(rectangle);
    }
}
