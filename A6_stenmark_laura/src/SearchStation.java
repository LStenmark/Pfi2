import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import java.util.ArrayList;
 

public class SearchStation extends Thread {

	private GUI gui; 
	private String search; 
	
	public SearchStation (GUI gui, String search) {
		this.gui = gui;
		this.search = search;
	}	
	public void run() {
		//Creates an arraylist with searchstations		
		ArrayList<Station> searchStations = new ArrayList<Station>();
		//Uses the Skanetrafikens API to search for stations and convert them to an arraylist.
		searchStations.addAll(Parser.getStationsFromURL(search));
		
		
		String s = "";
		//Replace unnesseccary tokens
		s = searchStations.toString();
		s = s.replace("["," ");
		s = s.replace("]"," ");
		s = s.replaceAll(",", "\n");
				
		
		gui.UpdateResult(s);
	}
	
}
