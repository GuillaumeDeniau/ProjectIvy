
package example;

import org.apache.commons.lang.WordUtils;
import java.util.List;
import java.io.*;
import com.opencsv.*;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                     + " : " + WordUtils.capitalizeFully(message));
	int monmax =0;
	try{
		CSVReader reader = new CSVReader(new FileReader("data.csv"));
		List<String[]> myEntries = reader.readAll();
		for (String[] ligne : myEntries){
			for(String element : ligne){
				int intElem = Integer.parseInt(element);
				System.out.println("Nombre lu : "+ element);
				if(intElem>monmax){
					monmax = intElem;
				}
			}
		}
		System.out.println("Maximum : "+ monmax);
	}
	catch (IOException e){
		System.out.println("Problème de lecture de fichiers");
	}
    }
}
        
