package skyWars;

import java.util.ArrayList;

public class Sky {
	
	private int number;
	static final int NUMBER_OF_ROWS = 4;
	static ArrayList <Row> theSky = new ArrayList <Row> ();
	
	public Sky(int NUMBER_OF_ROWS) {
		for(int loop = 0; loop < NUMBER_OF_ROWS; loop++) {
			Sky.theSky.add(new Row(loop));
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
