public abstract class Burger implements Item {
//    when abstract class implements interface,
//    abstract class can omit interface's method
//    but the subclass must implement them

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
