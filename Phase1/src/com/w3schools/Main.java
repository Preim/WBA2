package com.w3schools;

import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.w3schools.Chefkoch.Rezept.Zubereitung;
import com.w3schools.Chefkoch.Rezept.Zutatenliste.Zutat;

public class Main {
	
	private static final String xml_file = "/Users/Patrick/Git/WBA2/git/Phase1/src/Aufgabe3.xml";
	
	
	public static void main(String [] args)throws Exception{
		
		JAXBContext context = JAXBContext.newInstance(Chefkoch.class);
	    Unmarshaller um = context.createUnmarshaller();	    
	    Chefkoch chefkoch = (Chefkoch) um.unmarshal(new FileReader(xml_file));
	    
	    for(int i = 0; i<chefkoch.getRezept().size();i++){
	    	System.out.println("\nRezeptnummer: "+chefkoch.getRezept().get(i).id);
	    	System.out.println(chefkoch.getRezept().get(i).info.getUeberschrift());
	    	System.out.println(chefkoch.getRezept().get(i).info.getBild());
	    	System.out.println("\n----Zutaten----\n");
	    	for(int j = 0;j<chefkoch.getRezept().get(i).getZutatenliste().getZutat().size();j++){
	    		List<Zutat> zutaten = chefkoch.getRezept().get(i).getZutatenliste().getZutat();
	    		System.out.println(zutaten.get(j).getBezeichnung()+": "+zutaten.get(j).getMenge()+" "+zutaten.get(j).getEinheit());
	    	}
	    	System.out.println("\n----Zubereitung----\n");
	    	Zubereitung zb = chefkoch.getRezept().get(i).getZubereitung();
	    	System.out.println("Zubereitung: "+zb.getAnleitung());
	    	System.out.println("Schwierigkeitsgrad: "+ zb.getSchwierigkeitsgrad());
	    	System.out.println("Brennwert: "+zb.getBrennwert());
	    	System.out.println("Arbeitszeit: "+zb.getArbeitszeit());
	    	
	    }
  }
}
