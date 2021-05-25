package ro.ase.csie.cts.g1094.dp.flyweight;

import java.util.ArrayList;

public class HotelGallery {

	ArrayList<GalleryImage> gallery = new ArrayList<>();
	
	void displayImage(Seasons season) {
		GalleryFlyweight galleryFlyweight = GalleryFlyweightFactory.getGalleryFlyweight(season);
		
		for (GalleryImage img : gallery) {
			galleryFlyweight.display(img);
		}
	}
}
