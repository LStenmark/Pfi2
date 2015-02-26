import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Station;

import java.util.ArrayList;
 

public class SearchJourney extends Thread {

	private GUI gui; 
	private String start; 
	private String end; 
	
	public SearchJourney (GUI gui, String start, String end) {
		this.gui = gui;
		this.start = start;
		this.end = end;
	}	
	public void run() {
		ArrayList<Station> searchStationsS = new ArrayList<Station>();
		searchStationsS.addAll(Parser.getStationsFromURL(start));
		Station startStation = searchStationsS.get(0);
		
		ArrayList<Station> searchStationsE = new ArrayList<Station>();
		searchStationsE.addAll(Parser.getStationsFromURL(end));
		Station endStation = searchStationsE.get(0);		
		
		//Gets the search result for the first searchanswer.
		String searchURL = Constants.getURL(startStation.getStationNbr(),endStation.getStationNbr(),1);
		Journeys journeys = Parser.getJourneys(searchURL);
		
		Journey j = journeys.getJourneys().get(0);
		String s = j.getLineTypeName() + " fr�n " + j.getStartStation() + "\nTill " + j.getEndStation() + "\nResan b�rjar " + j.getDepDateTime().getTime() + "\nAnkomst " + j.getArrDateTime().getTime() + "\nTid till avg�ng �r " + j.getTimeToDeparture() + " minuter." + "\nResans tid �r " + j.getTravelMinutes() + " minuter. \nAntalet byten �r " + j.getNoOfChanges() + "\nAntalet zoner �r " + j.getNoOfZones() + "\nAnkomstf�rsening �r " + j.getDepTimeDeviation() + " minuter.\nAvg�ngsf�rsening �r " + j.getArrTimeDeviation() + " minuter.\nF�rsta f�rds�ttet �r med " +j.getLineOnFirstJourney(); 
		
		gui.UpdateJourney(s);
	}
	
}

