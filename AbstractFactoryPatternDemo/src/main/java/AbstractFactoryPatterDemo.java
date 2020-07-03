public class AbstractFactoryPatterDemo {
    public static void main(String[] args) {
        AbstractFactory f1 = FactoryProducer.getFactory(false);
        f1.getShape("rectangle").draw();
        f1.getShape("square").draw();

        AbstractFactory f2 = FactoryProducer.getFactory(true);
        f2.getShape("rectangle").draw();
        f2.getShape("square").draw();
    }
}
