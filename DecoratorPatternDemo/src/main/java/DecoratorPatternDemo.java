public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(circle);
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
