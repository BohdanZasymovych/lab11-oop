package edu.ucu.ua.Image;

public class ProxyImage implements MyImage{
    private String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}
