package ro.ase.csie.cts.g1094.dp.flyweight;

public class GalleryFlyweight implements GalleryFlyweightInterface {

	Seasons season;
	
	
	public GalleryFlyweight(Seasons season) {
		super();
		this.season = season;
	}


	@Override
	public void display(GalleryImage galleryImage) {

		System.out.println("Displaying " + galleryImage.bitmapName + " from " + season.toString());
		
	}

}
