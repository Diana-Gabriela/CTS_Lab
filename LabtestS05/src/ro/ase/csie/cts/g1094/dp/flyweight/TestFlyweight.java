package ro.ase.csie.cts.g1094.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {


		HotelGallery hotelGallery1 = new HotelGallery();
		HotelGallery hotelGallery2 = new HotelGallery();

		hotelGallery1.gallery.add(new GalleryImage("beach"));
		hotelGallery1.gallery.add(new GalleryImage("mountain"));
		hotelGallery1.gallery.add(new GalleryImage("field"));

		hotelGallery2.gallery.add(new GalleryImage("flower"));
		hotelGallery2.gallery.add(new GalleryImage("bird"));
		hotelGallery2.gallery.add(new GalleryImage("beach"));

		hotelGallery1.displayImage(Seasons.SPRING);
		
		hotelGallery2.displayImage(Seasons.WINTER);
	}

}
