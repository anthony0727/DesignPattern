public class ProxyImage implements Image {
    private RealImage realImg;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImg == null) {
            realImg = new RealImage(fileName);
        }

        realImg.display();
    }
}
