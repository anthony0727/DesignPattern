public class SingleObject {
    // belongs to SingleObject class
    private static SingleObject instance = new SingleObject();

    // cannot be instantiated
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello");
    }
}
