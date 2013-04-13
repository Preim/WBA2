package com.w3schools;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.w3schools.Chefkoch.Rezept.Zubereitung;
import com.w3schools.Chefkoch.Rezept.Zutatenliste.Zutat;

public class Main {
	
	private static final String xml_file = "/Users/Patrick/Git/WBA2/git/Phase1/src/Aufgabe3.xml";
	private static JAXBContext context;
	private static Chefkoch chefkoch;
	private static Unmarshaller um;
	private static Marshaller m;
	
	public static void main(String [] args)throws Exception{
		
		context = JAXBContext.newInstance(Chefkoch.class);
		um = context.createUnmarshaller();
		m = context.createMarshaller();
		
		chefkoch = (Chefkoch) um.unmarshal(new FileReader(xml_file));
		Scanner in = new Scanner(System.in);
		Scanner in_string = new Scanner(System.in);
		int eingabe = 1;
		
		while (eingabe != 0){
			System.out.println("\nWas wollen Sie machen?:\n 1 für eintragen\n 2 für ausgeben\n 0 für exit");
			eingabe = in.nextInt();
			if(eingabe == 1){
				System.out.println("In welches Rezept soll die Nachricht eingetragen werden?\n RezeptID: ");
					int rezept = in.nextInt();
						System.out.println("Kommentar eingeben:");
							String nachricht = in_string.nextLine();
								eingabe(rezept-1,nachricht);
			}
			if(eingabe == 2) ausgabe();
		}
	    	    
  }
	
	private static void ausgabe()throws Exception{	    	    
	    
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
	    	System.out.println("\n Kommentare:");
	    	for(int k=0;k<chefkoch.getRezept().get(i).getKommentare().getNachricht().size();k++){
	    		System.out.println(chefkoch.getRezept().get(0).getKommentare().getNachricht().get(k));
	    	}
	    	
	    }
		
	}
	
	private static void eingabe(int rezeptnr,String nachricht)throws Exception{
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		if(chefkoch.getRezept().get(rezeptnr).getKommentare().getNachricht().get(0).equals("")){
//			chefkoch.getRezept().get(rezeptnr).getKommentare().getNachricht().add(0,nachricht);
//		}else{
		chefkoch.getRezept().get(rezeptnr).getKommentare().getNachricht().add(nachricht);
//		}

		m.marshal(chefkoch, new File(xml_file));
		
	}
}
