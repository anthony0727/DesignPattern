public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        System.out.println(object.hashCode());
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
        System.out.println(object.hashCode());
    }
}
