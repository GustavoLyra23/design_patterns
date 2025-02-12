package proxy;

import static util.PrintUtil.println;

public class ProxyImage implements Image {

    private String filename;
    private ImageReal imageReal;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (imageReal == null) {
            println("Loading a new image");
            imageReal = new ImageReal(filename);
        } else {
            println("Image already loaded");
            imageReal.display();
        }

    }
}
