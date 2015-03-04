import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import java.util.Calendar;



public class UpdateThread extends Thread {

	private newGUI gui;
	private String start;
	
	public UpdateThread(newGUI gui, String start) {
		this.gui = gui;
		this.start = start;
	}	
	
	public void run() {
		String l = "     ";
		String d = "  ";
		String a = "  ";
		String s = "  ";
		
		////Gets the search result for the first station.
		ArrayList<Station> searchStations = new ArrayList<Station>();
		searchStations.addAll(Parser.getStationsFromURL(start));
		Station startStation = searchStations.get(0);
		
		Lines lines = Parser.getStationResults(startStation);
		Line line;
		
		//get info from five lines
		for (int i = 0;i<5;i ++){
			line = lines.getLines().get(i);
			l = l + line.getLine() + "\n     ";
			d = d + line.getTowards() + "\n  ";
			Calendar time = line.getDepTime();
			a = a + String.format("%02d:%02d",time.get(time.HOUR_OF_DAY),time.get(time.MINUTE)) + "\n  ";
			s = s + line.getDepTimeDeviation()+"\n  ";

			
		}

		gui.Update(l,d,a,s);
	}
	
}

