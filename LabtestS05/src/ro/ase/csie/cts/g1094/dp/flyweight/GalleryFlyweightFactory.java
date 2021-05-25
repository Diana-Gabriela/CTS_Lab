package ro.ase.csie.cts.g1094.dp.flyweight;

import java.util.HashMap;

public class GalleryFlyweightFactory {

	
	
	static HashMap<Seasons, GalleryFlyweight> map = new HashMap<>();
	
	static {
		map.put(Seasons.SPRING, new GalleryFlyweight(Seasons.SPRING));
		map.put(Seasons.SUMMER, new GalleryFlyweight(Seasons.SUMMER));
		map.put(Seasons.AUTUMN, new GalleryFlyweight(Seasons.AUTUMN));
		map.put(Seasons.WINTER, new GalleryFlyweight(Seasons.WINTER));

	}
	
	static GalleryFlyweight getGalleryFlyweight(Seasons season) {
		return map.get(season);
	}
	
}
