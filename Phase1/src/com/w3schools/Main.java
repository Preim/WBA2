package com.w3schools;

import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.w3schools.Chefkoch.Rezept;

public class Main {
	
	private static final String xml_file = "/Users/Patrick/Git/WBA2/git/Phase1/src/Aufgabe3.xml";
	
	
	public static void main(String [] args)throws Exception{
		
		Chefkoch cf = new Chefkoch();
		JAXBContext context = JAXBContext.newInstance(Chefkoch.class);
//		Marshaller m = context.createMarshaller();
//		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		m.marshal(cf, System.out);
		
		System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    Chefkoch bookstore2 = (Chefkoch) um.unmarshal(new FileReader(xml_file));
	    List<Rezept> list = bookstore2.rezept;
	    for (Chefkoch.Rezept rezept : list) {
	      System.out.println(rezept.info.getUeberschrift());
	    }

	}
}
