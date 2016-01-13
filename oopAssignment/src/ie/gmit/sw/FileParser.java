package ie.gmit.sw;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class FileParser {

	public Map<String, Double>Parse(String file) throws NumberFormatException, IOException{
		
		Map<String,Double> temp = new ConcurrentHashMap<String,Double>();
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(new FileInputStream("4grams.txt")));
		
		String text;
		
		while((text = br.readLine())!= null){
			
			//split the text and store string and double in the hashmap
			String[] split = text.split(" ");
			double key = Double.parseDouble(split[1]);
			temp.put(split[0], key);
			
		}//while
		br.close();
		return temp;


	}


}
