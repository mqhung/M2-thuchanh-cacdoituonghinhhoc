public class Main {
    public static void main(String[] args) {
        //shape
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("blue", false);
        System.out.println(shape);

        //circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.18);
        System.out.println(circle);

        circle = new Circle("red", false, 3.18);
        System.out.println(circle);

        //rectangular
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("yellow", false, 28.4, 31.8);
        System.out.println(rectangle);

        //square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red", false, 31.28);
        System.out.println(square);
    }
}
