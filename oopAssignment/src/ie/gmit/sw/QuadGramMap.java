package ie.gmit.sw;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QuadGramMap {
	
	public static final int GRAM_SIZE = 4;
	public static Map<String,Double> map = new ConcurrentHashMap<String,Double>();
	
	public static void fillQGMap() {

		FileParser fp = new FileParser();
		
		try {
			map=fp.Parse("4grams.txt");
			} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
