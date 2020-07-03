public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image img = new ProxyImage("test.jpg");
        img.display();
        System.out.println(img.hashCode());
        img.display();
        System.out.println(img.hashCode());
    }
}
