package proxy;

import static util.PrintUtil.println;

// The real object that the proxy represents.
public class ImageReal implements Image {

    private String filename;

    public ImageReal(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        println("Displaying " + filename);
    }

    private void loadFromDisk(String filename) {
        println("Loading " + filename);
    }
}
