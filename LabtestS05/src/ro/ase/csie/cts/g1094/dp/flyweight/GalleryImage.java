package ro.ase.csie.cts.g1094.dp.flyweight;
public class GalleryImage {
    String bitmapName;
    byte[] pixels;

    public GalleryImage(String fileName) {
        this.bitmapName = fileName;
        this.pixels = new byte[1000];
    }
}