package Main;

import Model.File;
import Model.Music;
import Model.StreamProgressInfo;

public class main {

	public static void main (String args[]) {
		File file = new File("Test", 24, 20);
		Music music = new Music ("You", "Favorit", 10, 24);
		
		 StreamProgressInfo fileProgressInfo = new StreamProgressInfo(file);
	     StreamProgressInfo musicProgressInfo = new StreamProgressInfo(music);
	     
	     System.out.println("File progress : "  + fileProgressInfo.CalculateCurrentPercent());
	     System.out.println("Music Progress : " + musicProgressInfo.CalculateCurrentPercent());
	}
}
